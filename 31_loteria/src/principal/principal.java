package principal;


public class principal {

	public static void main(String[] args) {
		generar(generarNumero);
		
		

		
		
		
		
		
	}
	
	static int[] combinacion = new int [6];
	static int generarNumero = (int) (Math.random()*49 + 1);
	static boolean res;
	
	public static boolean repetido () {
		
		for (int i = 0 ; i < 5 ;) {
				if (combinacion[i] == generarNumero) {
					res = true;										
				} else {
					res = false;
				}
//					combinacion[i] = generarNumero;
//					System.out.println(combinacion[i]);
//					i++;
		}
		return res;
	}
	
	public static void generar (int generarNumero) {
		if (repetido()) {
			for (int i = 0; i < 5; i++) {
				combinacion [i] = generarNumero;
				System.out.println(combinacion);

			}
		}
	}
}
