
public class P34 {
	static void stars(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==n || j==0 || i==0 ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
