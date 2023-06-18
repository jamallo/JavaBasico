package misClases;

public class Cuenta {

//	Hacer un programa que simule un prototipo cajero.
//	Crearemos una clase Cuenta, que permita ingresar, extraer y consultar saldo. 
//	Desde otra clase, crearemos un objeto Cuenta y haremos unas operaciones
	
	private double saldo;
	public void fijarSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void ingresarSaldo(double cantidad) {
		saldo+=cantidad;
	}
	public void retirarSaldo(double cantidad) {
		saldo-=cantidad;
	}
}
