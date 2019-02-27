package D1014;

import java.util.Scanner;

/**
 * 1014 福尔摩斯的约会 （20 分）
 * <p>
 * 大侦探福尔摩斯接到一张奇怪的字条：我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm。大侦探很快就明白了，字条上奇怪的乱码实际上就是约会的时间星期四 14:04，因为前面两字符串中第 1 对相同的大写英文字母（大小写有区分）是第 4 个字母 D，代表星期四；第 2 对相同的字符是 E ，那是第 5 个英文字母，代表一天里的第 14 个钟头（于是一天的 0 点到 23 点由数字 0 到 9、以及大写字母 A 到 N 表示）；后面两字符串第 1 对相同的英文字母 s 出现在第 4 个位置（从 0 开始计数）上，代表第 4 分钟。现给定两对字符串，请帮助福尔摩斯解码得到约会的时间。
 * 输入格式：
 * <p>
 * 输入在 4 行中分别给出 4 个非空、不包含空格、且长度不超过 60 的字符串。
 * 输出格式：
 * <p>
 * 在一行中输出约会的时间，格式为 DAY HH:MM，其中 DAY 是某星期的 3 字符缩写，即 MON 表示星期一，TUE 表示星期二，WED 表示星期三，THU 表示星期四，FRI 表示星期五，SAT 表示星期六，SUN 表示星期日。题目输入保证每个测试存在唯一解。
 * 输入样例：
 * <p>
 * 3485djDkxh4hhGE
 * 2984akDfkkkkggEdsb
 * s&hgsfdk
 * d&Hyscvnm
 * <p>
 * 输出样例：
 * <p>
 * THU 14:04
 */

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();
        sc.close();

        char c1 = ' ';//星期
        char c2 = ' ';//时
        int c3 = ' ';//分

        int countsame = 0;//计时

        int minlength1 = input1.length() > input2.length() ? input2.length() : input1.length();
        for (int i = 0; i < minlength1; i++) {
            if (input1.charAt(i) == input2.charAt(i)) {
                countsame = i;
                c1 = input1.charAt(i);
                if ((int) c1 >= 65 && (int) c1 <= 71) {
                    break;
                }
            }
        }

        for (int i = countsame + 1; i < minlength1; i++) {
            if (input1.charAt(i) == input2.charAt(i)) {
                c2 = input1.charAt(i);
                break;
            }
        }

        int minlength2 = input3.length() > input4.length() ? input4.length() : input3.length();
        for (int i = 0; i < minlength2; i++) {
            if (input3.charAt(i) == input4.charAt(i)) {
                int minute = (int) input3.charAt(i);
                if ((minute >= 65 && minute <= 90) || (minute >= 97 && minute <= 122)) {
                    c3 = i;
                    break;
                }
            }
        }

        switch (c1) {
            case 'A':
                System.out.print("MON");
                break;
            case 'B':
                System.out.print("TUE");
                break;
            case 'C':
                System.out.print("WED");
                break;
            case 'D':
                System.out.print("THU");
                break;
            case 'E':
                System.out.print("FRI");
                break;
            case 'F':
                System.out.print("SAT");
                break;
            case 'G':
                System.out.print("SUN");
                break;
            default:
                break;
        }

        System.out.print(" ");

        if (c2 >= '0' && c2 <= '9') {
            System.out.print("0" + c2 + ":");
        } else if (c2 >= 'A' && c2 <= 'n') {
            switch (c2) {
                case 'A':
                    System.out.print("10:");
                    break;
                case 'B':
                    System.out.print("11:");
                    break;
                case 'C':
                    System.out.print("12:");
                    break;
                case 'D':
                    System.out.print("13:");
                    break;
                case 'E':
                    System.out.print("14:");
                    break;
                case 'F':
                    System.out.print("15:");
                    break;
                case 'G':
                    System.out.print("16:");
                    break;
                case 'H':
                    System.out.print("17:");
                    break;
                case 'I':
                    System.out.print("18:");
                    break;
                case 'J':
                    System.out.print("19:");
                    break;
                case 'K':
                    System.out.print("20:");
                    break;
                case 'L':
                    System.out.print("21:");
                    break;
                case 'M':
                    System.out.print("22:");
                    break;
                case 'N':
                    System.out.print("23:");
                    break;
            }
        }

        if (c3 >= 0 && c3 <= 9) {
            System.out.print("0");
            System.out.print(c3);
        }
    }
}