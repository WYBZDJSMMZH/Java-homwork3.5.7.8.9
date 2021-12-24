package chapter3;

import java.util.Scanner;
public class Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = input.nextInt();
		System.out.print("Enter month:");
		int month = input.nextInt();
		System.out.print("Enter the day of the month:");
		int day = input.nextInt();
		
		if(month == 1 || month == 2) {
			month = month + 12;
			year --;
		}
		
		int j = (int)(year/100);
		int k = year % 100;
		int h;
		h = (day + 26*(month+1)/10 + k + k/4 + j/4 + 5*j) % 7;
		switch(h) {
		case 0: System.out.println("Day of week is Saturday"); break;
		case 1: System.out.println("Day of week is Sunday"); break;
		case 2: System.out.println("Day of week is Monday"); break;
		case 3: System.out.println("Day of week is Tuseday"); break;
		case 4: System.out.println("Day of week is Wednesday"); break;
		case 5: System.out.println("Day of week is Thursday"); break;
		case 6: System.out.println("Day of week is Friday"); break;
		}
		

	}

}
