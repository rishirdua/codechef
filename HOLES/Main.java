import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		HashMap<Character, Integer> holeChars = new HashMap<Character, Integer>();
		holeChars.put('A',1);
		holeChars.put('B',2);
		holeChars.put('D',1);
		holeChars.put('O',1);
		holeChars.put('P',1);
		holeChars.put('Q',1);
		holeChars.put('R',1);
		
		for (int i=0; i<T; i++) {
			String newline = br.readLine();
			int holes = 0;
			for (int k=0; k<newline.length(); k++) {
				if (holeChars.containsKey(newline.charAt(k))) {
					holes = holes + holeChars.get(newline.charAt(k));
				}
			}
			System.out.println(holes);
		}
	}
}