import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N>0) {
			boolean flag = false;
			String[] linecontents = br.readLine().split(" ");
			int[] a = new int[N];
			for (int i=0; i<N; i++) {
				a[i] = Integer.parseInt(linecontents[i]);
			}
			for (int i=1; i<=N; i++) {
				if (a[a[i-1]-1] != i) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("not ambiguous");
			}
			else {
				System.out.println("ambiguous");
			}
			N = Integer.parseInt(br.readLine());
		}
		br.close();
	}
}