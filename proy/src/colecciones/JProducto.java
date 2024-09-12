package colecciones;


public class JProducto {
	
	private long codigo;
	private String descripcion;
	private double importe;
	private int stock;
	
	public JProducto(long codigo, String descripcion, double importe, int stock) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setImporte(importe);
		this.setStock(stock);
	}
	
	public JProducto(long codigo) {
		this(codigo, "", 0, 0);
	}

	public long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void incrementarImporte(double porcentaje) {
		this.setImporte(this.getImporte() + this.getImporte() * porcentaje / 100);
	}
	
	public String toString() {
		return this.getCodigo() + "\t" + this.getDescripcion() + "\t" + this.getImporte() + " --> " + this.getStock();
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (this.getClass() != objeto.getClass())
			return false;
		JProducto producto = (JProducto) objeto;
		return this.getCodigo() == producto.getCodigo();
	}

}