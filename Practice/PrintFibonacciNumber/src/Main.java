import java.util.*;
public class Main {
	
	public static void printFibonacciSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		if(n==1) {
			System.out.println(num1);
		} else if(n==2) {
			System.out.println(num2);
		} else {
			System.out.print(num1+" "+num2+" ");
			for(int i=3; i<=n; i++) {
				int next = num2+num1;
				System.out.print(next+" ");
				num1 = num2;
				num2 = next;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printFibonacciSeries(n);
	}

}
