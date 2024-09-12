package colecciones;


import java.util.LinkedList;

public class JProductos {

	private LinkedList<JProducto> productos;

	public JProductos() {
		this.setProductos(new LinkedList<JProducto>());
	}

	public LinkedList<JProducto> getProductos() {
		return this.productos;
	}

	public void setProductos(LinkedList<JProducto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(JProducto producto) {
		this.getProductos().add(producto);
	}

	public JProducto getKesimo(int kesimo) {
		return this.getProductos().get(kesimo);
	}

	public void incrementarImporte(JProducto producto, double porcentaje) {
		int index = this.getProductos().indexOf(producto);
		if (index != -1)
			this.getProductos().get(index).incrementarImporte(porcentaje);
	}

	public int getStock(JProducto producto) {
		int index = this.getProductos().indexOf(producto);
		return (index != -1)? this.getProductos().get(index).getStock() : 0;
	}

	public JProductos getProductosStockInferiorA(int stock) {
		return this.getProductosStock('<', stock);
	}
	
	public JProductos getProductosStockSuperiorIgualA(int stock) {
		return this.getProductosStock('>', stock);
	}

	public JProductos getProductosStock(char operador, int stock) {
		JProductos listaADevolver = new JProductos();
		for(JProducto producto : this.getProductos()) 
			switch(operador) {
			case '<': if (producto.getStock() < stock) listaADevolver.agregarProducto(producto);
			break;
			case '>': if (producto.getStock() >= stock) listaADevolver.agregarProducto(producto);
			break;
			}
		return listaADevolver;
	}

	public String toString() {
		String representacion = "";
		for (JProducto producto : this.getProductos())
			representacion += producto + "\n";
		return representacion;
	}

}
