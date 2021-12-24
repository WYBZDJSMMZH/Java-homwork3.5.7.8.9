package Chapter9;

import java.util.Scanner;

public class TestQuadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a,b,c的值：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		Quadraticequation object = new Quadraticequation(a,b,c);
		
		System.out.println("a的值："+object.getA());
		System.out.println("b的值："+object.getB());
		System.out.println("c的值："+object.getC());

		if(object.getDiscriminant() > 0) 
			System.out.println("判别式大于0，有两个根，r1:" + object.getRoot1() + " r2:" +object.getRoot2());
		if(object.getDiscriminant() == 0)
			System.out.println("判别式=0,方程只有一个根 r:"+object.getRoot1());
		else
			System.out.println("The equation has no roots.");
	
	}

}class Quadraticequation{
	double a;
	double b;
	double c;
	
	Quadraticequation(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double getA() {
		return a;
	}
	double getB() {
		return b;
	}
	double getC() {
		return c;
	}
	double getDiscriminant() {
		double p = Math.pow(b, 2) - 4*a*c;
		return p;
	}
	double getRoot1() {
		double r1 =(-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		return r1;
	}
	double getRoot2() {
		double r2 =(-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		return r2;
	}
}
