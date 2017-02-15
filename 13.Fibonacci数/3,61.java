import java.util.Scanner;

public class Main {
	public static Scanner cin=new Scanner(System.in);
	
	public static void main(String[] args) {
		int line = 0;
		int number = cin.nextInt();
		
		for(int i = 0; i < number; i++){	
			line = cin.nextInt();
			System.out.println(f(line));
		}
	}

	static int f(int i){
		if (i <= 2 && i >= 0 ) {
			return 1;
		}
		return f(i - 1) + f(i - 2);
	}
}