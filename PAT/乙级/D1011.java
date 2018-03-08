/**
 * 1011. A+B和C (15)
 * 给定区间[-231, 231]内的3个整数A、B和C，请判断A+B是否大于C。
 * 输入格式：
 * 输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
 * 输出格式：
 * 对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
 * 输入样例：
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * 输出样例：
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 * 
 * */
package one;

import java.math.BigInteger;
import java.util.Scanner;

public class D1011 {
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