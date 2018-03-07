/*2017.1.31
 * jdk1.7
 * ASCII码排序
 * */
import java.util.*;

public class Main {		//程序入口
	public static void main(String[] args) throws Exception {	//应程序要求，OJ规范，抛出异常
		Scanner cin = new Scanner(System.in);	//采用Scanner读取控制台
		int a = cin.nextInt();	//记录数据组数
		
		for (int n=a; n>=1; n--) {		//每组
			char m, v, p;	//记录三个char字符
			String s1 = cin.next();		//Scanner读入的是一个String
			//读取字符串中的字符
			m = s1.charAt(0);
			v = s1.charAt(1);
			p = s1.charAt(2);
			
			sort1(m, v, p);	//方法调用
		}
	}
	
	//方法：输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。
	public static void sort1(char a, char b, char c) {
		char t1 = a;  //分别定义三个char变量用于记录形参传来的三个值
		char t2 = b;
		char t3 = c;
		char t; //临时变量
		//三个数字，按增序输出
		if (t1 > t2) { //如果第一个数大于第二个数，交换第一个数和第二个数 
			t = t1; //交换t1和t2 
		    t1 = t2;
		    t2 = t;
		}
	  //此时第一个数一定比第二个数小 
		if(t3 < t1)//若第三个数比t1小 
			System.out.println(t3 + " " + t1 + " " + t2 + "\n");
		else if(t3 > t2) //若第三个数比t2大 
			System.out.println(t1 + " " + t2 + " " + t3 + "\n");
		else //第三个数介于t1和t2之间 
			System.out.println(t1 + " " + t3 + " " + t2 + "\n");
	}
}
