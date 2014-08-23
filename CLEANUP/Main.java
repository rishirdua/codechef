import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			String[] nm = br.readLine().split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			boolean[] jobs = new boolean[n];
			String[] doneindices = br.readLine().split(" ");
			for (int j=0; j<m; j++) {
				jobs[Integer.parseInt(doneindices[j])-1] = true;
			}
			
			boolean skipFlag = false;
			for (int j=0; j<n; j++) {
				if (!jobs[j]) {
					if (!skipFlag) {
						jobs[j] = true;
						System.out.print(j+1+" ");
					}
					skipFlag = !skipFlag;
				}
			}
			System.out.println();

			for (int j=0; j<n; j++) {
				if (!jobs[j]) {
					System.out.print(j+1 + " ");
				}
			}
			System.out.println();		
		}
		br.close();
	}
}