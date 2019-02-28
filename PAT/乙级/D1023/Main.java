package D1023;
/**
 * 1023 组个最小数 （20 分）
 * <p>
 * 给定数字 0-9 各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意 0 不能做首位）。例如：给定两个 0，两个 1，三个 5，一个 8，我们得到的最小的数就是 10015558。
 * <p>
 * 现给定数字，请编写程序输出能够组成的最小的数。
 * 输入格式：
 * <p>
 * 输入在一行中给出 10 个非负整数，顺序表示我们拥有数字 0、数字 1、……数字 9 的个数。整数间用一个空格分隔。10 个数字的总个数不超过 50，且至少拥有 1 个非 0 的数字。
 * 输出格式：
 * <p>
 * 在一行中输出能够组成的最小的数。
 * 输入样例：
 * <p>
 * 2 2 0 0 0 3 0 0 1 0
 * <p>
 * 输出样例：
 * <p>
 * 10015558
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }

        boolean flag = true;

        for (int i = 1; i < 10; i++) {
            if (number[i] != 0) {
                for (int j = 0; j < number[i]; j++) {
                    System.out.print(i);

                    if (number[0] != 0 && flag == true) {
                        for (int k = 0; k < number[0]; k++) {
                            System.out.print(0);
                        }
                        flag = false;
                    }
                }
            }
        }
    }
}