/**
 * 	1002. 写出这个数 (20)
 *  读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * 	输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10^100。
 * 	输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。
 * 	输入样例：1234567890987654321123456789
 * 	输出样例：yi san wu
 * */

package one;

import java.util.Scanner;

public class D1002 {

	public static Scanner sc = new Scanner(System.in);
	public static int add = 0;
	public static String[] name = new String[] { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi" };

	public static String change(int n) {
		String s = String.valueOf(n);
		String u = "";
		for (int i = 0; i < s.length(); i++) {
			u += name[Integer.parseInt(String.valueOf(s.charAt(i)))];

			if (i != s.length() - 1) {
				u += " ";
			}
		}
		return u;
	}

	public static void main(String[] args) {
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			add += Integer.parseInt(String.valueOf(input.charAt(i)));
		}

		System.out.println(change(add));
	}
}