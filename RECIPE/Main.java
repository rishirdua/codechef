import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			String rawNum[] = br.readLine().split(" ");
			int result = Integer.parseInt(rawNum[1]);
			int[] ingredients = new int[rawNum.length-1];
			for (int k=1; k<rawNum.length; k++) {
				ingredients[k-1] = Integer.parseInt(rawNum[k]);
				result = gcd(result, ingredients[k-1]);
			}
			for (int k=0; k<ingredients.length; k++) {
				System.out.print(ingredients[k]/result+" ");
			}
			System.out.println();
		}
		br.close();
	}
	public static int gcd(int a, int b) {
	    while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;

	}
}