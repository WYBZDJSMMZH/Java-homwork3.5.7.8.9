package chapter5;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int n = 0;
	
		for(int i = 101 ; i <= 2100; i ++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0 ) {
				System.out.print(i + " ");
				cnt ++;
				n ++;
			}
			if(n >= 10) {
				System.out.print("\n");
				n = 0;
			}
		}
//		int x =97 + (int) Math.random()*32;
		System.out.println(cnt);
//		System.out.println((char)x);
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		System.out.println(s.charAt(0));

	}

}
