package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import model.Contacto;


public class ContactosService {
	private final String DIR = "D:\\Users\\temporal\\contactos.txt";
	
	public boolean guardarContacto(Integer numero, String nombre, String email, int edad) {
		if (buscarContacto(numero) == null)	{
			boolean res = false;
			//guardamos contacto en fichero
			try (FileOutputStream fos = new FileOutputStream(DIR, true); PrintStream out = new PrintStream(fos);) {
				// creamos FileOutputStream que nos permita añadir el contacto
				out.println(numero + ";" + nombre + ";" + email + ";" + edad);
				res=true;
			} catch (IOException ex) {
				ex.printStackTrace();
			} return res;
		} else {
			return false;
		}
	}
	
	public Contacto buscarContacto(Integer numero) {
		Contacto res = null;
		//localizamos contacto en el fichero
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(";");
				//comprobamos si el primer elemento del array
				//coincide con el número recibido
				if (Integer.parseInt(partes[0]) == numero) {
					//creamos el objeto Contacto a partir del array con las partes del mismo
					res = new Contacto(Integer.parseInt(partes[0]), partes[1], partes[2], Integer.parseInt(partes[3]));
					break;
				}
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return res;
	}
	
	public void eliminarContacto(Integer numero) {
		//recuperamos todos los contactos en memoria (ArrayList), eliminamos el contacto
		//de la colección, y volcamos la colección en el fichero en modo sobreescritura
		List<Contacto> contactos = contactos();
		for (int i = contactos.size() -1; i >= 0; i--) {
			if (contactos.get(i).getTelefono().equals(numero)) {
				contactos.remove(i);
			}
		}
		try (FileOutputStream fos = new FileOutputStream(DIR, true); 
				PrintStream out = new PrintStream(fos);) {
			// creamos FileOutputStream que nos permita añadir el contacto
				for(Contacto c:contactos) {
					out.println(c.getTelefono() + ";" + c.getNombre() + ";" + c.getEmail() + ";" + c.getEdad());
				}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Contacto> contactos() {
		ArrayList<Contacto> contactos = new ArrayList<>();
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(";");
				//creamos el objeto Contacto a partir del array con las partes del mismo
				contactos.add(new Contacto(Integer.parseInt(partes[0]), partes[1], partes[2], Integer.parseInt(partes[3])));
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return contactos;
	}
}
