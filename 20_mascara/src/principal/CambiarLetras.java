package principal;

import java.util.Scanner;

public class CambiarLetras {

	public static void main(String[] args) {
		//realizar un programa que solicite un texto
		//sustituye las vocales por _
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine();
		StringBuilder texto1 = new StringBuilder(texto.toLowerCase());
		
		for (int i = 0; i < texto1.length(); i++) {
			switch(texto1.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					texto1.replace(i, i+1, "_");
			}
		}
		System.out.println("El texto es: \n" + texto1);

	}

}
