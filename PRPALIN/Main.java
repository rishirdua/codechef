import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N == 1) {
			System.out.println(1);
		}
		else {
			boolean found = false;
			boolean[] composites = getNonPrimes();
			int k = N-2;
			while(!found) {
				if (composites[k]) {
					k++;
				}
				else {
					if (isPalindrome(k+2)) {
						System.out.println(k+2);
						found = true;
						break;
					}
					else {
						k++;
					}
				}
			}
		}

		
	}
	//Get Primes
	public static boolean[] getNonPrimes() {
		int NMAX = 1003000;
		boolean[] composites = new boolean[NMAX]; //starts from 2
		for (int i=2; i<Math.sqrt(NMAX); i++) {
			if (!composites[i-2]) {
				for (int j=(int)Math.pow(i,2); j<NMAX; j=j+i) {
					composites[j-2]=true;
				}
			}
		}
		return composites;
	}

	public static boolean isPalindrome(int num) {
		String a = Integer.toString(num);
	    int len=a.length();
	    if(len==1) {
	    	return true;
	    }
	    if(len==0) {
	    	return false;
	    }
	    if(len==2) {
	    	return (a.charAt(0)==a.charAt(1));
	    }
	    int i=0;
	    while(i<=len/2+1) {
	        if(a.charAt(i)!=a.charAt(len-i-1)) {
	        	return false;
	        }
	        i++;
	    }
	    return true;
	}
}