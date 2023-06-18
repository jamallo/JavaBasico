package Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class AgendaService {
	
	String ruta = "D:\\Users\\temporal";
	public void guardarContacto(String nombre) {

		try (FileOutputStream fos = new FileOutputStream(ruta, true); PrintStream out = new PrintStream(fos);) {
			// creamos FileOutputStream que nos permita añadir el contacto
			out.println(nombre);
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("Error de escritura");
		}

	}
	public boolean buscarContacto(String nombre) {
		 boolean encontrado = false;
	        try(FileReader fr = new FileReader(ruta);
	                BufferedReader bf = new BufferedReader(fr);) {            
	                String dato = bf.readLine(); //lee una linea del fichero
	                while(dato!=null) {
	                    if(dato.equalsIgnoreCase(nombre)) {
	                        encontrado= true;
	                    }
	                    dato = bf.readLine();

	                }
	            }catch(IOException ex) {
	                ex.printStackTrace();
	            }
	        return encontrado;
	}
	
	public ArrayList<String> contactos() {
	        ArrayList<String> todos = new ArrayList<>();
	        try(FileReader fr = new FileReader(ruta);
	               BufferedReader br = new BufferedReader(fr)){
	            String dato = br.readLine();
	            
	            while(dato!=null) {
	                todos.add(dato);
	            }    
	         } catch (IOException e) {
	            e.printStackTrace();
	            
	            }
	        
	        return todos;
	        
	}        

}
