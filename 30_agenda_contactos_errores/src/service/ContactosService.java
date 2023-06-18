package service;

import java.util.HashMap;

import model.Contacto;

public class ContactosService {
	HashMap<Integer,Contacto> contactos=new HashMap<>();
	public boolean guardarContacto(Integer numero, String nombre,String email, int edad) {
		//si la clave está libre, el contacto se puede añadir
		if(contactos.containsKey(numero)) {
			//primero creamos el objeto contacto y lo rellenamos
			Contacto contacto=new Contacto(numero,nombre,email,edad);
			/*contacto.setEdad(edad);
			contacto.setEmail(email);
			contacto.setNombre(nombre);
			contacto.setTelefono(numero);*/
			//añadimos el objeto contacto entero
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
		contactos.remove(0);
	}
	public Contacto[] contactos() {
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
