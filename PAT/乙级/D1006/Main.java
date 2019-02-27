package D1006;

/**
 * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int input = 0;
    public static int a, b, c;

    public static void main(String[] args) {
        input = sc.nextInt();
        sc.close();
        a = input / 100;//百位
        b = (input - a * 100) / 10;//十位
        c = (input - a * 100 - b * 10);//个位
        for (int i = 0; i < a; i++) {
            System.out.print("B");
        }
        for (int i = 0; i < b; i++) {
            System.out.print("S");
        }
        for (int i = 1; i < c + 1; i++) {
            System.out.print(i);
        }
    }
}