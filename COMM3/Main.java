import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			int R = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().split(" ");
			int[] coord1 = new int[]{Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])};
			inputs = br.readLine().split(" ");
			int[] coord2 = new int[]{Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])};
			inputs = br.readLine().split(" ");
			int[] coord3 = new int[]{Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])};
			int checkSum = 0;
			if (isReachable(coord1, coord2, R)) {
				checkSum++;
			}
			if (isReachable(coord2, coord3, R)) {
				checkSum++;
			}
			if (isReachable(coord3, coord1, R)) {
				checkSum++;	
			}
			if (checkSum>1) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");	
			}
		}
		br.close();
	}

	public static boolean isReachable(int[] coordA, int[] coordB, int R) {
		if ( Math.pow((coordB[0]-coordA[0]),2) + Math.pow((coordB[1]-coordA[1]),2) > Math.pow(R,2) ) {
			return false;
		}
		else {
			return true;
		}
	}
}