package colecciones;

public class JCancion {
	
	private String titulo;
	private int duracion;
	
	public JCancion(String string) {
		this(string, 5);
	}

	public JCancion(String string, int i) {
		titulo = string;
		duracion = i;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getTitulo() {
		return titulo;
	}
	
}