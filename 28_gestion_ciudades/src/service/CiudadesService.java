package service;

import java.util.ArrayList;
import javabeans.Ciudad;


public class CiudadesService {
	
	public ArrayList <Ciudad> ciudades = new ArrayList<>();
	
	public void altaCiudad(String nombre, String pais, int habitantes) {
		Ciudad ciudad = new Ciudad (nombre, pais, habitantes);
		ciudades.add(ciudad);
	}
	
	public Ciudad masPoblada () {
		int habitantesMax = 0;
		Ciudad ciudad = null;
		for (Ciudad c: ciudades) {
			if(c.getHabitantes()<habitantesMax) {
				ciudad=c;
			}
		}
		return ciudad;
		
	}
	
	public ArrayList<Ciudad> porPais(String pais) {
		ArrayList<Ciudad> aux = new ArrayList<>();
		for (Ciudad ciudad : ciudades) {
            if (pais.equals(ciudad.getPais())) {
                aux.add(ciudad);
            }
        
        }
		return aux;
	}

}
