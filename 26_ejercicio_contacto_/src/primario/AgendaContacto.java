package primario;

import java.util.Scanner;

import serviceAgenda.Services;

public class AgendaContacto {
	
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

	public static void main(String[] args) {

		Services contactos = new Services();
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion;
		String nombre;
		int numero;
		
		do {
			System.out.println("Selecciona una opción: "
					+ "\n 1. Nuevo Contacto "
					+ "\n 2. Obtener un contacto"
					+ "\n 3. Eliminar un contacto"
					+ "\n 4. Mostrar todos los contacto"
					+ "\n 5. Salir");
			opcion = Integer.parseInt(teclado.nextLine());
			switch(opcion) {
				case 1: System.out.println("Introduce el teléfono que quieres añadir");
						numero = Integer.parseInt(teclado.nextLine());
						System.out.println("Introduce el nombre del contacto a añadir");
						nombre = teclado.nextLine();
						contactos.nuevoContacto(numero,nombre);
						System.out.println("Contacto añadido");
						break;
				case 2: System.out.println("Introduce el teléfono del contacto que quieres obtener");
						numero = Integer.parseInt(teclado.nextLine());
						System.out.println(contactos.obtenerContacto(numero));
						
						break;
				case 3: System.out.println("Introduce el teléfono que quieres eliminar");
						numero = Integer.parseInt(teclado.nextLine());
						contactos.eliminarContacto(numero);
						System.out.println("Contacto eliminado");
						break;
				case 4: System.out.println("Los contactos son: " );
						System.out.println(contactos.mostrarContactos());
						break;
				case 5: System.out.println("Hasta pronto");					
			}
		} while (opcion>=1&&opcion<=5);
	}

}
