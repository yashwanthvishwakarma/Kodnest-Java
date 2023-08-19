
public class Mobiles {
	
	int cost;
	String brand;
	String color;
	
	public Mobiles (String x, String y, int z) {
		brand = x;
		color = y;
		cost = z;
	}
	
	public Mobiles() {
	System.out.println(this.brand);
	}
	
	public Mobiles(String color) {
		cost = 25000;
		this.color = color;
	}
	
	
	void call() {
		System.out.println("Cost of "+color+" "+brand+" mobiles is "+cost+" rs.");
	}
	
	
}
