
public class T {
	static void t() {
		int n=4;;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==n/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
