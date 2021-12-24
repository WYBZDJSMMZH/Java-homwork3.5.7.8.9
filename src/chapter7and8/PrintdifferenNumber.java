package chapter7and8;

import java.util.*;
public class PrintdifferenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 10 numbers:");
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		
		for(int i=0;i<10;i++) {
			numbers[i] = input.nextInt();
		}
		
		int[] copynumbers = new int[10];
		copynumbers[0] = numbers[0];
		
		int counts = 1;
		
		for(int i=1;i<10;i++) {
			boolean flag = false;
			
			for(int k=0;k<counts;k++) {
				if(numbers[i] == copynumbers[k]) 
					flag = true;
			}
			
			if(!flag) {
				copynumbers[counts] = numbers[i];
				counts++;
			}
		}
		System.out.println("The number of distinct number is " + counts);
		System.out.print("The distinct number are:");
		for(int i=0;i<counts;i++) {
			System.out.print(copynumbers[i] + " ");
		}

	}

}
