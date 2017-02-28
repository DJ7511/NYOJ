import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int N, m, n, count, temp=0, j, i;
    //count 用于计数，temp用于每阶运算，i用于外层循环，j用于内层循环
    
    public static void main(String[] args) throws Exception {	
    	N = cin.nextInt();
    	for (i=0; i<N; i++) {
    		count = 0;
    		n = cin.nextInt();
    		m = cin.nextInt();
    		j = n;
    		temp = n;
    		
    		while (n != 0) {
    			n = n/m;
    			count = count + n;
    		}
    		
    		System.out.println(count);
    	}
    }
}