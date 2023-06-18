package principal;

import misClases.Cuenta;

public class PrototipoCajero {

	public static void main(String[] args) {
		// Crear un objeto cuenta con un saldo cualquiera
		// y hacemos alguna operación
		
		Cuenta cuenta = new Cuenta();
		cuenta.fijarSaldo(100);
		cuenta.ingresarSaldo(40);
		cuenta.retirarSaldo(10);
		cuenta.ingresarSaldo(30);
		System.out.println("El saldo actual es: " + cuenta.consultarSaldo());
	}

}
