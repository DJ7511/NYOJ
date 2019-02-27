package D1013;
/**
 * 1013 数素数 （20 分）
 * <p>
 * 令 P​i​​ 表示第 i 个素数。现任给两个正整数 M≤N≤10​4​​，请输出 P​M​​ 到 P​N​​ 的所有素数。
 * <p>
 * 输入格式：
 * 输入在一行中给出 M 和 N，其间以空格分隔。
 * <p>
 * 输出格式：
 * 输出从 P​M​​ 到 P​N​​ 的所有素数，每 10 个数字占 1 行，其间以空格分隔，但行末不得有多余空格。
 * <p>
 * 输入样例：
 * 5 27
 * <p>
 * 输出样例：
 * 11 13 17 19 23 29 31 37 41 43
 * 47 53 59 61 67 71 73 79 83 89
 * 97 101 103
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        int temp = (int) Math.sqrt((double) n);

        for (int i = 2; i <= temp; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int i = 2;
        int count = 0;

        while (count < N) {
            if (isPrime(i)) {
                count++;
                if (count > M - 1) {
                    System.out.print(i);
                    if ((count - M + 1) % 10 == 0) {
                        System.out.println();
                    } else if (count != N) {
                        System.out.print(" ");
                    }
                }
            }
            i++;
        }
    }
}