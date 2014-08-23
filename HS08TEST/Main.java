import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		float Y  = sc.nextFloat();

		if ( (X%5!=0) || X+0.5>Y) {
			System.out.printf("%.2f\n", Y);
		}
		else {
			System.out.printf("%.2f\n", Y-X-0.5);
		}
	}
}
		

