package chapter5;

import java.util.*;

public class Five_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a decimal number:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		String s1 = "",s2 = "";
		while(x != 0) {
			int a = x % 8;
			s1 += String.valueOf(a);
			x /= 8;
		}
		for(int i =0; i < s1.length();i++) {
			s2 += s1.substring(s1.length()-i-1, s1.length() - i);
		}
		System.out.println(s2);
	}

}
