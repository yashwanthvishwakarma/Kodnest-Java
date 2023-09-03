
public class PowerN {
	double power(double m, double n) {
		double sq = 1;
		for(double i=1; i<=n; i++) {
			sq *= m;
		}
		return sq;
	}
}
