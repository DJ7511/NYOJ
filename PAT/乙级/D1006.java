/**
 * 1006. ������ʽ������� (15)
 * ����������ĸB����ʾ���١�����ĸS��ʾ��ʮ�����á�12...n������ʾ��λ����n��<10����������ʽ�������һ��������3λ����������
 * ����234Ӧ�ñ����ΪBBSSS1234����Ϊ����2�����١���3����ʮ�����Լ���λ��4��
 * �����ʽ��ÿ�������������1����������������������n��<1000����
 * �����ʽ��ÿ���������������ռһ�У��ù涨�ĸ�ʽ���n��
 * ��������1��
 * 234
 * �������1��
 * BBSSS1234
 * ��������2��
 * 23
 * �������2��
 * SS123
 * 
 * */

package one;

import java.util.Scanner;

public class D1006 {
	public static Scanner sc = new Scanner(System.in);
	public static int input = 0;
	public static int a, b, c;

	public static void main(String[] args) {
		input = sc.nextInt();
		a = input / 100;
		b = (input - a * 100) / 10;
		c = (input - a * 100 - b * 10);
		for (int i = 0; i < a; i++) {
			System.out.print("B");
		}
		for (int i = 0; i < b; i++) {
			System.out.print("S");
		}
		for (int i = 1; i < c + 1; i++) {
			System.out.print(i);
		}
	}
}