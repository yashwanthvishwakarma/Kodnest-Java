
public class R {
	static void r() {
		int n=4;;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(j==0 || i==0 || (i<=n/2 && j==n) || i==n/2 || ( i>n/2 && i==j)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
