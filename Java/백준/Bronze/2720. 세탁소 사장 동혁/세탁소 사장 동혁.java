import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int t= in.nextInt();
		for(int i=0;i<t;i++) {
			int c= in.nextInt();
			System.out.print(c/25+" ");
			c%=25;
			System.out.print(c/10+" ");
			c%=10;
			System.out.print(c/5+" ");
			c%=5;
			System.out.print(c/1);
			System.out.println();
		}
	}
}
