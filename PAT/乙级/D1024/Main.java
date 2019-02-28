package D1024;
/**
 * 1024 科学计数法 （20 分）
 * <p>
 * 科学计数法是科学家用来表示很大或很小的数字的一种方便的方法，其满足正则表达式 [+-][1-9].[0-9]+E[+-][0-9]+，即数字的整数部分只有 1 位，小数部分至少有 1 位，该数字及其指数部分的正负号即使对正数也必定明确给出。
 * <p>
 * 现以科学计数法的格式给出实数 A，请编写程序按普通数字表示法输出 A，并保证所有有效位都被保留。
 * 输入格式：
 * <p>
 * 每个输入包含 1 个测试用例，即一个以科学计数法表示的实数 A。该数字的存储长度不超过 9999 字节，且其指数的绝对值不超过 9999。
 * 输出格式：
 * <p>
 * 对每个测试用例，在一行中按普通数字表示法输出 A，并保证所有有效位都被保留，包括末尾的 0。
 * 输入样例 1：
 * <p>
 * +1.23400E-03
 * <p>
 * 输出样例 1：
 * <p>
 * 0.00123400
 * <p>
 * 输入样例 2：
 * <p>
 * -1.2E+10
 * <p>
 * 输出样例 2：
 * <p>
 * -12000000000
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int e = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'E') {
                e = i;
            }
        }
        int ex = Integer.parseInt(input.substring(e + 2, input.length()));

        if (input.charAt(e + 1) == '-') {//指数为负数
            if (input.charAt(0) == '-') {
                System.out.print("-");
            }
            System.out.print("0.");

            for (int i = 0; i < ex - 1; i++) {
                System.out.print("0");
            }
            System.out.print(input.charAt(1));
            for (int i = 3; i < e; i++) {
                System.out.print(input.charAt(i));
            }
        } else {//指数为正数
            if (ex < (e - 3)) {//指数<小数长度
                if (input.charAt(0) == '-') {
                    System.out.print("-");
                }
                System.out.print(input.charAt(1));
                for (int i = 3; i < (3 + ex); i++) {
                    System.out.print(input.charAt(i));
                }
                System.out.print(".");
                for (int i = 4 + ex; i < e; i++) {
                    System.out.print(input.charAt(i));
                }
            } else {//指数>小数长度
                if (input.charAt(0) == '-') {
                    System.out.print("-");
                }
                System.out.print(input.charAt(1));
                for (int i = 3; i < e; i++) {
                    System.out.print(input.charAt(i));
                }
                for (int i = 0; i < ex - (e - 3); i++) {
                    System.out.print(0);
                }
            }
        }

    }
}