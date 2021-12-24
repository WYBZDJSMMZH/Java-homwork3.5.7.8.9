package chapter3;
import java.util.Scanner;
public class IsPoint_in_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordiates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double radius = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		if(radius <= 10)
			System.out.println("Point" + " (" + x +", " + y 
					+ ") " + "is in the circle");
		else
			System.out.println("Point" + " (" + x +", " + y 
					+ ") " + "is not in the circle");

	}

}
