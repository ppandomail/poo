package ar.edu.uno.poo1.proyecto_banco.modelo;

public class CajaAhorro extends CuentaBancaria {
	
	public CajaAhorro(double saldo, Titular titular) {
		super(saldo, titular);
	}
	
	public void extraer(double importe) {
		if (importe <= this.getSaldo())
			super.extraer(importe);
	}
	
	

}
