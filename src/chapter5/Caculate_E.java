package chapter5;

public class Caculate_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double i = 10000; i <= 100000; i += 10000) {
			double e = 1;
			for(double j = 1; j<=10000 ; j++) {
				double item = 1;
				for(double k = j ; k > 0; k--) {
					item = item * k;
				}
				 e = e + 1.0 / item;
			}
			System.out.println(e);
		}

	}

}
