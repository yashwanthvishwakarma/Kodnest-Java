import java.util.Scanner;

public class Main {
	
	public static void categorizeAge(int age) {
		if(age <= 12) {
			System.out.println("Child");
		} else if(age >= 13 && age <= 19) {
			System.out.println("Teen");
		} else if(age >= 20 && age <= 59) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		categorizeAge(age);

	}

}
