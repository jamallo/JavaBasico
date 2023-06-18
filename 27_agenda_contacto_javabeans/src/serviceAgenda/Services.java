package serviceAgenda;

import java.util.Collection;
import java.util.HashMap;

public class Services {

	//Agenda de contacto
//	1. -Nuevo contacto
//	2. -Recuperar contacto
//	3. -Eliminar contacto
//	4. -Mostrar todos
//	5. -Salir
//	
//	1: pide teléfono y nombre, si el teléfono ya existe no se puede hacer nada
//	2: pide teléfono y nos muestra el nombre de la persona
//	3: pide teléfono y elimina ese contacto
//	4: Muestra todos los nombre
	
	
	HashMap<Integer,String> contactos = new HashMap<>();
	
	public void nuevoContacto (int numero, String nombre ) {
		if (!contactos.containsKey(numero)) {
		contactos.put(numero, nombre);
		} 
	}
	
	public String obtenerContacto (int numero) {
		return contactos.get(numero);
	}
	
	public void eliminarContacto (int numero) {
		contactos.remove(numero);
	}
	
	public Collection<String>  mostrarContactos () {
		return contactos.values();
	} 
	
}
