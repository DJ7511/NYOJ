package D1018;
/**
 * 1018 锤子剪刀布 （20 分）
 * <p>
 * 大家应该都会玩“锤子剪刀布”的游戏：两人同时给出手势，胜负规则如图所示：
 * <p>
 * FigCJB.jpg
 * <p>
 * 现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
 * 输入格式：
 * <p>
 * 输入第 1 行给出正整数 N（≤10​5​​），即双方交锋的次数。随后 N 行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。C 代表“锤子”、J 代表“剪刀”、B 代表“布”，第 1 个字母代表甲方，第 2 个代表乙方，中间有 1 个空格。
 * 输出格式：
 * <p>
 * 输出第 1、2 行分别给出甲、乙的胜、平、负次数，数字间以 1 个空格分隔。第 3 行给出两个字母，分别代表甲、乙获胜次数最多的手势，中间有 1 个空格。如果解不唯一，则输出按字母序最小的解。
 * 输入样例：
 * <p>
 * 10
 * C J
 * J B
 * C B
 * B B
 * B C
 * C C
 * C B
 * J B
 * B C
 * J J
 * <p>
 * 输出样例：
 * <p>
 * 5 3 2
 * 2 3 5
 * B B
 */

import java.util.Scanner;

/**
 * 甲胜出
 * JIA YI
 * C   J
 * J   B
 * B   C
 * <p>
 * 乙胜出
 * JIA YI
 * C   B
 * J   C
 * B   J
 */

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int count1 = 0;//甲胜
        int count2 = 0;//平局
        int count3 = 0;//乙胜
        int c1 = 0;//甲C赢
        int j1 = 0;//甲J赢
        int b1 = 0;//甲B赢
        int c2 = 0;//乙C赢
        int j2 = 0;//乙J赢
        int b2 = 0;//乙B赢

        for (int i = 0; i < N; i++) {
            char input1 = sc.next().charAt(0);
            char input2 = sc.next().charAt(0);

            if (input1 == 'C' && input2 == 'J') {
                count1++;  //甲赢一次
                c1++;  //甲锤子赢一次
            } else if (input1 == 'C' && input2 == 'B') {
                count2++;
                b2++;
            } else if (input1 == 'J' && input2 == 'C') {
                count2++;
                c2++;
            } else if (input1 == 'J' && input2 == 'B') {
                count1++;
                j1++;
            } else if (input1 == 'B' && input2 == 'C') {
                count1++;
                b1++;
            } else if (input1 == 'B' && input2 == 'J') {
                count2++;
                j2++;
            } else count3++;
        }

        sc.close();

        System.out.println(count1 + " " + count2 + " " + count3);
        System.out.println(count3 + " " + count2 + " " + count1);

        if (j1 > c1 && j1 > b1) System.out.print("J ");
        if (b1 >= c1 && b1 >= j1) System.out.print("B ");
        if (c1 > b1 && c1 >= j1) System.out.print("C ");
        
        if (j2 > c2 && j2 > b2) System.out.print("J");
        if (b2 >= c2 && b2 >= j2) System.out.print("B");
        if (c2 > b2 && c2 >= j2) System.out.print("C");
    }
}