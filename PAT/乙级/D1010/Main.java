package D1010;

/**
 * 1010 一元多项式求导 （25 分）
 * <p>
 * 设计函数求一元多项式的导数。（注：x​n​​（n为整数）的一阶导数为nx​n−1​​。）
 * <p>
 * 输入格式:
 * 以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过 1000 的整数）。数字间以空格分隔。
 * <p>
 * 输出格式:
 * 以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。注意“零多项式”的指数和系数都是 0，但是表示为 0 0。
 * <p>
 * 输入样例:
 * 3 4 -5 2 6 1 -2 0
 * <p>
 * 输出样例:
 * 12 3 -10 1 6 0
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean print_blank = false;//判断是否继续加空格
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int ratio = sc.nextInt();
            int index = sc.nextInt();
            if (ratio * index != 0) {//输出导数多项式非零项的系数和指数
                if (print_blank) {
                    System.out.print(" ");
                } else {
                    print_blank = true;
                }
                System.out.print(ratio * index + " " + (index - 1));
            }
        }
        if (print_blank == false) {//如果到达这里print_blank还是false说明输出部分一次也没有运行，一定是输出0 0
            System.out.println("0 0");
        } //输出
        sc.close();
    }
}