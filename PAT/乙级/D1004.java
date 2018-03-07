/**
 * 1004. �ɼ����� (20)
 * ����n��ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�
 * 
 * �����ʽ��ÿ�������������1��������������ʽΪ
 *  ��1�У�������n
 *  ��2�У���1��ѧ�������� ѧ�� �ɼ�
 *  ��3�У���2��ѧ�������� ѧ�� �ɼ�
 *  ... ... ...
 *  ��n+1�У���n��ѧ�������� ѧ�� �ɼ�
 *  ����������ѧ�ž�Ϊ������10���ַ����ַ������ɼ�Ϊ0��100֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�
 *  
 *  �����ʽ����ÿ�������������2�У���1���ǳɼ����ѧ����������ѧ�ţ���2���ǳɼ����ѧ����������ѧ�ţ��ַ�������1�ո�
 *  
 *  ����������
 *  3
 *  Joe Math990112 89
 *  Mike CS991301 100
 *  Mary EE990830 95
 *  ���������
 *  Mike CS991301
 *  Joe Math990112
 *  
 * */
package one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class D1004 {
	static class Student {
		String name;
		String num;
		int score;

		public Student(String name, String num, int score) {
			this.name = name;
			this.num = num;
			this.score = score;
		}

		@Override
		public String toString() {
			return name + " " + num;
		}

	}

	static class SortBySocre implements Comparator {
		public int compare(Object o1, Object o2) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			if (s1.score > s2.score)
				return -1;
			return 1;
		}
	}

	public static Scanner sc = new Scanner(System.in);
	public static int total = 0;
	public static List<Student> alst = new ArrayList<Student>();

	public static void main(String[] args) {
		total = sc.nextInt();
		for (int i = 0; i < total; i++) {
			String a = sc.next();
			String b = sc.next();
			int c = sc.nextInt();
			Student s = new Student(a, b, c);
			alst.add(s);
			s.toString();
		}

		Collections.sort(alst, new SortBySocre());

		System.out.println(alst.get(0).toString());
		System.out.println(alst.get(total - 1).toString());
	}
}