package principal;

import java.text.Normalizer;
import java.util.Scanner;



public class ContarVocales {

	public static void main(String[] args) {
        // Realizar un programa que solicite al usuario la introducción de un texto
		// después, nos dirá cuantas vocales contiene dicho texto
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine().toLowerCase();
		int vocales = 0;
		
		texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");
		
		for (int i = 0; i < texto.length(); i++) {
			switch (texto.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vocales++;
					break;
			} 
		}
		System.out.println("Las vocales son: " + vocales);
		
		
	}

}
