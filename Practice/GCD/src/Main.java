import java.util.*;
public class Main {
	public static void findGCD(int a, int b) {
		// eculid algoridtum
		while(b>0) {
			int rem = a%b;
			a = b;
			b = rem;
			if(b == 0) {
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		findGCD(a,b);
	}

}
