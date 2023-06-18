package presentacion;

import java.util.ArrayList;
import java.util.Scanner;
import service.NotasService;

public class ProgramaNotas {

	public static void main(String[] args) {
        NotasService notas = new NotasService();
        Scanner sc = new Scanner(System.in);
        int opc;
        double nota;
        //Mostrar menu por pantalla.
        do {
            System.out.println("1. Grabar nota");
            
            System.out.println("2. Calcular media");
            
            System.out.println("3. Notas extremas");
            
            System.out.println("4. Total de aprobados");
            
            System.out.println("5. Eliminar notas suspensas");
            
            System.out.println("6. ver notas");
            
            System.out.println("6. Salir");

            opc = sc.nextInt();
            switch(opc) {
            case 1: System.out.println("Escriba la nota que quiere agregar");
                    nota = sc.nextDouble();
                    notas.guardarNota(nota);
                    break;
            case 2: System.out.println("La nota media es de: "+
                    notas.realizarMedia());
                    System.out.println();
                    break;
            case 3: 
                    System.out.println("La nota más alta es de: "+
                            notas.obtenerMayor());
                    System.out.println("La nota más baja es de: "+
                            notas.obtenerMenor());
                    break;
            case 4:
                    System.out.println("El número de aprobados es de: "+  notas.totalAprobados());
                    break;
            case 5:
            		notas.eliminarNota();
            		System.out.println("Notas suspensas eliminadas");
            case 6:
            		ArrayList<Double> totales=notas.ensenarNotas();
            		for(double n:totales) {
            			System.out.println(n);
            		}
            case 7:
            		System.out.println("Hasta pronto");
            }
        }while((opc==1)||(opc==2)||(opc==3)||(opc==4));
        
        
    }
    
}