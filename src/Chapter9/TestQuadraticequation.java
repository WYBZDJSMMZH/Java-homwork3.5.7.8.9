package Chapter9;

import java.util.Scanner;

public class TestQuadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������a,b,c��ֵ��");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		Quadraticequation object = new Quadraticequation(a,b,c);
		
		System.out.println("a��ֵ��"+object.getA());
		System.out.println("b��ֵ��"+object.getB());
		System.out.println("c��ֵ��"+object.getC());

		if(object.getDiscriminant() > 0) 
			System.out.println("�б�ʽ����0������������r1:" + object.getRoot1() + " r2:" +object.getRoot2());
		if(object.getDiscriminant() == 0)
			System.out.println("�б�ʽ=0,����ֻ��һ���� r:"+object.getRoot1());
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
