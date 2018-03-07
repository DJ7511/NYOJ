import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);
    public static int[] num = new int[5];
    
    public static void main(String[] args) throws Exception{
    	for (int i=0; i<5; i++) {
    		num[i] = cin.nextInt();
    	}
    	shellSort(num);
    	System.out.println(num[0] + " " + num[4]);
    }
    
    public static void shellSort(int[] a) {
		for (int d=a.length/2; d>0; d/=2) {
			for (int i=d; i<a.length; i++) {
				int temp = a[i], j = i - d;
				
				while (j >= 0 && temp < a[j]) {
					a[j+d] = a[j];
					j -= d;
				}
				
				a[j+d] = temp;
			}
		}
	}
}