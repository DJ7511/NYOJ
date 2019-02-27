package D1012;

/**
 * 1012 数字分类 （20 分）
 * <p>
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
 * <p>
 * A​1​​ = 能被 5 整除的数字中所有偶数的和；
 * A​2​​ = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n​1​​−n​2​​+n​3​​−n​4​​⋯；
 * A​3​​ = 被 5 除后余 2 的数字的个数；
 * A​4​​ = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
 * A​5​​ = 被 5 除后余 4 的数字中最大数字。
 * <p>
 * 输入格式：
 * 每个输入包含 1 个测试用例。每个测试用例先给出一个不超过 1000 的正整数 N，随后给出 N 个不超过 1000 的待分类的正整数。数字间以空格分隔。
 * <p>
 * 输出格式：
 * 对给定的 N 个正整数，按题目要求计算 A​1​​~A​5​​ 并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出 N。
 * <p>
 * 输入样例 1：
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * <p>
 * 输出样例 1：
 * 30 11 2 9.7 9
 * <p>
 * 输入样例 2：
 * 8 1 2 4 5 6 7 9 16
 * <p>
 * 输出样例 2：
 * N 11 2 N 9
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] inputInt = new int[N];

        int temp1 = 0;//A1求和
        int flag2 = 1, temp2 = 0, flagg2 = 0;//A2标志及求和
        int flag3 = 0;//A3计数
        int flag4 = 0;//A4计数及存储求和
        float temp4 = 0;//A4存储
        int flag5 = -1;//A5存储

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            inputInt[i] = temp;

            if (temp % 5 == 0 && temp % 2 == 0) {//A1
                temp1 += temp;
            } else if (temp % 5 == 1) {//A2
                temp2 += flag2 * temp;
                flag2 *= -1;
                flagg2++;
            } else if (temp % 5 == 2) {//A3
                flag3++;
            } else if (temp % 5 == 3) {//A4
                temp4 += temp;
                flag4++;
            } else if (temp % 5 == 4) {//A5
                if (temp > flag5) {
                    flag5 = temp;
                }
            }
        }
        sc.close();

        System.out.print(temp1 == 0 ? "N" : temp1);//A1
        System.out.print(" ");
        System.out.print(flagg2 == 0 ? "N" : temp2);//A2
        System.out.print(" ");
        System.out.print(flag3 == 0 ? "N" : flag3);//A3
        System.out.print(" ");
        System.out.print(flag4 == 0 ? "N" : String.format("%.1f", (temp4 / flag4)));//A4
        System.out.print(" ");
        System.out.print(flag5 == -1 ? "N" : flag5);//A5
    }
}