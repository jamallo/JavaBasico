package principal;

public class Tablero {

	public static void main(String[] args) {
		// hacer un programa que cree un tablero para ajedez/damas
		
		Tablero tablero = new Tablero();
        tablero.mostrarTablero();
	}
		
        public char[][] tablero;
    
        public Tablero() {
            tablero = new char[8][8];
            inicializarTablero();
        }

        public void inicializarTablero() {
            for (int i = 0; i < tablero.length; i++) {
                for (int a = 0; a < tablero.length; a++) {
                    if ((i + a) % 2 == 0) {
                         tablero[i][a] = '1'; // Espacios vacíos
                    } else {
                        tablero[i][a] = '0';// Espacios vacíos
                    }
                }
            }
        }

        public void mostrarTablero() {
            for (int i = 0; i < tablero.length; i++) {
                for (int a = 0; a < tablero.length; a++) {
                    System.out.print(tablero[i][a] + " ");
                }
                System.out.println();
            }
        }
	}


