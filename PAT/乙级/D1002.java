/**
 * 	1002. д������� (20)
 *  ����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�
 * 	�����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�����ﱣ֤nС��10^100��
 * 	�����ʽ����һ�������n�ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ���1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո�
 * 	����������1234567890987654321123456789
 * 	���������yi san wu
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