package ar.edu.uno.poo1.utilidades;

class CuentaBancaria {
	
	long numero;
	Cliente titular;
	long saldo;
	Color color;
	
	CuentaBancaria(long num, Cliente clt, long s) {
		numero = num;
		titular = clt;
		saldo = s;
		color = new Color("verde");
	}

}