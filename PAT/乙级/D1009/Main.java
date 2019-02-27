package D1009;

/**
 * 1009 说反话 （20 分）
 * <p>
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 * 输入格式：
 * 测试输入包含一个测试用例，在一行内给出总长度不超过 80 的字符串。字符串由若干单词和若干空格组成，其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用 1 个空格分开，输入保证句子末尾没有多余的空格。
 * <p>
 * 输出格式：
 * 每个测试用例的输出占一行，输出倒序后的句子。
 * <p>
 * 输入样例：
 * Hello World Here I Come
 * <p>
 * 输出样例：
 * Come I Here World Hello
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        sc.close();
        System.out.print(inputs[inputs.length - 1]);
        for (int i = inputs.length - 2; i >= 0; i--) {
            System.out.print(" " + inputs[i]);
        }
    }
}