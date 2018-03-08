/**
 * 1011. A+B��C (15)
 * ��������[-231, 231]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��
 * �����ʽ��
 * �����1�и���������T(<=10)���ǲ��������ĸ�����������T�����������ÿ��ռһ�У�˳�����A��B��C���������Կո�ָ���
 * �����ʽ��
 * ��ÿ�������������һ���������Case #X: true�����A+B>C�����������Case #X: false��������X�ǲ��������ı�ţ���1��ʼ����
 * ����������
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * ���������
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