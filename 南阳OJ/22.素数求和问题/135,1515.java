import java.util.Scanner;

public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
            int line = cin.nextInt();
            int sum;
            int[] s;

            while(line>=1) {
                s = getInt();
                sum = 0;
                for (int i=0; i<s.length; i++) {
                    if(isPrime(s[i])) {
                        sum += s[i];
                    }
                }
                System.out.println(sum);
                line --;
            }
    }

    public static int[] getInt() {
        int x = cin.nextInt();
        int[] s = new int[x];

        for(int i=0; i<s.length; i++) {
            s[i] = cin.nextInt();
        }

        return s;
    }

    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }

        for (int i=2; i<x; i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
}