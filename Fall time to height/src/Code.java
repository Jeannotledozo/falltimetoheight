import java.util.Scanner;
public class Code {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter the fall time:");
		float FallTime = keyboard.nextFloat();
		float HeightFeet = 16*(FallTime*FallTime);
		double HeightMeters = HeightFeet/3.2808;
		System.out.println("The height is " + HeightFeet +" feets, or " + Math.round(HeightMeters) + "meters");

	}

}
