package colecciones;

public class JSupermercado {
	
	private JClientes colaA;
	private JClientes colaB;
	
	public JSupermercado() {
		this.setColaA(new JClientes());
		this.setColaB(new JClientes());
	}

	public JClientes getColaA() {
		return this.colaA;
	}

	private void setColaA(JClientes colaA) {
		this.colaA = colaA;
	}

	public JClientes getColaB() {
		return this.colaB;
	}

	private void setColaB(JClientes colaB) {
		this.colaB = colaB;
	}
	
	public void agregarClientesColaA(int cantidadClientes) {
		for(int i = 0; i < cantidadClientes; i++)
			this.getColaA().ponerCliente(new JCliente(i+1, (int) (Math.random()*100 % 100)));
	}
	
	public void agregarClienteColaA(JCliente cliente) {
		this.getColaA().ponerCliente(cliente);
	}
	
	public void abrirColaB(int cantidadMaximaProductos) {
		JClientes colaAux = new JClientes();
		int ubicacionA = 1;
		int ubicacionB = 1;
		while (!this.getColaA().estaVacia()) {
			JCliente cliente = this.getColaA().sacarCliente();
			if (cliente.getCantidadProductos() >= cantidadMaximaProductos) { 
				cliente.setNumeroUbicacion(ubicacionA++);
				colaAux.ponerCliente(cliente);
			}
			else {
				cliente.setNumeroUbicacion(ubicacionB++);
				this.getColaB().ponerCliente(cliente);
			}
		}
		while (!colaAux.estaVacia())
			this.getColaA().ponerCliente(colaAux.sacarCliente());
	}
	
	public String toString() {
		return "ColaA: " + this.getColaA() + " \nColaB: " + this.getColaB();
	}

}