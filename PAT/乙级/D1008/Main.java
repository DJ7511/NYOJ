package D1008;

/**
 * 1008 数组元素循环右移问题 （20 分）
 *
 * 一个数组A中存有N（>0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（≥0）个位置，即将A中的数据由（A​0​​A​1​​⋯A​N−1​​）变换为（A​N−M​​⋯A​N−1​​A​0​​A​1​​⋯A​N−M−1​​）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
 *
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] inputInt = new int[N];
        int[] outputInt = new int[N];

        for (int i = 0; i < N; i++) {
            inputInt[i] = sc.nextInt();
        }

        sc.close();

        for (int i = N - 1; i >= 0; i--) {
            outputInt[(i + M) % N] = inputInt[i];
        }

        System.out.print(outputInt[0]);
        for (int i = 1; i < N; i++) {
            System.out.print(" " + outputInt[i]);
        }
    }
}