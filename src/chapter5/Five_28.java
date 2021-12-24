package chapter5;

import java.util.*;

public class Five_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		int d = input.nextInt();
		int cnt = 0;
		for(int i = 1 ;i <= 12; i++)
		{
			switch(i) {
			case 1: System.out.print("January 1, " + y + " is "); break;
			case 2: cnt += 31; System.out.print("February 1, " + y + " is "); break;
			case 3: 
				if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
					cnt += 29;
				else
					cnt += 28;
				System.out.print("March 1, " + y + " is "); break;
			case 4: cnt += 31; System.out.print("April 1, " + y + " is "); break;
			case 5: cnt += 30; System.out.print("May 1, " + y + " is "); break;
			case 6: cnt += 31; System.out.print("June 1, " + y + " is "); break;
			case 7: cnt += 30; System.out.print("July 1, " + y + " is "); break;
			case 8: cnt += 31;System.out.print("Augest 1, " + y + " is "); break;
			case 9: cnt += 31;System.out.print("September 1, " + y + " is "); break;
			case 10: cnt += 30;System.out.print("October 1, " + y + " is "); break;
			case 11: cnt += 31; System.out.print("November 1, " + y + " is "); break;
			case 12: cnt += 30; System.out.print("December 1, " + y + " is "); break;
			}
			int j = (d + cnt) % 7;
			switch(j) {
			case 0: System.out.println("Sunday");break;
			case 1: System.out.println("Monday");break;
			case 2: System.out.println("Tuesday");break;
			case 3: System.out.println("Wednesday");break;
			case 4: System.out.println("Thursday");break;
			case 5: System.out.println("Friday");break;
			case 6: System.out.println("Saturday");break;
			}
		}
		

	}

}
