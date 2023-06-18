package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {
		// escribir los días de la semana en un fichero
		
		String ruta = "D:\\Users\\temporal\\dias_semana.txt";
		PrintStream out = null;
		FileOutputStream fos = null;
		try {
			// creamos FileOutputStream que nos permita añadir contenido
			fos = new FileOutputStream(ruta, true);
			out = new PrintStream(fos);
		
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			out.println("jueves");
			System.out.println("Proceso completado");
			
		
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("Error de escritura");
		} finally {	
			if (out!=null) {
				out.close();
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
