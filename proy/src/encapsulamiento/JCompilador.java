package encapsulamiento;

public class JCompilador {

	private static final int CAPACIDAD_ERRORES = 4;
	private String programaFuente;
	private JErrorCompilacion[] errores;
	private int cantidadErrores;

	public JCompilador(String programaFuente) {
		this.setProgramaFuente(programaFuente);
		this.setErrores(new JErrorCompilacion[JCompilador.CAPACIDAD_ERRORES]);
		this.setCantidadErrores(0);
	}

	public JCompilador() {
		this("");
	}

	public String getProgramaFuente() {
		return this.programaFuente;
	}

	public void setProgramaFuente(String programaFuente) {
		this.programaFuente = programaFuente;
	}

	public JErrorCompilacion[] getErrores() {
		return this.errores;
	}

	public void setErrores(JErrorCompilacion[] errores) {
		this.errores = errores;
	}

	public int getCantidadErrores() {
		return this.cantidadErrores;
	}

	public void setCantidadErrores(int cantidadErrores) {
		this.cantidadErrores = cantidadErrores;
	}

	public String compilar() {
		this.setErrores(new JErrorCompilacion[JCompilador.CAPACIDAD_ERRORES]);
		this.setCantidadErrores(0);
		if ((this.getProgramaFuente() == null) || (this.getProgramaFuente().length() == 0)) {
			this.getErrores()[this.getCantidadErrores()] = JErrorCompilacion.VACIO;
			this.setCantidadErrores(this.getCantidadErrores()+1);
			return this.getErroresString();
		}
		if (this.getProgramaFuente().charAt(0) != 'C') {
			this.getErrores()[this.getCantidadErrores()] = JErrorCompilacion.SIN_INICIO;
			this.setCantidadErrores(this.getCantidadErrores()+1);
		}
		if (this.getProgramaFuente().charAt(this.getProgramaFuente().length()-1) != 'F') {
			this.getErrores()[this.getCantidadErrores()] = JErrorCompilacion.SIN_FIN;
			this.setCantidadErrores(this.getCantidadErrores()+1);
		}
		if (!this.getProgramaFuente().matches("[CNSEOF]*")) {
			this.getErrores()[this.getCantidadErrores()] = JErrorCompilacion.SIMBOLOS_DESCONOCIDOS;
			this.setCantidadErrores(this.getCantidadErrores()+1);
		}
		return (this.getCantidadErrores() == 0) ? "Compilación con éxito" : this.getErroresString();
	}

	private String getErroresString() {
		String representacion = "";
		for (int i=0; i < this.getCantidadErrores(); i++)
			representacion += this.getErrores()[i].toString();
		return representacion;
	}

	public String ejecutar() {
		int x = 0;
		int y = 0;
		for (int i=1; i<this.getProgramaFuente().length()-1; i++)
			switch(this.getProgramaFuente().charAt(i)) {
			case 'N': y++; break;
			case 'S': y--; break;
			case 'E': x++; break;
			case 'O': x--; break;
			}
		return "x: " + x + ", y: " + y;
	}

}