import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int[] numbers;
	private static boolean[] visited;
	private static int N;
	private static int visitedCount = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] rawNumbers =  br.readLine().split(" ");
		br.close();
		N = rawNumbers.length;
		numbers = new int[N];
		visited = new boolean[N];
		for (int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(rawNumbers[i]);
		}
		int numCycles=0;
		
		
		String toPrint="";
		while (visitedCount<N) {
			numCycles++;
			toPrint = toPrint + getNextCycle();
		}
		System.out.println(numCycles);
		System.out.print(toPrint);
	}
	private static String getNextCycle() {
		int startIndex = 1;
		while (visited[startIndex-1]) {
			startIndex++;
		}
		String toRet = startIndex + " " + numbers[startIndex-1];
		visited[startIndex-1] = true;
		visitedCount++;
		int numIndex = numbers[startIndex-1];
		while(numIndex!=startIndex) {
			toRet = toRet + " " + numbers[numIndex-1];
			visited[numIndex-1] = true;
			visitedCount++;
			numIndex = numbers[numIndex-1];
		}
		return toRet+"\n";
	}
}
