
public class MobilesApp {
	
	public static void main(String[] args) {
		
		Mobiles m1 = new Mobiles("Apple","Black",125000);
		Mobiles m2 = new Mobiles("Blue");
		
		// no value inside it
		Mobiles m3 = new Mobiles();
		
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		m1.call();
		
		//m2 
		m2.brand = "MI";
		System.out.println(m2.brand);
		System.out.println(m2.color);
		System.out.println(m2.cost);
		
		// No value inside the m3 reference variable
		System.out.println(m3.brand+" "+m3.color+" "+m3.cost);
		
	}
}
