package service;

import java.util.HashMap;
import model.Contacto;


public class ContactosService {
	HashMap<Integer,Contacto> contactos=new HashMap<>();
	public boolean guardarContacto(Integer numero, String nombre, String email, int edad) {
		//si la clave está libre, el contacto se puede añadir
		if(!contactos.containsKey(numero)) {
			Contacto contacto = new Contacto (numero, nombre, email , edad);
//			contacto.setTelefono(numero);
//			contacto.setNombre(nombre);
//			contacto.setEmail(email);
//			contacto.setEdad(edad);
			contactos.put(numero, contacto);
			return true;
		}else {
			return false;
		}		
	}
	public Contacto buscarContacto(Integer numero) {
		return contactos.get(numero);		
	}
	public void eliminarContacto(Integer numero) {
		contactos.remove(numero);
	}
	public Contacto [] contactos() {
		/*String[] res=new String[contactos.size()];
		Collection<String> col=contactos.values();
		int i=0;
		for(String n:col) {
			res[i]=n;
			i++;
		}
		return res;*/
		
		return contactos.values().toArray(new Contacto[0]);
	}
}
