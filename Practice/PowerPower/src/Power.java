
public class Power {
	
	int co(int n) {
		int c = 0;
		while(n>0) {
			n = n/10;
			c++;
		}
		return c;
	}
	
	int po(int m, int n) {
		/*
		int c = 1;
		for(int i=1; i<=n; i++) {
			c *= m;
		}
		return c;
		*/
		int c = (int)Math.pow(m, n);
			return c;
	}

}
