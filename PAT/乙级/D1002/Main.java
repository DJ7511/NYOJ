package D1002;

/**
 * 1002 写出这个数 （20 分）
 *
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * */

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int add = 0;
    public static String[] name = new String[]{"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi"};

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