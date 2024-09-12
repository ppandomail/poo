package colecciones;

public class JItemCarrito {

	private Integer cantidadLibrosAComprar;
	private JLibro libro;

	public JItemCarrito(Integer cantidadLibrosAComprar, JLibro libro) {
		this.setCantidadLibrosAComprar(cantidadLibrosAComprar);
		this.setLibro(libro);
	}

	public JItemCarrito(JLibro libro) {
		this(1, libro);
	}

	public Integer getCantidadLibrosAComprar() {
		return this.cantidadLibrosAComprar;
	}

	public void setCantidadLibrosAComprar(Integer cantidadLibrosAComprar) {
		this.cantidadLibrosAComprar = cantidadLibrosAComprar;
	}

	public JLibro getLibro() {
		return this.libro;
	}

	public void setLibro(JLibro libro) {
		this.libro = libro;
	}

	public Double getPrecio() {
		return this.getCantidadLibrosAComprar() * this.getLibro().getPrecio();
	}

}