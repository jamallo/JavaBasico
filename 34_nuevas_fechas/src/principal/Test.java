package principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		//¿Qué fecha será dentro de dos años, tres meses y cinco días?
		
		LocalDate factual = LocalDate.now();
		LocalDate futura = factual.plusYears(2).plusMonths(3).plusDays(5);
		System.out.println(futura);
		
		//¿Qué hora será dentro de 25 horas?
		
		LocalTime horaActual=LocalTime.now();
		LocalTime horaFutura= horaActual.plusHours(25);
		System.out.println(horaFutura);
	}

}
