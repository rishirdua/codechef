import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while (!done) {
          int nextnum = sc.nextInt();
          if (nextnum==42) {
          	done=true;
          }
          else {
          	System.out.println(nextnum);
          }
      }
	}
}