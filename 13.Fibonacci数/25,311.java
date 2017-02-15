import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int temp[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			temp[i] = cin.nextInt();
			System.out.println(Fibonacci(temp[i]));  
		}

		cin.close();
	}
	
	public static int Fibonacci(int n) {
		if (n == 1) {
			return 1;
		}else if (n == 2){
			return 1;
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
}
