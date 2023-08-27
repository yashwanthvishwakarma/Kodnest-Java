import java.util.*;
public class Main {
	
	public static void calculateSum(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			count += i;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		calculateSum(n);
	}

}
