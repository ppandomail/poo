package genericidad;

public class JCuentaBancariaGenerica <T> {
	
	private T saldo;
	
	public JCuentaBancariaGenerica(T saldo) {
		this.saldo = saldo;
	}
	
	public T getSaldo() {
		return saldo;
	}

}
