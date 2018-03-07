/**
 * 1004. 成绩排名 (20)
 * 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 * 
 * 输入格式：每个测试输入包含1个测试用例，格式为
 *  第1行：正整数n
 *  第2行：第1个学生的姓名 学号 成绩
 *  第3行：第2个学生的姓名 学号 成绩
 *  ... ... ...
 *  第n+1行：第n个学生的姓名 学号 成绩
 *  其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
 *  
 *  输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
 *  
 *  输入样例：
 *  3
 *  Joe Math990112 89
 *  Mike CS991301 100
 *  Mary EE990830 95
 *  输出样例：
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