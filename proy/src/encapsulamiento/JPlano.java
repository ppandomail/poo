package encapsulamiento;

public class JPlano {

	private JPunto[] puntos;
	private int tamaño;

	public JPlano(int capacidad) {
		this.setPuntos(new JPunto[capacidad]);
		this.setTamaño(0);
	}

	public JPlano() {
		this(10);
	}

	public JPunto[] getPuntos() {
		return puntos;
	}

	public void setPuntos(JPunto[] puntos) {
		this.puntos = puntos;
	}

	public int getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public boolean agregarPunto(JPunto punto) {
		if (punto == null) return false;
		if (this.getPuntos().length == this.getTamaño())
			return false;
		this.getPuntos()[this.getTamaño()] = punto;
		this.setTamaño(this.getTamaño()+1);
		return true;
	}

	public int getCantidadPuntos(JCuadrante cuadrante) {
		int contador = 0;
		for (int i=0; i<this.getTamaño(); i++) 
			if (this.getPuntos()[i].getCuadrante().equals(cuadrante))
				contador++;
		return contador;
	}

	public String toString() {
		String representacion = "[";
		for (int i=0; i<this.getTamaño(); i++)
			representacion += this.getPuntos()[i] + " , ";
		if (representacion.length() > 1)
			representacion = representacion.substring(0, representacion.length()-3);
		return  representacion + "]";
	}

}