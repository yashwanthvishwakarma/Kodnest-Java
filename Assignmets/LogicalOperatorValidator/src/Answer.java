import java.util.*;
public class Answer {
	
	public static boolean isValidInput(boolean input , boolean condition) {
		
		if(input == true && condition == true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Is input valid (true / false) : ");
		boolean input = s.nextBoolean();
		System.out.println("Dose input meet certain conditions (true / false) : ");
		boolean condition = s.nextBoolean();
		
		if(isValidInput(input,condition) == true) {
			System.out.println("Input is valid ");
		} else {
			System.out.println("Input is not valid");
		}
		
	}

}
