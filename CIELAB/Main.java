import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] linecontents = br.readLine().split(" ");
		int A = Integer.parseInt(linecontents[0]);
		int B = Integer.parseInt(linecontents[1]);
		int res = A-B;
		if ((A-B+1)%10==0) { //last digit is 9
			System.out.println(A-B-1);
		}
		else {
			System.out.println(A-B+1);
		}
		br.close();
	}
}