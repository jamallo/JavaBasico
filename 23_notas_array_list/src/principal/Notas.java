package principal;

import java.util.ArrayList;
import java.util.Scanner;



public class Notas {
	
	public static void main(String[] args) {
		//Nueva versión del ejercicio 12 de las notas, pero con ArrayList y sin límite de notas.
		//Cada vez que se pide una nota, se guarda y se pregunta si quiere introducir una nota nueva
		//se pide una nota nueva, si dice no, ya no se piden más.
		
		ArrayList <Double> notas = new ArrayList <>();
		
		rellenarNotas(notas);
		System.out.println("La media es:" + media(notas));
		System.out.println("La nota mayor es: " + mayor(notas));
		System.out.println("La nota menor es: " + menor(notas));
		imprimirAprobados(notas);
	}	
		
		public static void rellenarNotas (ArrayList<Double> notas) {
			Scanner sc= new Scanner (System.in);
			int continuar;
		
			do {	
				System.out.println("Introduce la nueva nota");
				notas.add(sc.nextDouble());
				System.out.println("¿Quiéres introducir más notas? (1 o 0)");
				continuar=sc.nextInt();
			} while (continuar == 1);
		
		}
		
		private static double media ( ArrayList<Double> notas) {
			double media = notas.get(0);
			for (double n: notas) {
				media+=n;
			} return media/notas.size();
		}
		
		private static double mayor ( ArrayList <Double> notas) {
			double mayor = notas.get(0);
			for (double n: notas) {
				mayor = Math.max(n, mayor);
				//}
			} return mayor;
		}
		
		private static double menor ( ArrayList <Double> notas) {
			double menor = notas.get(0);
			for (double n:notas) {
				menor = Math.min(n, menor);
				//}
			} return menor;
		}
		
		private static void imprimirAprobados ( ArrayList<Double> notas) {
			System.out.println("Aprobado");
			for(double n: notas) {
				if (n>=5) {
					System.out.println(n);
				}
			}
		}
		
}

