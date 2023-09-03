import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		Power p = new Power();
		System.out.println(p.po(m,p.co(m)));

	}

}
