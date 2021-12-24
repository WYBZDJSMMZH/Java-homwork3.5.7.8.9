package chapter5;

public class Tutition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		double rate = 0.05;
		double total = 0.0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 4 ;j++) {
				total += tuition;
			}
			tuition = (1 + rate) * tuition;
		}
		System.out.println(tuition);
		System.out.println(total);
		

	}

}
