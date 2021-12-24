package chapter5;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 10000 ; j <= 100000; j += 10000) {
			double P = 0;
			for(int i = 1; i <= j ; i += 1) {
				double a = Math.pow(-1, i + 1) / (2*i-1);
				P += a;
			}
			System.out.println(4 * P);
		}
		

	}

}
