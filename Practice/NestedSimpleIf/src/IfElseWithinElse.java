import java.util.*;
public class IfElseWithinElse {
	
	public static void rate(int carat) {
		
		// if gold is less than 22 carat its costs 30K
		if(carat < 22) {
			System.out.println("Gold rate is 30K per G");
			
			// if gold is 22 to 2 carat it will cost 42K
		} else {
			if(carat >=22 && carat < 26) {
				// if gold is 22 to 26 carat it costs 42K 
				System.out.println("Gold rate id 42K per G");
				// if gold is 26 to 28 carat it costs 45K
			} else if(carat >=26 && carat <= 28) {
				System.out.println("Gold costs 45K per G");
				// if it exceeds 28 carat its out of range 
			} else {
				System.out.println("Out of range");
			}
		}
			
	} 
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the golds carat within 22 to 28 Carat : ");
		int carat = s.nextInt();
		rate(carat);
		
	}

}
