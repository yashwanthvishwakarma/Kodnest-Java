import java.util.*;
public class IfElseWithinElseIf {
	
	public static void income(int income) {
		
		// if income is greater than 5Lac per annum and less than 7Lac per annum
		if(income >= 500000 && income < 700000) {
			System.out.println("You have a very well income");
			
			// if income is less than 5Lac per annum
		} else if (income < 500000) {
			// if income is less than 2Lac per annum 
			if(income <= 200000 && income >= 50000) {
				System.out.println("You have a partially well income");
				// if income is 50K per annum
			} else {
				System.out.println("You have very poor income");
			}
			
			// if income is greater than 7Lac per annum
		} else {
			System.out.println("You have an exlent income");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter yoor income : ");
		int income = s.nextInt();
		income(income);
	}

}
