import java.util.*;
public class Answer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Speed : ");
		double speed = s.nextDouble();
		System.out.println("Enter the Time : ");
		double time = s.nextDouble();
		
		JourneyCalculator JC = new JourneyCalculator();
		
		System.out.println("The Speed is : "+JC.calculateDistance(speed,time));
	}

}
