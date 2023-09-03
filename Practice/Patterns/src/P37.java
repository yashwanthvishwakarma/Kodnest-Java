
public class P37 {
	static void stars() {
		for(char i = 'A'; i<= 'E'; i++) {
			for(char j='A'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
