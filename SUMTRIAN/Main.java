import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int k=0; k<T; k++) {
			int N = Integer.parseInt(br.readLine());
			
			//Read input. We dont care about space
			int[][] numbers = new int[N][N]; 
			int[] maxarr = new int[N];
			int[] temp = new int[N];


			for (int i=0; i<N; i++) {
				
				String[] numcontents = br.readLine().split(" ");
				for (int j=0; j<=i; j++) {
					numbers[i][j] = Integer.parseInt(numcontents[j]);
					if (i==0) {
						temp[0] = numbers[0][0];
					}
					else {
						temp[j] = numbers[i][j] + maxarr[j];
						if (j>0) {
							if (maxarr[j-1]>maxarr[j]) {
								temp[j] = numbers[i][j] + maxarr[j-1];
							}
						}
					}	
				}
				for (int j=0; j<=i; j++) {
					maxarr[j] = temp[j];
					
				}
				
			}
			int max = 0;
			for (int j=0; j<N; j++) {
				if (maxarr[j]>max) {
						max = maxarr[j];
					}
			}
			System.out.println(max);
		}
		br.close();
	}
}