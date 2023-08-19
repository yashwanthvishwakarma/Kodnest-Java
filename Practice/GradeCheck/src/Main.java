import java.util.*;
public class Main {
	
	public static void checkGrade(int grade) {
		if(grade >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		checkGrade(grade);
	}

}
