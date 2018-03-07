import java.util.Scanner;

public class Main {
	public static int[] primeArgs = new int[1000010];
	public static Scanner cin = new Scanner(System.in);
	
	static {
		primeArgs[1] = 1;
		
		for (int i=2; i*i<1000010; i++) {
			if(primeArgs[i] == 0) {
				for (int j=i*i; j<1000010; j+=i) {
					primeArgs[j] = 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int N = cin.nextInt();
		int nUp, nDown;
		
		while(N-- >0) {
			int n = cin.nextInt();
			
			if(primeArgs[n] == 0) {
				System.out.println(n + " " + 0);
			} else {
				nUp = nDown = n;
				
				while (primeArgs[nUp] == 1) {
					nUp ++;
				}
				
				while (primeArgs[nDown] == 1 && nDown > 0) {
					nDown --;
				}
				
				if (nDown == 0) {
					System.out.println(nUp + " " + (nUp - n));
				} else if (nUp-n >= n-nDown) {
					System.out.println(nDown + " " + (n-nDown));
				} else {
					System.out.println(nUp + " " + (nUp-n));
				}
			}
		}
	}
}
