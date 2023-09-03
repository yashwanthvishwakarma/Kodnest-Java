
public class Armstrong {
	
	int checkNum(int n) {
		int c = 0;
		while(n>0) {
			n /= 10;
			c++;
		}
		return c;
	}
	
	boolean power(int n) {
		int org = n;
		int add=0;
		while(n>0) {
			//int cub = 1;
			int rem = n%10;
			/*for(int i=1; i<=checkNum(org); i++) {
				cub *= rem;
			}*/
			int cub = (int)Math.pow(rem, checkNum(org));
			add += cub;
			n /= 10;
		}
		if(add==org) {
			return true;
		} 
		return false;
	}
	
}
