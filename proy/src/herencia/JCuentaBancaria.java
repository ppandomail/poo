package herencia;

public abstract class JCuentaBancaria {
	
	private double saldo;
	private JTitular titular;
	
	public JCuentaBancaria(double saldo, JTitular titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public JCuentaBancaria(JTitular titular) {
		this(0.0, titular);
	}
	
	public JCuentaBancaria() {
		this(0.0, new JTitular("NN", "999999999"));
	}
	
	public JCuentaBancaria(String nombreTitular, String CUITTitular) {
		this(0.0, new JTitular(nombreTitular, CUITTitular));
	}
	
	public void extraer(double importe) {
		saldo -= importe;
	}
	
	public void depositar(double importe) {
		saldo += importe;
	}

	public double getSaldo() {
		return saldo;
	}

	public JTitular getTitular() {
		return titular;
	}
	
	public String toString() {
		return saldo + " -> " + titular;
	}
		
}