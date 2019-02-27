package D1016;

import java.util.Scanner;

/**
 * 1016 部分A+B （15 分）
 * <p>
 * 正整数 A 的“D​A​​（为 1 位整数）部分”定义为由 A 中所有 D​A​​ 组成的新整数 P​A​​。例如：给定 A=3862767，D​A​​=6，则 A 的“6 部分”P​A​​ 是 66，因为 A 中有 2 个 6。
 * <p>
 * 现给定 A、D​A​​、B、D​B​​，请编写程序计算 P​A​​+P​B​​。
 * 输入格式：
 * <p>
 * 输入在一行中依次给出 A、D​A​​、B、D​B​​，中间以空格分隔，其中 0<A,B<10​10​​。
 * 输出格式：
 * <p>
 * 在一行中输出 P​A​​+P​B​​ 的值。
 * 输入样例 1：
 * <p>
 * 3862767 6 13530293 3
 * <p>
 * 输出样例 1：
 * <p>
 * 399
 * <p>
 * 输入样例 2：
 * <p>
 * 3862767 1 13530293 8
 * <p>
 * 输出样例 2：
 * <p>
 * 0
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputStrings = input.split(" ", 4);
        int countsame1 = 0;
        int countsame2 = 0;
        int pa = 0;
        int pb = 0;
        StringBuffer output1 = new StringBuffer("");
        StringBuffer output2 = new StringBuffer("");

        for (int i = 0; i < inputStrings[0].length(); i++) {
            if (inputStrings[0].charAt(i) == inputStrings[1].charAt(0)) {
                countsame1++;
            }
        }

        for (int i = 0; i < inputStrings[2].length(); i++) {
            if (inputStrings[2].charAt(i) == inputStrings[3].charAt(0)) {
                countsame2++;
            }
        }

        if (countsame1 == 0) {
            output1.append("0");
        } else {
            for (int i = 0; i < countsame1; i++) {
                output1.append(inputStrings[1]);
            }
        }
        pa = Integer.parseInt(output1.toString());

        if (countsame2 == 0) {
            output2.append("0");
        } else {
            for (int i = 0; i < countsame2; i++) {
                output2.append(inputStrings[3]);
            }
        }
        pb = Integer.parseInt(output2.toString());

        System.out.print(pa + pb);
    }
}