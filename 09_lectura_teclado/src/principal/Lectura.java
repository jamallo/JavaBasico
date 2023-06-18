package principal;

import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {
		// Pida la introducción de un número y lo muestre por pantalla
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = teclado.nextInt();
		System.out.println("El número es: " + numero);
	}

}
