import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str=br.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int b=Integer.parseInt(str[1]);
		bw.append(Integer.toString(Euclidean(a,b))+'\n');
		bw.append(Integer.toString(a*b/Euclidean(a,b)));
		bw.flush();
	}
	static int Euclidean(int a, int b) {
		if(b==0) return a;
		else return Euclidean(b, a%b);
	}
}