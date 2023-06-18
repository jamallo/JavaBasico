package principal;

import java.util.Scanner;

public class ComprobarEdad {

	public static void main(String[] args) {
		// Hacer un programa que lea las edades de 5 personas
		// y las guarde en un array
		// después se pedirá la edad de corte , y el programa nos dirá
		// cuántas personas superan la edad de corte
		int [] edad = new int[5];
		edades(edad);
		int corte = edadCorte();
		System.out.println(lasEdades(edad, corte));
	}
	
	public static void edades (int [] edad) {
		Scanner teclado = new Scanner (System.in);
		for (int i=0; i<edad.length; i++) {
			System.out.println("Introduce la edad: ");
			edad[i] = teclado.nextInt();
		}
	}
	
	public static int edadCorte() {
		Scanner teclado = new Scanner (System.in);
		 
			System.out.println("Introduce la edad de corte: ");
			return teclado.nextInt();
	}
	
	
	public static int lasEdades (int[] edad, int edadCorte) {
		int contador = 0;
		for (int e: edad) {
			if (e > edadCorte) {
				contador++;
			}
	}			return contador;

		
	
	

}
}
	
