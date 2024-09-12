package colecciones;

public class JDetalleOrden {
	
	private JNotebook item;
	private float precioUnitario;
	private int cantidad;
	
	public JDetalleOrden(JNotebook item, float precioUnitario, int cantidad) {
		this.item = item;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public JNotebook getItem() {
		return item;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}
	
}