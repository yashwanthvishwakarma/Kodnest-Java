import java.util.*;
public class Answer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the fahrenheit : ");
		double f = s.nextDouble();
		
		TemperatureConverter tc = new TemperatureConverter();
		
		
		System.out.println(tc.convertFahrenheitToCelsius(f));
		
	}

}
