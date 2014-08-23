import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {
			Stack<Character> operators = new Stack<Character>();
			String inLine = br.readLine();
			for (int j=0; j<inLine.length(); j++) {
				char currChar = inLine.charAt(j);
				if (Character.isLetter(currChar)) {
					System.out.print(currChar);
				}
				else if (currChar==')') {
					System.out.print(operators.pop());
				}
				else if (currChar=='(') {
					//Do nothing
				}
				else {
					operators.push(currChar);
				}
			}
			System.out.println();
		}
		br.close();
	}
}