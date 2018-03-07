import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int lineNum = Main.readInt();
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        for(int i = 0; i < lineNum; i++){
            int num = Main.readInt();
            if(num <= 2){
                System.out.println(f1);
            }else{
                f1 = 1;
                f2 = 1;
                for(int j = 3; j <= num; j++){
                    fn = f1 + f2;
                    f1 = f2;
                    f2 = fn;
                }
                System.out.println(fn);
            }
        }
        in.close();
    }
    public static int readInt() throws IOException{
        String str = in.readLine();
        int num = Integer.parseInt(str);
        return num;     
    }
}