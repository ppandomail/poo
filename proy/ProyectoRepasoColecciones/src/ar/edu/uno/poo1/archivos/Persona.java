package ar.edu.uno.poo1.archivos;

public class Persona {
	
	private long dni;
	private String ape;
	private int edad;
	
	public Persona(long dni, String ape, int edad) {
		this.dni = dni;
		this.ape = ape;
		this.edad = edad;
	}

	public long getDni() {
		return dni;
	}

	public String getApe() {
		return ape;
	}

	public int getEdad() {
		return edad;
	}
	
	public String toString() {
		return this.ape + " (" + this.edad + ")";
	}
	
}