import java.util.*;
public class IfWithinIf {
	
	public static void catagery(int age) {
		
		// if the user is below 18 
		if(age <= 18) {
			
			// if the user is below 13
			if(age <= 13) {
				System.out.println("You are a Child");
			} else {
				System.out.println("You are a Teen");
			}
		} else {
			
			// if the user is above 18
			System.out.println("You are an Adult");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		catagery(age);
	}

}
