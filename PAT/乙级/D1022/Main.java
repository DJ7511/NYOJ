package D1022;
/**
 * 1022 D进制的A+B （20 分）
 * <p>
 * 输入两个非负 10 进制整数 A 和 B (≤2​30​​−1)，输出 A+B 的 D (1<D≤10)进制数。
 * 输入格式：
 * <p>
 * 输入在一行中依次给出 3 个整数 A、B 和 D。
 * 输出格式：
 * <p>
 * 输出 A+B 的 D 进制数。
 * 输入样例：
 * <p>
 * 123 456 8
 * <p>
 * 输出样例：
 * <p>
 * 1103
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int sum = a + b;
        StringBuffer out = new StringBuffer();
        int yushu = 0;

        while (sum >= d) {
            yushu = sum % d;
            sum /= d;
            out.append(yushu);
        }
        out.append(sum);

        for (int i = out.length() - 1; i >= 0; i--) {
            System.out.print(out.charAt(i));
        }
    }
}