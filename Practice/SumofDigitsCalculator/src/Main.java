import java.util.*;
public class Main {
	
	public static void alculateSumOfDigits(int n) {
		int add = 0;
		while(n>0) {
			int ld = n%10;
			add += ld;
			n /= 10;
		}
		System.out.println(add);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		alculateSumOfDigits(n);
	}

}
