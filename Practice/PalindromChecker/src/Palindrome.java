
public class Palindrome {
	void checkP(int n) {
		int org = n;
		int check = 0;
		while(n>0) {
			int ld = n%10;
			check= (check*10)+ld;
			n /= 10;
		}
		if(org==check) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
