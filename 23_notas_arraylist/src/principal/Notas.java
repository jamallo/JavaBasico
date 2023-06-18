package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		ArrayList<Double> notas=new ArrayList<>();
		rellenarNotas(notas);
		System.out.printf("La media es: %.2d",media(notas));
		System.out.println("La nota mayor es: "+mayor(notas));
		System.out.println("La nota menor es: "+menor(notas));
		imprimirAprobados(notas);
	}
	private static void rellenarNotas(ArrayList<Double> notas) {
		Scanner sc=new Scanner(System.in);
		int resp;
		do {			
			System.out.println("Introduce nota");
			notas.add(sc.nextDouble());
			System.out.println("Si deseas introducir otr nota escribe 1, sino 0");
			resp=sc.nextInt();
		}while(resp==1);
	}
	private static double media(ArrayList<Double> notas) {
		double media=0.0;
		for(double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	private static double mayor(ArrayList<Double> notas) {
		double mayor=notas.get(0);//inicializamos variable con primera nota
		for(double n:notas) {
			//si encontramos una nota más alta, actualizamos la variable mayor
			/*if(n>mayor) {
				mayor=n;
			}*/
			mayor=Math.max(n, mayor);
		}
		return mayor;
	}
	private static double menor(ArrayList<Double> notas) {
		double menor=notas.get(0);//inicializamos variable con primera nota
		for(double n:notas) {
			//si encontramos una nota más alta, actualizamos la variable mayor
			/*if(n<menor) {
				menor=n;
			}*/
			menor=Math.min(n, menor);
		}
		return menor;
	}
	private static void imprimirAprobados(ArrayList<Double> notas) {
		System.out.println("Aprobados:");
		//aprobados
		for(double n:notas) {
			if(n>=5) {
				System.out.println(n);
			}
		}
	}
}
