package Chapter9;

import java.util.GregorianCalendar;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(GregorianCalendar.YEAR) + "��"
		+ g.get(GregorianCalendar.MONTH) + "��" + g.get(GregorianCalendar.DATE) + "��");
		
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR) + "��"
				+ g.get(GregorianCalendar.MONTH) + "��" + g.get(GregorianCalendar.DATE) + "��");
		
	}

}
