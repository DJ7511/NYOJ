import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int num, m, n;
    
    public static void main(String[] args) throws Exception{
    	num = cin.nextInt();
		m = n = num;
    	for (int i=0; i<4; i++) {
    		num = cin.nextInt();
    		
    		if (num > m) {
    			m = num;
    			continue;
    		}
    		
    		if(num < n) {
    			n = num;
    			continue;
    		}
    	}
    	System.out.println(n + " " + m);
    }
}