package colecciones;

public class JLibro {
	
	private String ISBN;
	private String titulo;
	private JGeneroLibro genero;
	private Double precio;
	
	public JLibro(String ISBN, String titulo, JGeneroLibro genero, Double precio) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setPrecio(precio);
	}
	
	public JLibro(String ISBN, String titulo, JGeneroLibro genero) {
		this(ISBN, titulo, genero, 0.0);
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public JGeneroLibro getGenero() {
		return this.genero;
	}
	
	public void setGenero(JGeneroLibro genero) {
		this.genero = genero;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}