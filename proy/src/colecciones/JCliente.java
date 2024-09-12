package colecciones;


public class JCliente {
	
	private int numeroUbicacion;
	private int cantidadProductos;
	
	public JCliente(int numeroUbicacion, int cantidadProductos) {
		this.setNumeroUbicacion(numeroUbicacion);
		this.setCantidadProductos(cantidadProductos);
	}

	public int getNumeroUbicacion() {
		return this.numeroUbicacion;
	}

	public void setNumeroUbicacion(int numeroUbicacion) {
		this.numeroUbicacion = numeroUbicacion;
	}

	public int getCantidadProductos() {
		return this.cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	
	public String toString() {
		return this.getNumeroUbicacion() + "->" + this.getCantidadProductos() + ", ";
	}

}