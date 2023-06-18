package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// Hacer un programa que solicite la introducción de 10 notas (entre 1 y 10)
		// y las guarde en un array
		// Después, se mostrarán los siguientes datos:
		// - Nota media
		// - Nota más baja
		// - Nota más alta
		// - Muestra las notas aprobadas
		
		Scanner teclado = new Scanner (System.in);		
		double [] notas = new double [10];		
		double media = 0;
		double menor;
		double mayor;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce notas");
			notas[i] = teclado.nextDouble();
		}
		//Calcular media:
		for (double n:notas) {
			media += n;
		}
		System.out.println("La media es: " + media / notas.length);
		
		//La nota más alta
		mayor = notas[0];
		for (double n:notas) {
			if ( n > mayor) {
				mayor = n;
			}
		}
		System.out.println("Nota más alta: " + mayor);
		menor = notas[0];
		for (double n:notas) {
			if (n < menor) {
				menor = n;
			}
		}
		System.out.println("Nota más baja: " + menor);
		System.out.println("Aprobados:");
		
		for(double n:notas) {
			if (n >= 5) {
				System.out.println(n);
			}
		}
		
		
		
	} 

}
