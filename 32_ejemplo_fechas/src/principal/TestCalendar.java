package principal;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.set(2001, 8, 20); // modificar componentes de fecha y recuperar componentes de la fecha
		System.out.println("Año: " + cal.get(Calendar.YEAR));
		System.out.println("Mes: " + cal.get(Calendar.MONTH));
		System.out.println("Día: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora: " + cal.get(Calendar.HOUR));
		System.out.println("Minutos: " + cal.get(Calendar.MINUTE));
		
		
		//conversion Calendar-Date
		Date d = cal.getTime();
		System.out.println(d);
		
		//conversion Date-Calendar
		Date d2 = new Date (23232323232322L);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2);
	}

}
