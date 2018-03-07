import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int x, y, z, num;
    
    public static void main(String[] args) throws Exception {	
    	x = cin.nextInt();
    	y = cin.nextInt();
    	z = cin.nextInt();
    	
    	for (int i=10; i<=100; i++) {
    		if ((i-x)%3==0) {
    			if ((i-y)%5==0) {
    				if ((i-z)%7==0) {
    	    			System.out.println(i);
    	    			break;
    	    		}
        		}
    		}
    		num = i;
    	}
    	
    	if(num == 100) {
    		System.out.println("No answer");
    	}
    }
}