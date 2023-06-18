package javabeans;

public class Ciudad {
	
	String nombre;
	String pais;
	int habitantes;
	
	//Constructor:
	public Ciudad(String nombre, String pais, int habitantes) {
		this.nombre = nombre;
		this.pais = pais;
		this.habitantes = habitantes;
		
		
	//setter y getter:
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
	
}
