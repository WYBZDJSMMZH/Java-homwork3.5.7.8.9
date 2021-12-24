package chapter5;

import java.util.Scanner;

public class Five_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery_x = (int)Math.random()*10;
		int lottery_y = (int)Math.random()*10;
		while(lottery_y == lottery_x) {
			lottery_y = (int)Math.random()*10;
		}
		int lottery = lottery_x * 10 + lottery_y;
		System.out.println(lottery);

		System.out.print("Enter a two-digit integer:");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int x = guess % 10;
		int y = guess / 10 % 10;
		if(guess == lottery) {
			System.out.println("Exact mach :you win $10000");
		}
		if(lottery_x == y && lottery_y==x) 
			System.out.println("Match all digits : you win $3000");
		
		if(lottery_x == y || lottery_y==x)	
			System.out.println("Match all digits : you win $1000");
		else
			System.out.println("Sorry no match!");


	}

}
