package ar.edu.uno.poo1.proyecto_banco.modelo;

public class Titular {
	
	private String nombre;
	private String CUIT;
	
	public Titular(String nombre, String CUIT) {
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