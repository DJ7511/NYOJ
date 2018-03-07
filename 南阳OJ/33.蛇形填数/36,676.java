import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int i,j,h = 0;
		short num = 1;
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort();
		short[][] array = new short[n][n];
		int hmax = (n+1)>>1;
		for ( h = 0; h <= hmax; h++) {
			if (h==hmax&&n%2!=0) {
				array[n>>1][n>>1] = num;
			}else {
				for ( i =h; i < n-1-h; i++) {
					array[i][n-1-h]=num++;
				}
				for ( i = n-1-h; i >h ; i--) {
					array[n-1-h][i]=num++;
				}
				for ( i = n-1-h; i >h ; i--) {
					array[i][h]=num++;
				}
				for ( i = h; i < n-1-h; i++) {
					array[h][i] = num++;
				}
			}
			
		}
		StringBuffer sb = new StringBuffer();
		for ( i = 0; i < array.length; i++) {
			for ( j = 0; j < array[i].length; j++) {
				sb.append(array[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}

}        