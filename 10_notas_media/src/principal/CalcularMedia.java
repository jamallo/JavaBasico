package principal;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// Realizar un programa que solicite al usuario la introducción
		// de notas entre 1 y 10, hasta la introducción de una nota no válida
		// momento en el que nos mostrará la media de las notas introducidas
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la nota entre 1 y 10: ");
		int nota = teclado.nextInt();
		int i = 2;
		while (nota >= 1 && nota <= 10)  {
			System.out.println("Introduce otra nota entre 1 y 10");
			int media = nota;
			nota = teclado.nextInt();
			media = (media + nota);
			System.out.println("La media es: " + media/i);
			
		
			
		}
		
		
		/*Scanner teclado = new Scanner (System.in);
		double media=0;
		int nota;
		int i = 0;
		System.out.println("Introduce la nota entre 1 y 10: ");
		nota = teclado.nextInt();
		
		while (nota > 0 && nota <= 10) {
			media+=nota;
			i++;
			System.out.println("Introduce la nota entre 1 y 10: ");
			nota = teclado.nextInt();
		}
		
		media/=i;
		System.out.println("La nota media es: " + media);*/
	}

}
