
public class P38 {
	static void stars() {
		int n = 11;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i==1 && j<=n/2) || (j==1 && i<=n/2) || i==n/2 || j==n/2 ||(i>n/2 && j==n) || (j>n/2 && i==n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
