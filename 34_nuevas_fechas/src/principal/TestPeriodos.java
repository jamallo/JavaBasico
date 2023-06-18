package principal;

import java.time.LocalDate;
import java.time.Period;

public class TestPeriodos {

	public static void main(String[] args) {

		LocalDate fnacimiento = LocalDate.of(1940, 10, 20);
		LocalDate ffallecimiento = LocalDate.of(2035, 4, 30);
		//¿cuánto ha vivido?
		
		System.out.println(fnacimiento);
		
		Period period = Period.between(fnacimiento, ffallecimiento);
		System.out.println(period.toTotalMonths());
	}

}
