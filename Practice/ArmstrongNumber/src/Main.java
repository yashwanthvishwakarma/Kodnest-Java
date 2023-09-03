import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Armstrong arm = new Armstrong();
		System.out.println(arm.power(n));
		
	}

}
