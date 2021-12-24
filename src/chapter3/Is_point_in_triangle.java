package chapter3;

import java.util.Scanner;

public class Is_point_in_triangle {   
	//判断点是否在三角形内，可以求点与三角形的
	//三个点形成的三个三角形的面积是否等于大三角形的面积
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a point's x- and y-coordinates:");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		int  area = (200 * 100) / 2; //10000
		
		double S1 = (100 * x) / 2;  //5052
		double S2 = (200 *y) / 2 ;   //2550
		
		double a = Math.sqrt(Math.pow(x, 2) + Math.pow((100 - y), 2));
		double b = Math.sqrt(Math.pow((200 - x),2) + Math.pow(y, 2));
		double c = Math.sqrt(Math.pow(100, 2) + Math.pow(200, 2));
		double p = (a + b + c) / 2.0;
		double S3 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		if((int)(S1 + S2 + S3) != area) {
			System.out.println("The point is not in the triangle");
			
		}
		else System.out.println("The point is in the triangle");
		
	}

}
