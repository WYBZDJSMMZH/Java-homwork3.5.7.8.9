package chapter7and8;

import java.util.*;
public class CountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the integers between 1 and 100:");

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		
		int n=0;
		int i=0;
		
		numbers[i] = input.nextInt();
		while(numbers[i]!=0) {
			i++;
			numbers[i] = input.nextInt();
			n++;
		}
		
		int[] copynumbers = new int[n];
		
		copynumbers[0] = numbers[0];
		int m =0;
		for(int j=1;j<n;j++) {
			boolean flag = false;
			
			for(int k=0;k<=m;k++) {
				if(numbers[j] == copynumbers[k]) {
					flag = true;
				}
			}
			
			if(!flag) {
				m++;
				copynumbers[m] = numbers[j];
			}
		}
		
		int[] counts = new int[m+1];
		for(int k=0; k<=m;k++) {
			counts[k] = 0;
			for(int j=0;j<n;j++) {
				if(numbers[j] == copynumbers[k])
					counts[k]++;
			}
		}
		
		for(int j =0;j<=m;j++) {
			System.out.print(copynumbers[j] + " ");
			System.out.print("occurs ");
			System.out.print(counts[j]+" ");
			System.out.println("times");
		}
	}
}
