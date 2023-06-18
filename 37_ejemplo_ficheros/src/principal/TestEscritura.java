ipackage principal;

import java.io.IOException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		// escribir los días de la semana en un fichero
		
		String ruta = "D:\\Users\\temporal\\dias_semana.txt";
		PrintStream out = null;
		try {
			out = new PrintStream(ruta);
		
			out.println("viernes");
			out.println("sábado");
			out.println("domingo");
			System.out.println("Proceso completado");
			
		
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("Error de escritura");
		} finally {
			if (out!=null) {
				out.close();
			}
		}
	}

}
