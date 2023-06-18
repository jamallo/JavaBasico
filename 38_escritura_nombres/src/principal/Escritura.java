package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Escritura {
	public static void introducir() {
		String ruta = "D:\\Users\\temporal\\dias_semana.txt";
		PrintStream out = null;
		FileOutputStream fos = null;
		try {
		fos = new FileOutputStream(ruta, true);
		out = new PrintStream(fos);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = teclado.nextLine();
		out.println(nombre);
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
	public static void otro() {
		Scanner teclado = new Scanner(System.in);
			int res = 0;
		do  {
			introducir();
			System.out.println("¿Quiéres introducir otro nombre 1 - sí o 2 - no");
			res = Integer.parseInt(teclado.nextLine());
		} while (res == 1);
	}
	
	

	public static void main(String[] args) {
		otro();
		
		
		
		
		
	}

}
