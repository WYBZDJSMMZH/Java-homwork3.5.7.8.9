package chapter5;

import java.util.*;

public class Five_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a decimal number:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		String s1 = "",s2 = "";
		while(x != 0) {
			int a = x % 2;
			s1 += String.valueOf (a); //将数值转化成字符串。
			x /= 2;
		}
		for (int i = 0; i < s1.length(); i++) {
            s2 += s1.substring(s1.length() - 1 - i, s1.length() - i); //逆序字符串
        }
		System.out.println(s2);
	}

}
