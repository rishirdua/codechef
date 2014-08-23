import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] numbers = new int[N];
		for (int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(numbers);
		PrintWriter pw = new PrintWriter (System.out);
		for (int i=0; i<N; i++) {
			pw.println(numbers[i]);
		}
		pw.close();
	}
}