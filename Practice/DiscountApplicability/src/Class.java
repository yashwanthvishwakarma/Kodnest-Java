import java.util.*;
public class Class {
	
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount > 100) {
			System.out.println("Discount Applicable");
		} 
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double purchaseAmount = s.nextDouble();
		checkDiscount(purchaseAmount);
	}

}
