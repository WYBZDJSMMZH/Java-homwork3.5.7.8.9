package chapter5;

public class Five_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ;i <= 10000 ; i++) {
			int num = 0;
			for(int j = 1 ;j <= i/2 ;j++) {
				if(i % j == 0) {
					num += j;
				}	
			}
			if(num == i)
				System.out.println(i);
		}

}
}
