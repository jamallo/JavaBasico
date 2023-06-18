package principal;

import java.util.Scanner;

public class NotasModular {

	public static void main(String[] args) {
		double[] notas = new double [10];
		rellenarNotas(notas);
		System.out.println("La media es:" + media(notas));
		System.out.println("La nota mayor es: " + mayor(notas));
		System.out.println("La nota menor es: " + menor(notas));
		imprimirAprobados(notas);
	}

	private static void rellenarNotas( double [] notas) {
		Scanner teclado = new Scanner (System.in);
		for (int i=0; i<notas.length; i++) {
			System.out.println("Introduce nota: ");
			notas[i] = teclado.nextDouble();
		}
	}
	
	private static double media ( double [] notas) {
		double media = 0.0;
		for (double n: notas) {
			media+=n;
		} return media/notas.length;
	}
	
	private static double mayor ( double [] notas) {
		double mayor = notas [0];
		for (double n: notas) {
//			if (n > mayor) {
//				mayor = n;
			mayor = Math.max(n, mayor);
			//}
		} return mayor;
	}
	
	private static double menor ( double [] notas) {
		double menor = notas [0];
		for (double n:notas) {
//			if(n<menor) {
//				menor = n;
			menor = Math.min(n, menor);
			//}
		} return menor;
	}
	
	private static void imprimirAprobados ( double [] notas) {
		System.out.println("Aprobado");
		for(double n: notas) {
			if (n>=5) {
				System.out.println(n);
			}
		}
	}
}
