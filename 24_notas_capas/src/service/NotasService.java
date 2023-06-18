package service;

import java.util.ArrayList;

public class NotasService {
	private ArrayList <Double> notas = new ArrayList<>();
	
	public void guardarNota ( double nota ) {
		notas.add(nota);
	}
	
	
	
	public double realizarMedia () {
		double media = 0;
		for (double n: notas) {
			media+=n;
		} return media/notas.size();
	}
	
	public double obtenerMayor () {
		double mayor = notas.get(0);
		for (double n: notas) {
			mayor = Math.max(n, mayor);
			//}
		} return mayor;
	}
	
	public double obtenerMenor () {
		double menor = notas.get(0);
		for (double n: notas) {
			menor = Math.min(n, menor);
			//}
		} return menor;
	}
	public int totalAprobados() {
		int total = 0;
		for(double d:notas) {
			if ( d >= 5) {
				total++;
			} 
		} return total;
	}
	
	public void eliminarNota () {
		for(int d = notas.size(); d > notas.size(); d--) {
			if ( notas.get(d) < 5) {
				notas.remove(d);
			} 
		}
	}
	
	public ArrayList<Double> ensenarNotas () {
		 return notas;	
	}
}
