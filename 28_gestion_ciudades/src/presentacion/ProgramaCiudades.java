package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import javabeans.Ciudad;
import service.CiudadesService;

public class ProgramaCiudades {
	

	static CiudadesService ciudadesService=new CiudadesService();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion=sc.nextInt();//lee la opción elegida
            switch(opcion) { //evaluamos
                case 1:
                    pedirCiudad();
                    break;
                case 2:
                    ciudadMasPoblada();
                    break;
                case 3:
                    ciudadesPorPais();
                    break;
                case 4:
                    System.out.println("---Adios---");
            }
        }while(opcion!=4);
    }
	
	static void mostrarMenu() {
		System.out.println("1. - Nueva Ciudad \n2. - Ciudad más poblada \n3. - Ciudades por país \n4. - Salir");
		
	}
	
	static void pedirCiudad() {
		Scanner teclado = new Scanner(System.in);
		int habitantes;
		String nombre, pais;
		System.out.println("Introduce ciudad");
		nombre = teclado.nextLine();
		System.out.println("Introduce país");
		pais = teclado.nextLine();
		System.out.println("Introduce habitantes");
		habitantes = Integer.parseInt(teclado.nextLine());
		ciudadesService.altaCiudad(nombre, pais, habitantes);
	}
	
	static void ciudadMasPoblada() {
        Ciudad ciudad=ciudadesService.masPoblada();
        System.out.println("La ciudad más poblada es: "+ciudad.getNombre());
    }
	 static void ciudadesPorPais() {
	        Scanner sc=new Scanner(System.in);
	        String pais;
	        System.out.println("Introduce pais");
	        pais=sc.nextLine();
	        ArrayList<Ciudad> resultado=ciudadesService.porPais(pais);
	        for(Ciudad c:resultado) {
	            System.out.println(c.getNombre());
	        }
	    }
}
