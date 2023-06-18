package principal;

public class dadosOtro {
	
	public static void main(String[] args) {
		
		final int veces = 10000;
        int[] caras = new int[6];

        for (int i = 0; i < veces; i++) {
            int dados = (int)(Math.random()*6 + 1);
            caras[dados - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            double porcentaje = (double) caras[i] / veces * 100;
            System.out.println("Número " + (i + 1) + ": " + porcentaje + "%");
        }
	}

}
