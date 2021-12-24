package chapter5;

import java.util.*;

public class Five_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		int total = 0;
		int a,t;
		t = Integer.parseInt(n);   //字符串和整数之间的转换；
		for(int i = 9 ; i >= 1;i--) {
			a = t % 10;
			total += a * i;
			t = t / 10;
		}
		int sum = total % 11;
		if(sum == 10) 
			System.out.println("The ISBN-10 number is " + n + "X");
		else
			System.out.println("The ISBN-10 number is " + n + sum);
	}

}
