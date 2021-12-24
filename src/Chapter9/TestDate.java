package Chapter9;

public class TestDate {

	public static void main(String[] args) {
		//创建一个Date类
		java.util.Date date=new java.util.Date();
		
		
			date.setTime(10000);
			System.out.println(date.toString());
			
			date.setTime(100000);
			System.out.println(date.toString());
			
			date.setTime(1000000);
			System.out.println(date.toString());
			
			date.setTime(10000000);
			System.out.println(date.toString());
			
			date.setTime(100000000);
			System.out.println(date.toString());
			
			date.setTime(1000000000);
			System.out.println(date.toString());
			
			//注意：长整数要在后面加上“L”，不然不能被识别
			date.setTime(10000000000L);
			System.out.println(date.toString());
			
			//注意：长整数要在后面加上“L”，不然不能被识别
			date.setTime(100000000000L);
			System.out.println(date.toString());
			
	}
 
}

