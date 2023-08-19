import java.util.*;
public class Answer {
	
	public static double calculate(double a, double b, char c) {
		double add = a+b;
		double sub = a-b;
		switch (c) {
		case '+' : System.out.println("Result : "+add);
		break;
		case '-' : System.out.println("Result : "+sub);
		break;
		default : System.out.println("Invalid option");
		
		}
		if(c == '+') {
			return add;
		}
		return sub;
		
	}
	 
	public static double calculate(double a, char c, double b) {
		double mul = a*b;
		double div = a/b;
		switch (c) {
		case '*' : System.out.println("Result : "+mul);
		break;
		case '/' : System.out.println("Result : "+div);
		break;
		default : System.out.println("Invalid option");
		
		}
		if(c == '+') {
			return mul;
		}
		return div;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		float first = s.nextFloat();
		System.out.println("Enter the Secound number : ");
		float secound = s.nextFloat();
		System.out.println("Enter the operator (+,-,*,/) : ");
		char operator = s.next().charAt(0);
				
		if(operator == '+' || operator == '-') {
			calculate(first,secound,operator);
		} else if(operator == '*' || operator == '/'){
			calculate(first,operator,secound);
		} else {
			System.out.println("Invalid operator");
		}
		
	}

}
