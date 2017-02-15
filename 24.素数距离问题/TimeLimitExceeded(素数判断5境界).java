import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
            int line = cin.nextInt();
            int s, max, little, maxT, littleT;

            while(line-- >= 1) {
            	s = cin.nextInt();
            	
            	if(isPrime(s)) {
            		System.out.println(s + " " + 0);
            		continue;
            	}
            	
            	max = getMaxPrime(s);
            	little = getLittlePrime(s);
            	
            	maxT = max - s;
            	littleT = s - little;
            	
            	System.out.println("max:" + max + ",maxT:" + maxT + ";little:" + little + ",llittleT:" + littleT);
            	
            	System.out.println(littleT<=maxT?(little + " " + littleT):(max + " " + maxT));
            }
    }
    
    public static int getMaxPrime(int x) {
    	int temp = 0;
    	for (int i=x+1; i<1000; i++) {
    		if(isPrime(x)) {
    			temp = x;
    			break;
    		}
    	}
    	return temp;
    }
    
    public static int getLittlePrime(int x) {
    	int temp = 0;
    	for (int i=x-1; i> 2; i--) {
    		if(isPrime(x)) {
    			temp = x;
    			break;
    		}
    	}
    	return temp;
    }
    
    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }

        for (int i=2; i<x/2; i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
    public static boolean isPrime1(int x) {
        if (x == 1) {
            return false;
        }

        for (int i=2; i<x/2; i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrime2(int x) {
        if (x == 1) {
            return false;
        }
        
        if (x % 2 == 0) {
        	return false;
        }

        for (int i=3; i<x/2; i+=2) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrime3(int x) {
        if (x == 1) {
            return false;
        }
        
        for (int i=2; i<(int)Math.sqrt((double)x); i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrime4(int x) {
        if (x == 1) {
            return false;
        }
        
        if (x % 2 == 0) {
        	return false;
        }
        
        for (int i=3; i<(int)Math.sqrt((double)x); i+=2) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
    */
}