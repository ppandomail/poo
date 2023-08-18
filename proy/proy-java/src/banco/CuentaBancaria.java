package banco;

public abstract class CuentaBancaria {
	
	private double saldo;
	private Titular titular;
	
	public CuentaBancaria(double saldo, Titular titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public CuentaBancaria(Titular titular) {
		this(0.0, titular);
	}
	
	public CuentaBancaria() {
		this(0.0, new Titular("NN", "999999999"));
	}
	
	public CuentaBancaria(String nombreTitular, String CUITTitular) {
		this(0.0, new Titular(nombreTitular, CUITTitular));
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

	public Titular getTitular() {
		return titular;
	}
	
	public String toString() {
		return saldo + " -> " + titular;
	}
		
}