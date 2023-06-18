package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date d1 = new Date();
		
		System.out.println(d1); //fecha de hoy
		
		Date d2 = new Date(202445595959L);
		
		System.out.println(d2); //fecha modificada
		
		System.out.println(d1.before(d2)); // false
		System.out.println(d1.compareTo(d2)); //1
		
		//formateado/parseado:
		
		String formato = "dd/MM/yyyy HH:mm:ss"; //cambia el formato
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		// formateado:
		System.out.println(sdf.format(d1)); //formato indicado
		
		String fecha = "11/08/2021 10:11:12";
		Date d3 = sdf.parse(fecha);
		System.out.println(d3); //parsea la fecha
		
;	}

}
