import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			
			System.out.println(factorial(new BigInteger(Integer.toString(number))));
		}
		
	}

	public static BigInteger factorial(BigInteger n) {
		//Maximum recursion can be 5000 so use iterative
		
	    BigInteger result = BigInteger.ONE;

	    while (!n.equals(BigInteger.ZERO)) {
	        result = result.multiply(n);
	        n = n.subtract(BigInteger.ONE);
	    }

	    return result;
	}

}