
public class WhileLoop {

	public static void main(String[] args) {
		
		// Labeled while loop
		//where a is the name for outer loop
		int i=1;
		a:while(i<=5) {
			int j=1;
			b:while(j<=5) {
				System.out.print("* ");
				j++;
				break a;
			}
			System.out.println();
			i++;
		}
		
		/*int k=1;
		a:do {
			System.out.println();
			k++;
			int j=1;
			b:do {
				System.out.print("* ");
				j++;
				break a;
			} while(j<=5);
		}while(k<=5);*/

	}

}
