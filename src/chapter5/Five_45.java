package chapter5;

import java.util.*;

public class Five_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 number:");
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double d = 0;
		for(int i=1 ; i<= 10; i++) {
			double x = input.nextDouble();
			sum += x;
			d += Math.pow(x, 2);
		}
		double mean = sum / 10.00;
		double a = 	Math.pow(sum, 2) / 10;
        double de = Math.sqrt((d - a) / 9);
		System.out.print("The mean is :");
		System.out.printf("%.2f",mean);
		System.out.print("\n");
		System.out.print("The standard deviation is :");
		System.out.printf("%.5f",de);
	}

}
