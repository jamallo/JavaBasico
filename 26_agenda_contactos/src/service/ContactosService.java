package service;

import java.util.Collection;
import java.util.HashMap;

public class ContactosService {
	HashMap<Integer,String> contactos=new HashMap<>();
	public boolean guardarContacto(Integer numero, String nombre) {
		//si la clave está libre, el contacto se puede añadir
		if(!contactos.containsKey(numero)) {
			contactos.put(numero, nombre);
			return true;
		}else {
			return false;
		}		
	}
	public String buscarContacto(Integer numero) {
		return contactos.get(numero);		
	}
	public void eliminarContacto(Integer numero) {
		contactos.remove(numero);
	}
	public String[] nombres() {
		/*String[] res=new String[contactos.size()];
		Collection<String> col=contactos.values();
		int i=0;
		for(String n:col) {
			res[i]=n;
			i++;
		}
		return res;*/
		
		return contactos.values().toArray(new String[0]);
	}
}
