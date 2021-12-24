package chapter5;

import java.util.*;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount:");
		double loan = input.nextDouble();
		System.out.print("Number of Years:");
		int year = input.nextInt();
		String s1 = "Interest Rate",
				s2 = "Monthly Payment",
				s3 = "Total Payment";
		System.out.printf("%-20s %-20s %-20s\n", s1,s2,s3);
		for(double rate = 5; rate <= 8; rate += 0.125) {
			System.out.printf("%.3f",rate);
			System.out.printf("%-16c",'%');
			double mr = rate/1200;
			double mp = loan * mr / (1 - 1/Math.pow(1 + mr, year * 12));
			double total = mp * year * 12;
			System.out.printf("%-20.2f %-20.2f\n",mp,total);
		}
	}

}
