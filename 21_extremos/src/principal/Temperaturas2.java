package principal;

public class Temperaturas2 {

	public static void main(String[] args) {
		String temperaturas = "11.6;4.5;19.4;21.6;23.9;16.7;9.2";
		// Mostrar las temperaturas máxima y mínima
		
		String [] datos = temperaturas.split(";");
		
		double temp [] = new double [ datos.length ];
		double mayor = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;

		for (int i = 0; i < datos.length; i++) {
		  temp[i] = Double.parseDouble(datos[i]);
		  
		  if (temp[i] > mayor) {
		    mayor = temp[i];
		  } else if (temp[i] < menor) {
			menor = temp[i];
		  }
		}
		System.out.println("La temperatura mayor es: " + mayor);
		System.out.println("La temperatura menor es: " + menor);
		
		// ------OTRA OPCIÓN TEMPERATURA
		
		double min = Double.parseDouble(datos[0]);
		double max = Double.parseDouble(datos[0]);
		
		for (String tm:datos) {
			min=Math.min(min, Double.parseDouble(tm));
			max=Math.max(max, Double.parseDouble(tm));
		}
		System.out.println("La temperatura mayor es: " + max);
		System.out.println("La temperatura menor es: " + min);
		
		// -------PRIMITIVA----------
		int numeros [] = new int [5];
		
		for (int a = 0; a < 5;) {
//			while (numeros[a] == numeros[0] || numeros[a] == numeros[1] || numeros[a] == numeros[2] || numeros[a] == numeros[3])
//				continue;
			numeros[a] = (int)(Math.random()*45 + 1);
			a++;
			
		

		}
		System.out.println("Los números son: \n"+ numeros[0] + "\n" + numeros[1] + "\n" + numeros[2] + "\n" + numeros[3] + "\n" + numeros[4]);
	}

}
