package D1019;
/**
 * 1019 数字黑洞 （20 分）
 * <p>
 * 给定任一个各位数字不完全相同的 4 位正整数，如果我们先把 4 个数字按非递增排序，再按非递减排序，然后用第 1 个数字减第 2 个数字，将得到一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的 6174，这个神奇的数字也叫 Kaprekar 常数。
 * <p>
 * 例如，我们从6767开始，将得到
 * <p>
 * 7766 - 6677 = 1089
 * 9810 - 0189 = 9621
 * 9621 - 1269 = 8352
 * 8532 - 2358 = 6174
 * 7641 - 1467 = 6174
 * ... ...
 * <p>
 * 现给定任意 4 位正整数，请编写程序演示到达黑洞的过程。
 * 输入格式：
 * <p>
 * 输入给出一个 (0,10​4​​) 区间内的正整数 N。
 * 输出格式：
 * <p>
 * 如果 N 的 4 位数字全相等，则在一行内输出 N - N = 0000；否则将计算的每一步在一行内输出，直到 6174 作为差出现，输出格式见样例。注意每个数字按 4 位数格式输出。
 * 输入样例 1：
 * <p>
 * 6767
 * <p>
 * 输出样例 1：
 * <p>
 * 7766 - 6677 = 1089
 * 9810 - 0189 = 9621
 * 9621 - 1269 = 8352
 * 8532 - 2358 = 6174
 * <p>
 * 输入样例 2：
 * <p>
 * 2222
 * <p>
 * 输出样例 2：
 * <p>
 * 2222 - 2222 = 0000
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = ds(x) - xs(x);
        if (ans == 0) {
            System.out.printf("%04d - %04d = %04d\n", ds(x), xs(x), ans);
        } else {
            int n;
            do {
                n = ds(x) - xs(x);
                System.out.printf("%04d - %04d = %04d\n", ds(x), xs(x), n);
                x = n;
            } while (n != 6174);
        }
    }

    public static int ds(int x) {
        int[] a = new int[4];
        a[0] = x / 1000;
        a[1] = x / 100 % 10;
        a[2] = x / 10 % 10;
        a[3] = x % 10;
        Arrays.sort(a);
        int sum = a[3] * 1000 + a[2] * 100 + a[1] * 10 + a[0];
        return sum;
    }

    public static int xs(int x) {
        int[] a = new int[4];
        a[0] = x / 1000;
        a[1] = x / 100 % 10;
        a[2] = x / 10 % 10;
        a[3] = x % 10;
        Arrays.sort(a);
        int sum = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
        return sum;
    }
}