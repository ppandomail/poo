package ar.edu.uno.poo1.utilidades;

public class DemoCuenta {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Pepe Botella", 1111111);
		CuentaBancaria cb = new CuentaBancaria(1234, cli, 9999);
	}

}