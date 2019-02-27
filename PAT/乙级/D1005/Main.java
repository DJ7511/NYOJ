package D1005;

/**
 * 1005 继续(3n+1)猜想 （25 分）
 * <p>
 * 卡拉兹(Callatz)猜想已经在1001中给出了描述。在这个题目里，情况稍微有些复杂。
 * <p>
 * 当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。例如对 n=3 进行验证的时候，我们需要计算 3、5、8、4、2、1，则当我们对 n=5、8、4、2 进行验证的时候，就可以直接判定卡拉兹猜想的真伪，而不需要重复计算，因为这 4 个数已经在验证3的时候遇到过了，我们称 5、8、4、2 是被 3“覆盖”的数。我们称一个数列中的某个数 n 为“关键数”，如果 n 不能被数列中的其他数字所覆盖。
 * <p>
 * 现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。
 * <p>
 * 样例不在关键字即满足条件
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();//输入整数个数
        int[] inputInt = new int[n];//输入数组
        String coverString = "";//记录关键字
        int b[] = new int[n];//标记数组，输入样例是否在关键字中【1在0不在】

        //读入
        for (int i = 0; i < n; i++) {
            inputInt[i] = sc.nextInt();
        }

        sc.close();//关闭流

        Arrays.sort(inputInt);//排序

        //执行结构体
        for (int i = 0; i < n; i++) {
            int temp = inputInt[i];

            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                    coverString += temp + " ";//记录每次关键字
                } else {
                    temp = (3 * temp + 1) / 2;
                    coverString += temp + " ";//记录每次关键字
                }
            }
        }

        String[] a = coverString.split(" ");//切分关键字串进行操作

        for (int i = 0; i < inputInt.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Integer.parseInt(a[j]) == inputInt[i]) {//样例是否在关键字中
                    b[i] = 1;
                }
            }
        }

        //输出
        String outString = "";
        for (int i = n - 1; i > 0; i--) {
            if (b[i] == 0) {
                outString += inputInt[i] + " ";
            }
        }
        System.out.println(outString.substring(0, outString.length() - 1));//输出要求
    }
}