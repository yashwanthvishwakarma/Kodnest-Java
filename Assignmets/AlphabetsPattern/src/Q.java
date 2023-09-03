
public class Q {
	static void q() {
		int n=100;;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if((j==0 && i<=n/2) || (i==n/2 && j<=n/2) || (j==n/2 && i<=n/2) || (i==0 && j<=n/2) || (i>(n/2)-3 && j>(n/2)-3 && i==j && i<=n-3 && j<=n-3)) {
				//if(i==0&&j<=n-2||j==0&&i<=n-2||j==n-2&&i<=n-2||i==n-2&&j<=n-2||i>=n-4&&j==i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
