import java.util.*;
public class Answer {
	
	public static double calculateTotalWithTax(double purchase, double taxRate) {
		return purchase + (purchase*taxRate);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the purchase amount : ");
		double purchase = s.nextDouble();
		System.out.println("Enter the tax rate : ");
		double taxrate = s.nextDouble();
		
		System.out.println("Total cost including tax : "+calculateTotalWithTax(purchase,taxrate)+" Rs");
		
	}

}
