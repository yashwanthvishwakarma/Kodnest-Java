import java.util.*;
public class Answer {
	
	public static void swapUsingBitwise(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swaping : First = "+a+" , Secound = "+b);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First integer: ");
		int a = s.nextInt();
		System.out.println("Enter the Secound integer: ");
		int b = s.nextInt();
		System.out.println("First = "+a+" , Secound = "+b);
		swapUsingBitwise(a,b);
	}

}
