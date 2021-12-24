package chapter3;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double X = Math.abs(x1 - x2);
		double Y = Math.abs(y1 - y2);
		
		if((X < width1/2) && (Y < height1/2)) {
			System.out.println("r2 is insied r1");
			
		}
		else System.out.println("r2 is overlaps r1");

	}

}
