package chapter3;
import java.util.Scanner;
public class Triangle_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if((a + b > c) && (b + c > a) && (a + c > b))
			System.out.println(a + b + c);
		else
			System.out.println("Invalid input.");
	}

}
