import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			int zeros = 0;
			for (int j=5; j<=number; j=j*5) {
				zeros = zeros + number/j;
			}
			System.out.println(zeros);
		}
		
	}
}
