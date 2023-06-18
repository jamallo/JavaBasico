package principal;

public class ComprobarNumero {

	public static void main(String[] args) {
		// cuantos números mayores que n hay en el array
		int nums [] = {
				7,
				2,
				9,
				11,
				20,
				4,
				16
		};
		int n = 10;
		int mayores = 0;
		
		for (int i : nums) {
			if (i > n) {
				mayores++;
			}
		}System.out.println(mayores);
	}

}
