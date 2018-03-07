import java.io.IOException;

public class Main {
    public static int getInt() throws IOException {
        int i;
        while((i = System.in.read()) < 48 || i > 57);
        int temp = 0;
        while(i > 47 && i < 58) {
            temp = temp * 10 + i - 48;
            i = System.in.read();
        }
        return temp;
    }

    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        int len = (int)Math.sqrt(n) + 1;
        for(int i = 2;i < len; i++)
            if(n%i == 0)
                return false;
        return true;
    }

    public static void main(String args[]) throws IOException {
        int i, j, t, sum;
        for (i = getInt(); i > 0; i--) {
            sum = 0;
            for(j = getInt(); j > 0; j--)
                if (isPrime(t = getInt()))
                    sum += t;
            System.out.println(sum);
        }
    }
} 