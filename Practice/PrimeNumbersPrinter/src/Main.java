import java.util.*;
public class Main {
	
	public static boolean checkPrime(int n) {
		
		if(n==1 || n==2) {
			return true;
		}
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int n) {
		int count = 0;
		for(int i=3; count<n; i++) {
			boolean prime = checkPrime(i);
			if (prime == true) {
				System.out.println(i+" ");
				count++;
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printPrime(n);
	}

}
