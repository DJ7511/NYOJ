package D1007;

/**
 * 让我们定义d​n​​为：d​n​​=p​n+1​​−p​n​​，其中p​i​​是第i个素数。显然有d​1​​=1，且对于n>1有d​n​​是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 * <p>
 * 现给定任意正整数N(<10​5​​)，请计算不超过N的满足猜想的素数对的个数。
 * <p>
 * 分析样例输入，<20 的素数为 1 2 3 5 7 11 13 17 19
 * d1-7 分别为 1 1 2 2 4 2 2
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;
        if (n == 2)
            return true;

        int temp = (int) Math.sqrt((double) n);

        for (int i = 2; i <= temp; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int N = sc.nextInt();
        sc.close();
        int out = 0;//满足条件的素数

        for (int i = 3; i <= N - 2; i++) {
            if (isPrime(i) && isPrime(i + 2))
                out++;
        }
        System.out.println(out);
    }
}