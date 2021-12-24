package chapter3;

import java.util.Scanner;

public class Inside_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  circle1'1 center x-, y-coordinates, and randius:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter  circle2'1 center x-, y-coordinates, and randius:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		double D;
		D = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		double R1;
		R1 = r1 - r2;
		double R2 = r1 + r2;
		if(D < R1) {
			System.out.println("circle2 inside circle1");
			
		}
		else if(D < R2)
			System.out.println("circle2 overaps circle1");
		else
			System.out.println("circle2 dose not overaps circle1");
	}
	

}
