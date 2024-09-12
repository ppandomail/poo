package colecciones;


import java.util.concurrent.ConcurrentLinkedQueue;

public class JClientes {

	private ConcurrentLinkedQueue<JCliente> clientes;

	public JClientes() {
		this.setClientes(new ConcurrentLinkedQueue<JCliente>());
	}

	public ConcurrentLinkedQueue<JCliente> getClientes() {
		return this.clientes;
	}

	private void setClientes(ConcurrentLinkedQueue<JCliente> clientes) {
		this.clientes = clientes;
	}

	public void ponerCliente(JCliente cliente) {
		this.getClientes().offer(cliente);
	}

	public JCliente sacarCliente() {
		return this.getClientes().poll();
	}

	public JCliente verCliente() {
		return this.getClientes().peek();
	}

	public boolean estaVacia() {
		return this.getClientes().isEmpty();
	}

	public String toString() {
		if (this.estaVacia()) return "";
		String representacion = "";
		JCliente cliente = this.sacarCliente();
		representacion += cliente;
		int marca = cliente.getNumeroUbicacion();
		this.ponerCliente(cliente);
		while (this.verCliente().getNumeroUbicacion() != marca) {
			cliente = this.sacarCliente();
			representacion += cliente;
			this.ponerCliente(cliente);
		}
		return representacion.substring(0, representacion.length()-2);
	}

}