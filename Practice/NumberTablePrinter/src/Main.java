import java.util.*;
public class Main {
	
	public static void printTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printTable(num);
	}

}
