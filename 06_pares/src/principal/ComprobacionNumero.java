package principal;

public class ComprobacionNumero {

	public static void main(String[] args) {
		int n1 = 23;
		int n2 = 5;
		int x = 8;
		int contar=0;
		
		// ¿Cuántos números hay entre x y el extremo más cercano?
		
		int a = Math.abs(x - n1) + 1;
		int b = Math.abs(x - n2) + 1;
		
		System.out.println("Con el if: ");

		
		if (a < b) {
			
			System.out.println(a);
		} else {

			System.out.println(b);
		}
		
		System.out.println("Con for: ");
		
		int extremo=Math.abs(n1 - x)<Math.abs(n2-x)?n1:n2;
		//int mayor=x>extremo?x:extremo;
		int mayor = Math.max(x, extremo);
		//int menor=x<extremo?x:extremo;
		int menor = Math.min(x, extremo);
		for (int i = menor; i<=mayor;i++) {
			contar++;
		}
		System.out.println("Total de números entre x y el extremo cercano" + contar);
		
	}

}
