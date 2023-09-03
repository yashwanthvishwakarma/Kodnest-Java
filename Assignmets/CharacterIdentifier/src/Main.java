import java.util.*;
public class Main {
	
	public static void identifyCharacter(char ch) {
		if(Character.isLowerCase(ch)) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Lower-case vowel");
			} else {
				System.out.println("Lower-case consonant");
			}
		} else if (Character.isUpperCase(ch)) {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Upper-case vowel");
			} else {
				System.out.println("Upper-case consonant");
			}
		} else if(Character.isDigit(ch)) {
			System.out.println("Is Digit");
		} else {
			System.out.println("Special Character");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = s.next().charAt(0);
		identifyCharacter(ch);
	}

}
