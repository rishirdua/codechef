import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inData = br.readLine().split(" ");
		br.close();

		int A = Integer.parseInt(inData[0]);
		int N = Integer.parseInt(inData[1]);
		int K = Integer.parseInt(inData[2]);

		//get last K digits of number A in base N
		for (int j=0; j<K; j++) {
			if (j==K-1) {
				System.out.println(A%(N+1));	
			}
			else {
				System.out.print(A%(N+1)+" ");
				A = A / (N+1);
			}
		}
	}
}