import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int N, count, num, num1, num2;
    public static int[] a = new int[4];
    
    public static void main(String[] args) throws Exception {	
    	N = cin.nextInt(); 	
    	while(N-- != 0) {
    		count = 0;   		
    		num = cin.nextInt();
    		do {
    			for(int i=0; i<4; i++) {
    				a[i] = num % 10;
    				num = num/10;
    			}
    			Arrays.sort(a);   			
    			num1 = a[0] + a[1]*10 + a[2]*100 + a[3]*1000;
    			num2 = a[0]*1000 + a[1]*100 + a[2]*10 + a[3]; 			
    			num = num1 - num2;    			
    			count ++;
    		} while(num != 6174);	
    		System.out.println(count+1);
    	}
    }
}