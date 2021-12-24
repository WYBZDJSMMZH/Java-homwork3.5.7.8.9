package chapter5;

public class Number_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j = 1,k = 1;
		for(i = 1; i <= 8 ; i++) {
			for(j = i * 2; j <= 15; j++)
				System.out.print("  ");
			for(k = 1,j = 1 ; j < Math.pow(2.0,i-1); k++) {
				System.out.format("%4d",j);
				j =(int)Math.pow(2.0,k);
			}
			
			for(k = i-1 ; k >= 0; k-- ) {
				j =(int)Math.pow(2.0,k);
				System.out.format("%4d", j);
			}
			System.out.print("\n");
		}
		
	}

}
