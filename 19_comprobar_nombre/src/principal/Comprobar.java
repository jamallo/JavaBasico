package principal;
import java.util.Scanner;
public class Comprobar {
    public static void main(String[] args) {
        String nombres="Juan,Ana,Maria,Ana,Marcos,Raquel,Juan,Ana,Martín";
        // solicitar la introducción de un nombre e indicar cuantas veces se repite
        
        String [] datos=nombres.split(",");
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca nombre a buscar: ");
        String nombre = sc.nextLine();
        int repe=0;
        for (String n:datos) {
            if(nombre.equals(n)) {
                repe++;
            }
        }
        System.out.println("El nombre seleccionado aparece : "+repe+" veces.");
    }
}
