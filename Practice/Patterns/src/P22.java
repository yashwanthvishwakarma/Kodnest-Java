
public class P22 {
	static void stars() {
		
		for(int i=1; i<=5; i++) {
			for(int j=5;j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=5;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5; i>=1; i--) {
			for(int j=5;j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=5;j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
