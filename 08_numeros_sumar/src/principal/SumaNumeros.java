package principal;

public class SumaNumeros {

	public static void main(String[] args) {
		//¿Hasta qué número tendremos que sumar empezando por 1
		// para alcanzar o superar el valor 1000?
		int i=0;
		int a=1;
		while(i<1000) {
			i+= a;
			a++;

		}
		System.out.println(a-1);
	}

}
