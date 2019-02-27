package D1011;

/**
 * 1011 A+B 和 C （15 分）
 * <p>
 * 给定区间 [−2​31​​,2​31​​] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 * <p>
 * 输入格式：
 * 输入第 1 行给出正整数 T (≤10)，是测试用例的个数。随后给出 T 组测试用例，每组占一行，顺序给出 A、B 和 C。整数间以空格分隔。
 * <p>
 * 输出格式：
 * 对每组测试用例，在一行中输出 Case #X: true 如果 A+B>C，否则输出 Case #X: false，其中 X 是测试用例的编号（从 1 开始）。
 * <p>
 * 输入样例：
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * <p>
 * 输出样例：
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int total = 0;
    public static BigInteger a, b, c, sum;

    public static void main(String[] args) {
        total = sc.nextInt();
        String[] s1 = new String[total];
        for (int i = 0; i < total; i++) {
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            c = sc.nextBigInteger();
            sum = a.add(b);
            String s = "";
            if (sum.compareTo(c) == 1) {
                s = "Case #" + (i + 1) + ": true";
            } else {
                s = "Case #" + (i + 1) + ": false";
            }
            s1[i] = s;
        }
        sc.close();

        for (int i = 0; i < total; i++) {
            System.out.println(s1[i]);
        }
    }
}