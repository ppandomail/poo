package herencia;

public class JTitular {
	
	private String nombre;
	private String CUIT;
	
	public JTitular(String nombre, String CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCUIT() {
		return CUIT;
	}
		
	public String toString() {
		return nombre + " - " + CUIT;
	}	
	
}