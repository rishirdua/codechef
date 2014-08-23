import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int C = Integer.parseInt(br.readLine().split(" ")[1]);
			String[] rawA = br.readLine().split(" ");
			
			int sum = 0;
			for (int j=0; j<rawA.length; j++) {
				sum = sum + Integer.parseInt(rawA[j]);
			}
			if (sum>C) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");	
			}
		}
		br.close();
	}
}