
public class P33 {
	static void stars(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==n  || (i==0 || j==0) || i==n/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
