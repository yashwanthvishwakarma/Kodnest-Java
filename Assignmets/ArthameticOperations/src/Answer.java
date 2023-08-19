import java.util.*;
public class Answer {
	
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the 2 numbers : ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println("result of subtracting num2 from num1 is : "+subtractNumbers(num2,num1));
		System.out.println("the result of multiplying num1 and num2 is :"+multiplyNumbers(num1,num2));
		System.out.println("the result of dividing num1 by num2 is "+divideNumbers(num1,num2));
		System.out.println("the remainder when num1 is divided by num2 is : "+findRemainder(num1,num2));
		
	}

}
