package D1003;

/***
 *
 * 1003 我要通过！ （20 分）
 *
 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
 *
 * 得到“答案正确”的条件是：
 *
 *     字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
 *     任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 *     如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 *
 * 现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 *
 * a中A的个数 * （b中A的个数+1） = c中A的个数 + a中A的个数
 * a中A的个数 * （PT中间A的个数） = c中A的个数 + a中A的个数
 * PT中间必须要有A
 */

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static boolean keyzero(String str) {
        boolean p = false;
        boolean a = false;
        boolean t = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'P') {
                p = true;
            }
            if (c == 'A') {
                a = true;
            }
            if (c == 'T') {
                t = true;
            }
        }
        if (p && a && t) {
            return true;
        }
        return false;
    }

    public static boolean keyone(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'P' && c != 'A' && c != 'T') {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static boolean keytwo(String str) {
        int p = str.indexOf('P');
        int t = str.indexOf('T');

        String pre = str.substring(0, p);
        String mid = str.substring(p + 1, t);
        String end = str.substring(t + 1, str.length());

        if (pre.length() * mid.length() == end.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int inputInt = sc.nextInt();
        String[] inputString = new String[inputInt];

        for (int i = 0; i < inputString.length; i++) {
            String str = sc.next();
            inputString[i] = str;
        }

        sc.close();

        for (int i = 0; i < inputString.length; i++) {
            String str = inputString[i];
            if (keyzero(str) && keyone(str) && keytwo(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}