package principal;

public class Temperaturas {

	public static void main(String[] args) {
		String temperaturas = "Oviedo-11.6;Soria-4.5;Madrid-19.4;Sevilla-21.6;Granada-23.9;Ávila-16.7;Pamplona-9.2";

		String[] ciudades = temperaturas.split(";");
		
//		String [] temp = null;
//		
//		for (int i = 0; i < ciudades.length; i++) {
//		temp = ciudades[i].split("-");
//		}

		
		double tempmin = Double.parseDouble(ciudades[1].split("-")[1]);
		double tempmax = Double.parseDouble(ciudades[1].split("-")[1]);
		String nombremin = ciudades[1].split("-")[0];
		String nombremax = ciudades[1].split("-")[0];
		
		for (String tm:ciudades) {
			String[] aux = tm.split("-");
			if (Double.parseDouble(aux[1])>tempmax) {
				tempmax=Double.parseDouble(aux[1]);
				nombremax=aux[0];
			}
			if (Double.parseDouble(aux[1])<tempmin) {
				tempmin=Double.parseDouble(aux[1]);
				nombremin=aux[0];
			}
		}
		
		System.out.println("La temperatura mayor es: " + nombremax);
		System.out.println("La temperatura menor es: " + nombremin);

		
		
//		// ------OTRA OPCIÓN TEMPERATURA
//		
//		double min = Double.parseDouble(datos[0]);
//		double max = Double.parseDouble(datos[0]);
//		
//		for (String tm:datos) {
//			min=Math.min(min, Double.parseDouble(tm));
//			max=Math.max(max, Double.parseDouble(tm));
//		}
//		System.out.println("La temperatura mayor es: " + max);
//		System.out.println("La temperatura menor es: " + min);
		//-------Otra-------
		
//		String [] datos = temperaturas.split(";");
//		
//		double temp [] = new double [ datos.length ];
//		double mayor = Double.MIN_VALUE;
//		double menor = Double.MAX_VALUE;
//
//		for (int i = 0; i < datos.length; i++) {
//		  temp[i] = Double.parseDouble(datos[i]);
//		  
//		  if (temp[i] > mayor) {
//		    mayor = temp[i];
//		  } else if (temp[i] < menor) {
//			menor = temp[i];
//		  }
//		}
//		System.out.println("La temperatura mayor es: " + mayor);
//		System.out.println("La temperatura menor es: " + menor);
//		

//		
//		// -------PRIMITIVA----------
//		int numeros [] = new int [5];
//		
//		for (int a = 0; a < 5;) {
////			while (numeros[a] == numeros[0] || numeros[a] == numeros[1] || numeros[a] == numeros[2] || numeros[a] == numeros[3])
////				continue;
//			numeros[a] = (int)(Math.random()*45 + 1);
//			a++;
//			
//		
//
//		}
//		System.out.println("Los números son: \n"+ numeros[0] + "\n" + numeros[1] + "\n" + numeros[2] + "\n" + numeros[3] + "\n" + numeros[4]);
	}

}
