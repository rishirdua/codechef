import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String newline = br.readLine();
		String[] linecontents = newline.split(" ");
		int n = Integer.parseInt(linecontents[0]);
		int k = Integer.parseInt(linecontents[1]);
		int ti;
		int count=0;

		for (int i=0; i<n; i++) {
			newline = br.readLine();
			ti = Integer.parseInt(newline);
			if (ti%k==0) {
				count++;
			}
		}
		System.out.println(count);
			
	}
}

