package D1004;

/**
 * 1004 成绩排名 （20 分）
 * <p>
 * 读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
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