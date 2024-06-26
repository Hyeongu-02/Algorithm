import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int[] arr =new int [10000];
		for(int i=0;i<n;i++) {
			arr[Integer.parseInt(br.readLine())-1]++;
		}
		for(int i=0;i<10000;i++) {
			while(arr[i]!=0) {
				arr[i]--;
				bw.append(Integer.toString(i+1)+'\n');
			}
		}
		bw.flush();
	}
}