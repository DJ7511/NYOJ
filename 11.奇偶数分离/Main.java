/*2017.2.1
 * JDK1.7
 * 奇偶数分离
 * */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();	//a组数据
		
		while (a>=1) {	//a组测试，则为a组循环
			int x = cin.nextInt();
			
			for (int n=1; n<=x; n++) {	//遍历输出奇数
				if (n%2 !=0) {
					System.out.print(n + " ");
				}
			}
			
			System.out.println();
			
			for (int n=1; n<=x; n++) {	//遍历输出偶数
				if (n%2 == 0) {
					System.out.print(n + " ");
				}
			}
			
			a--;
		}
	}
}
