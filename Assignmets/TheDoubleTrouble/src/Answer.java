import java.util.*;
public class Answer {
	
	public static int doubleTheNumber(int num) {
		return num*2;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Score : ");
		int num = s.nextInt();
		
		System.out.println("The final score is : "+doubleTheNumber(num));	
	}

}
