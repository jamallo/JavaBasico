package principal;

public class Suma {

	public static void main(String[] args) {
		int [] nums = {
				8,
				2,
				11,
				5,
				7
		};
		int suma = 0;
		int suma2 = 0;
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		
		for ( int a:nums) {
			suma2+=a;
		}
		System.out.println(suma);
		System.out.println(suma2);
	}

}
