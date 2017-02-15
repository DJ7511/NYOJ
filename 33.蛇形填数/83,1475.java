import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int N = cin.nextInt(), x = 0, y = N-1, count = 1;
    public static int[][] num = new int[N][N];
    
    static {
    	for (int x=0; x<N; x++) {
    		for (int y=0; y<N; y++) {
    			num[x][y] = 0;
    		} 
    	}
    	
    	num[x][y] = 1;
    }

    public static void print(int[][] num) {
    	for (int x=0; x<N; x++) {
    		for (int y=0; y<N; y++) {
    			System.out.print(num[x][y] + " ");
    		}
    		System.out.println();
    	}
    }
    
    public static void main(String[] args) throws Exception {	
    	while(count < N*N) {
    		while(x<N-1 && num[x+1][y]==0)
    			num[++x][y] = ++count;
    		
    		while(y>0 && num[x][y-1]==0)
    			num[x][--y] = ++count;
    	
    		while(x>0 && num[x-1][y]==0)
    			num[--x][y] = ++count;
    		
    		while(y<N-1 && num[x][y+1]==0)
    			num[x][++y] = ++count;
    	}
    	print(num);
    }
}