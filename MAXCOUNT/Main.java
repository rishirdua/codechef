import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			String numbersRaw[] = br.readLine().split(" ");
			HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();
			int maxC = 0;
			int minV = 0;
			for (int k=0; k<N; k++) {
				int num = Integer.parseInt(numbersRaw[k]);
				int count = 1;
				if (numCounts.containsKey(num)) {
					count = numCounts.get(num)+1;
				}
				numCounts.put(num, count);
				if (count>maxC) {
					maxC = count;
					minV = num;
				}
				else if ((count==maxC) && (num<minV)) {
					minV = num;
				}
			}
			System.out.println(minV+" "+maxC);

		}
	}
}