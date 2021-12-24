package Chapter9;

import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("«Î ‰»Îa°¢b°¢c°¢d°¢e°¢fµƒ÷µ£∫");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();

		LinearEquation object=new LinearEquation(a,b,c,d,e,f);

		if(object.isSolvable()) 
			System.out.println("X:"+object.getX()+" y:"+object.getY());
		else
			System.out.println("The equation has no solution.");
		
	}

}

class LinearEquation{
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	this.e=e;
	this.f=f;
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
	double getD() {
		return d;
	}
	double getE() {
		return e;
	}
	double getF() {
		return f;
	}

	boolean isSolvable() {
		if((this.a*this.d-this.b*this.c) != 0)
			return true;
		else
			return false;
		}

	double getX() {
		double x=(this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return x;
	}

	double getY() {
		double y=(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return y;
	}
}