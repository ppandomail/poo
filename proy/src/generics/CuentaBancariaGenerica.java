package generics;

public class CuentaBancariaGenerica <T> {
	
	private T saldo;
	
	public CuentaBancariaGenerica(T saldo) {
		this.saldo = saldo;
	}
	
	public T getSaldo() {
		return saldo;
	}

}
