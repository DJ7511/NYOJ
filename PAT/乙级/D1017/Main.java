package D1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1017 A除以B （20 分）
 * <p>
 * 本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立。
 * 输入格式：
 * <p>
 * 输入在一行中依次给出 A 和 B，中间以 1 空格分隔。
 * 输出格式：
 * <p>
 * 在一行中依次输出 Q 和 R，中间以 1 空格分隔。
 * 输入样例：
 * <p>
 * 123456789050987654321 7
 * <p>
 * 输出样例：
 * <p>
 * 17636684150141093474 3
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] input = in.readLine().split("\\s+");//将被除数A与除数B分开为两个字符串

        String A = input[0];//A
        int B = Integer.valueOf(input[1]);//提取B的数值
        StringBuilder result = new StringBuilder();//商结果，用来存储商的结果。当需要频繁改变一个字符串时，用StringBuilder效率更高

        int shang = 0, yu = 0;//存储每一位商和余数的值
        boolean zero = true;//用来标记第一次商非0的情况
        for (int i = 0; i < A.length(); i++)//对A字符串中的每位数字进行除以B的运算
        {
            shang = ((A.charAt(i) - '0') + yu * 10) / B;
            yu = ((A.charAt(i) - '0') + yu * 10) % B;
            if (zero == true)//如果之前的商都为0
            {
                if (shang == 0)//这次的商也为0，则跳过
                    continue;
                else {
                    zero = false;//这次的商不为0了，则改变标志
                }
            }
            result.append(shang);//将第一次非0商的之后的商都添加到商结果
        }

        if (result.length() == 0)//如果商结果什么都没有，就是0
            result.append(0);
        System.out.print(result + " " + yu);
    }
}
