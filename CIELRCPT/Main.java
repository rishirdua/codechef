import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int NUMITEMS = 12;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int p = Integer.parseInt(br.readLine());
			System.out.println(getMenuCount(p));
		}
		br.close();
	}

	public static int getMenuCount(int p) {
		if (p>2048) {
			return (p/2048) + getMenuCount(p%2048);
		}
		else { //add all 1s
			int sum=0;
			for (int i=0; i<NUMITEMS; i++) {
				sum = sum + (p>>i & 1);
			}
			return sum;

		}

	}
}