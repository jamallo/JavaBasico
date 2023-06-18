package principal;

public class LanzarDados {

	public static void main(String[] args) {
		// Generar el lanzamiento de un dado
		
//		int dado = (int)(Math.random()*6 + 1);
//		System.out.println("Dado: " + dado);
		
		// Lanzar el dado 10.000 veces y mostrar el porcentaje de veces
		// que sale cada número
		
		int veces1 = 0;
		int veces2 = 0;
		int veces3 = 0;
		int veces4 = 0;
		int veces5 = 0;
		int veces6 = 0;
		
		for (int i = 0 ; i < 10000 ; i++) {
			int dado = (int)(Math.random()*6 + 1);
			if (dado == 1) {
				veces1++;
				
			} else if (dado == 2) {
				veces2++;
			} else if (dado == 3) {
				veces3++;
			} else if (dado == 4) {
				veces4++;
			} else if (dado == 5) {
				veces5++;
			} else if (dado == 6) {
				veces6++;
			}
		} System.out.println("número 1: " + (veces1 / 10000) * 100 + "%");
		System.out.println("número 2: " + (veces2 / 10000) * 100 + "%");
		System.out.println("número 3: " + (veces3 / 10000) * 100 + "%");
		System.out.println("número 4: " + (veces4 / 10000) * 100 + "%");
		System.out.println("número 5: " + (veces5 / 10000) * 100 + "%");
		System.out.println("número 6: " + (veces6 / 10000) * 100 + "%");
	
	}

}
