package polimorfismo;

public abstract class JEntrega implements JEntregable, JReseteable {
	
	private String titulo;
	protected boolean entregado;
	private JGenero genero;
	private String titulo_bkp;
	private JGenero genero_bkp;
	
	public JEntrega(String titulo, JGenero genero) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.entregado = false;
		this.setTitulo_bkp(titulo);
		this.setGenero_bkp(genero);
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public JGenero getGenero() {
		return this.genero;
	}

	public void setGenero(JGenero genero) {
		this.genero = genero;
	}
	
	public String getTitulo_bkp() {
		return this.titulo_bkp;
	}

	public void setTitulo_bkp(String titulo_bkp) {
		this.titulo_bkp = titulo_bkp;
	}

	public JGenero getGenero_bkp() {
		return this.genero_bkp;
	}

	public void setGenero_bkp(JGenero genero_bkp) {
		this.genero_bkp = genero_bkp;
	}

	@Override
	public String toString() {
		return "Titulo=" + this.getTitulo() + ", "
				+ "Entregado=" + ((this.entregado)? "SI" : "NO") + ", "
						+ "Genero=" + this.getGenero();
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	public void reset() {
		this.setTitulo(this.getTitulo_bkp());
		this.setGenero(this.getGenero_bkp());
		this.devolver();
	}

}