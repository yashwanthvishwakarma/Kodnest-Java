
public class P13 {
	static void stars() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
