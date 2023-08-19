import java.util.*;
public class Answer {
	
	public static long galacticAddition(long num1, long num2) {
		
		return num1 + num2;
	}

	public static void main(String[] args) {
		
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		long num1 = s.nextLong();
		System.out.println("Enter number 2 : ");
		long num2 = s.nextLong();
		
		System.out.println("The result is : "+galacticAddition(num1,num2));
		
	}

}
