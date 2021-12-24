package Chapter9;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(1000);
		
		for(int i=1;i<=50;i++) {
			System.out.print(random.nextInt(100) + " ");
			if(i % 10 == 0)
				System.out.print("\n");
		}

	}

}
