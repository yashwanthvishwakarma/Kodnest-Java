
public class W {
	static void w() {
		 int n=5;;
		 for (int i=0; i<n; i++) {
	          for (int j = 0; j < n; j++) {
	                if (j==0 || j==n-1 || (i>=n/2 && (j==i || j==n-1-i))) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }  
	}
}
