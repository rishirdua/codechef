import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This doesn't work

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int res = (N/2)+1;
			System.out.println(res);
		}
		br.close();
	}
}