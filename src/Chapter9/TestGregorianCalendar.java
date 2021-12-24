package Chapter9;

import java.util.GregorianCalendar;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(GregorianCalendar.YEAR) + "年"
		+ g.get(GregorianCalendar.MONTH) + "月" + g.get(GregorianCalendar.DATE) + "日");
		
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR) + "年"
				+ g.get(GregorianCalendar.MONTH) + "月" + g.get(GregorianCalendar.DATE) + "日");
		
	}

}
