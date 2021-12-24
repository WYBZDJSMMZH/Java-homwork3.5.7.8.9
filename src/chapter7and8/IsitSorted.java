package chapter7and8;

import java.util.*;

public class IsitSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list:");
		int n = input.nextInt();
		int[] list= new int[n];
		System.out.print("Enter the contents of the list:");

		for(int i =0; i< n; i++) 
			list[i] = input.nextInt();
		System.out.print("The list has " + n + " integers ");
		for(int i =0;i<n;i++) 
			System.out.print(list[i] + " ");
		System.out.print("\n");
		if(isSorted(list)) 
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");
		
	}
	public static boolean isSorted(int[] list) {
		for(int i=0;i<list.length ;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i] > list[j])
					return false;
			}
		}
		return true;
	}

}
