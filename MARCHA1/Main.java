import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			String nm = br.readLine();
			int n = Integer.parseInt(nm.split(" ")[0]);
			int m = Integer.parseInt(nm.split(" ")[1]);
			int[] notes = new int[n];
			for (int k=0; k<n; k++) {
				notes[k] = Integer.parseInt(br.readLine());
			}
			boolean found = false;
			for (int k=0; k<(int)Math.pow(2,n); k++) {
				int sum=0;
				for (int j=0; j<n; j++) {
					
					if ((k & 1<<j)>0) {
						sum = sum + notes[j];
					}	
				}
				if (sum==m) {
					System.out.println("Yes");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("No");
			}	
		}
		br.close();
	}

}