package chapter5;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of lines:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i,j,k;
		for(i = 1; i <= n; i++) {
			for(j = 2 * i; j <= 2*n-1; j++) {
				System.out.print("  ");
			}
			for(k = i; k > 0; k--) {
				System.out.format("%4d",k);
			}
			for(k = 2; k<= i;k++) {
				System.out.format("%4d",k);
			}
			System.out.print("\n");
		}

	}

}
