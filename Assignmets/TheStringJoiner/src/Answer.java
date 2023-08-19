import java.util.*;
public class Answer {
	
	public static String joinString(String first, String second) {
		
		return first+" "+second;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First name : ");
		String first = s.next();
		System.out.println("Enter Second name : ");
		String second = s.next();
		
		System.out.println("Your full name is : "+joinString(first, second));
	}

}
