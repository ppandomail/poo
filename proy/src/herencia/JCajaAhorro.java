package herencia;

public class JCajaAhorro extends JCuentaBancaria {
	
	public JCajaAhorro(double saldo, JTitular titular) {
		super(saldo, titular);
	}
	
	public void extraer(double importe) {
		if (importe <= this.getSaldo())
			super.extraer(importe);
	}
	
	

}
