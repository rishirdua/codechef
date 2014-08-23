import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int i=0; i<T; i++) {
			int N = Integer.parseInt(sc.nextLine());
			int res = (N/2)+1;
			System.out.println(res);
		}
		sc.close();
	}
}