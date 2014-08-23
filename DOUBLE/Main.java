import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n%2==0) {
				System.out.println(n);
			}
			else {
				System.out.println(n-1);	
			}
		}
		br.close();
	}
}