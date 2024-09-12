package encapsulamiento;

public enum JCuadrante {

	I("Cuadrante I"),
	II("Cuadrante II"),
	III("Cuadrante III"),
	IV("Cuadrante IV"), 
	SC("Sin Cuadrante");

	private String representacion;

	private JCuadrante(String representacion) {
		this.setRepresentacion(representacion);
	}

	public String getRepresentacion() {
		return this.representacion;
	}

	public void setRepresentacion(String representacion) {
		this.representacion = representacion;
	}

	public String toString() {
		return this.getRepresentacion();
	}

}	