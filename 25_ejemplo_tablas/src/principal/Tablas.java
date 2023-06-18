package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Tablas {

	public static void main(String[] args) {
		HashMap<Integer,String> alumnos = new HashMap<>();
		alumnos.put(45, "María"); //añadir
		alumnos.put(67, "Álex");
		System.out.println(alumnos.get(45)); //seleccionar clave
		Scanner sc = new Scanner (System.in);
		System.out.println("Clave: ");
		int clave = Integer.parseInt(sc.nextLine());
		if (alumnos.containsKey(clave)) { //comprobar si existe la clave
			System.out.println("La clave ya existe, no se puede añadir");
		} else {
			System.out.println("Introduce el nombre");
			String nombre = sc.nextLine();
			alumnos.put(clave, nombre);
		}
		
		Collection<String> valores=alumnos.values();// para pasar a Array
		for(String n:valores) {
			System.out.println(n);
		}
	}

}
