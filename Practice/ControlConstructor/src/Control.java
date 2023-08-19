import java.util.*;
public class Control {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Your marks : ");
		int marks = s.nextInt();
		
		System.out.println("Wellcome to Kodnest");
		
		SimpleIf Si = new SimpleIf();
		
		Si.wellcome(marks);
	}

}
