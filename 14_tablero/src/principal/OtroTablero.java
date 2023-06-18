package principal;

public class OtroTablero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][] tablero = new boolean [8][8];
		boolean valor = true;
		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero.length; columna++) {
				tablero [fila] [columna] = valor;
				valor = !valor;
			}
			valor = !valor;
		}
		
		for(boolean[] a:tablero) {
			for(boolean b:a) {
				System.out.println(b + " ");
			}
			System.out.println();
		}
	}

}
