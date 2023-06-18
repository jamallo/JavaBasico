package principal;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		// A partir de una nota almacena en una variable
		// el programa mostrará un mensaje indicando:
		// 1 - 4 : suspenso
		// 5 - 6 : aprobado
		// 7 - 8 : notable
		// 9 - 10 : sobresaliente
		// otro valor: nota no válido
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una nota");
		int nota= teclado.nextInt();
		
		System.out.println("Con if: ");
		
		if (nota<=4) {
			System.out.println("Suspenso");
		} else if (nota == 5 || nota == 6) {
			System.out.println("Aprobado");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Nota no válida");
		}
		
		// -------------
		
		System.out.println("Con switch: ");
		
		switch(nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota no válida");
		}
	}

}
