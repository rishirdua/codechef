import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]  args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//Scanner in = new Scanner(System.in) too slow so not suitable for large inputs
		int N  = Integer.parseInt(br.readLine());
		int lead = 0;
		int sum1 = 0;
		int sum2 = 0;
		int score1;
		int score2;
		String[] linecontents;
		int maxLead1 = 0 ;
		int maxLead2 = 0;

		for (int i=0; i<N; i++) {
			linecontents =  br.readLine().split(" ");
			score1 = Integer.parseInt(linecontents[0]);
			score2 = Integer.parseInt(linecontents[1]);
			sum1 = sum1 + score1;
			sum2 = sum2 + score2;
			lead = sum1 - sum2; //positive lead means 1 is leading
			if (lead>maxLead1) {
				maxLead1 = lead;
			}
			if (lead<maxLead2) {
				maxLead2 = lead;
			}
		}
		if ((maxLead1+maxLead2)>0) {
			System.out.println("1 "+maxLead1);
		}
		else {
			int temp = -maxLead2;
			System.out.println("2 "+temp);
		}



		br.close();
	}
}