package chapter5;

import java.util.*;

public class Five_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int y = input.nextInt();
		System.out.print("Enter the first day of the year: ");
		int date = input.nextInt();
		int total =31;
		for(int i = 1; i <= 12 ;i++) {
			int cnt = 0;
			switch(i) {
			case 1:total =31;System.out.println("         " + "January" + " " + y);break;
			case 2:
				if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
					total = 29;
				else
					total= 28;
				cnt += 31;System.out.println("         " + "February" + " " + y);break;
			case 3:
				if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
					cnt += 29;
				else
					cnt += 28;
				System.out.println("         " + "March" + " " + y);break;
			case 4:total = 30;cnt += 31; System.out.println("         " + "April" + " " + y);break;
			case 5:total =31;cnt += 30; System.out.println("         " + "May" + " " + y);break;
			case 6:total = 30;cnt += 31; System.out.println("         " + "June" + " " + y);break;
			case 7:total =31;cnt += 30; System.out.println("         " + "July" + " " + y);break;
			case 8:total =31;cnt += 31; System.out.println("         " + "Augest" + " " + y);break;
			case 9:total = 30;cnt += 31; System.out.println("         " + "September" + " " + y);break;
			case 10:total =31;cnt += 30; System.out.println("         " + "October" + " " + y);break;
			case 11:total = 30; cnt += 31; System.out.println("         " + "November" + " " + y);break;
			case 12:total = 31; cnt += 30; System.out.println("         " + "December" + " " + y);break;
			}
			System.out.println("-----------------------------");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			
		    date = (cnt + date) % 7;
			int n = 0;
			char ch = ' ';
			for(int s = 0 ;s < 7; s++) {
				if(date != s) {
					System.out.printf("%4c",ch);
					n++;
				}
				else
					break;
			}
			for(int k = 1; k <= total ; k++) {
				System.out.printf("%4d",k);
				n++;
				
				if(n == 7) {
					System.out.print("\n");
					n = 0;
				}
			}
			System.out.print("\n");
		}
	}

}
