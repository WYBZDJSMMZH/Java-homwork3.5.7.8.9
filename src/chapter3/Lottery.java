package chapter3;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random()*1000);
		int a, b, c;
		 a = lottery % 10;
		 b = lottery / 10 % 10;
		 c = lottery / 10 / 10;
		System.out.print("Enter a three-digit integer:");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int x , y , z;
		x = guess % 10;
		y = guess / 10 % 10;
		z = guess / 10 / 10;
		
		if(guess == lottery) {
			System.out.println("Exact mach :you win $10000");
		}
		else if((a == x && b == z && c == y) || (a == z && b == y && c == x) || (a == y && b == x && c == z))
			System.out.println("Match all digits : you win $3000");
		else if((a == y && b == z && c == x) || (a == z && b == x && c == y))
			System.out.println("Match all digits : you win $3000");
		else if(a == x || a == y || a == z || b == x || b == y || b == z || c == x || c == y || c == z)
			System.out.println("Match all digits : you win $1000");
		
	}

}
