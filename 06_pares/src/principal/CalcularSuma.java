package principal;

public class CalcularSuma {

	public static void main(String[] args) {
		// A partir de dos números en dos variables
		int a = 8;
		int b = 3;
		
		// Mostrar la suma de todos los número comprendidos entre a y b
		
		int suma=0;
		
		int mayor = a>b?a:b;
		int menor = a<b?a:b;
		
		for (; menor <= mayor; menor++) {
			suma = suma + menor;
		}
		System.out.println(suma);
			
	}

}
