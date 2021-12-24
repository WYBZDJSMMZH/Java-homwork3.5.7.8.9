package chapter3;

import java.util.*;

public class Isbn {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int d1 = m / 10 / 10/ 10 /10 /10 / 10 /10 / 10 % 10;
		int d2 = m / 10 / 10/ 10 /10 /10 / 10 /10 % 10;
		int d3 = m / 10 / 10/ 10 /10 /10 / 10 % 10;
		int d4 = m / 10 / 10/ 10 /10 /10 % 10;
		int d5 = m / 10 / 10/ 10 /10 % 10;
		int d6 = m / 10 / 10/ 10 % 10;
		int d7 = m / 10 /10 % 10;
		int d8 = m / 10 % 10;
		int d9 = m % 10;
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9 ) % 11;
		if(d10 == 10)
			System.out.println("The ISBN-10 number is" + m + "X");
		else
			System.out.println("The ISBN-10 number is " + m + d10);
			
		
	}

}
