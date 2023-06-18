package principal;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		//hacer un programa que pida dos números y muestre
		//el resultado de dividir uno entre otro
		
		
		int n1, n2, res;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número");
			n1 = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce otro número");
			n2 = Integer.parseInt(sc.nextLine());
			res = n1/n2;
			System.out.println("La división es: " + res);
		} catch (NumberFormatException ex) {
			System.out.println("Te has equivocado al introducir el número, empieza otra vez.");
		} catch (ArithmeticException ex) {
			System.out.println("No se puede dividir entre 0, empieza otra vez.");
		} finally {
			System.out.println("El programa ha terminado");
		}
	}

}
