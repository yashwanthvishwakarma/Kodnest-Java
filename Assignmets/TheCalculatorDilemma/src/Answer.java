import java.util.*;
public class Answer {
	
	public static void calculator (int a, char operator, int b) {
		switch (operator) {
		case '+' : System.out.println("The result is : "+ (a+b));
		break;
		case '-' : System.out.println("The result is : " +(a-b));
		break;
		case '*' : System.out.println("The result is : "+ a*b);
		break;
		case '/' : System.out.println("The result is : "+ a/b);
		break;
		case '%' : System.out.println("The result is : "+ a%b);
		break;
		default : System.out.println("Invalid operator");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number 'a' : ");
		int a = s.nextInt();
		System.out.println("Enter the operator : ");
		char operator = s.next().charAt(0);
		System.out.println("Enter a number 'b' : ");
		int b = s.nextInt();
		
		calculator(a,operator,b);
		
	}

}
