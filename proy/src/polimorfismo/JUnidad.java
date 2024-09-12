package polimorfismo;

public abstract class JUnidad {
	
	private int salud;
	private JUbicacion ubicacion;
	
	public JUnidad(int salud, JUbicacion ubicacion) {
		this.salud = salud;
		this.ubicacion = ubicacion;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public JUbicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(JUbicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public abstract boolean atacar(JUnidad unidad);
	
	public void recibirDaño(int daño) {
		salud -= daño;
	}
	
	public boolean isMuerta() {
		return salud <= 0;
	}
	
	public boolean isCuerpoACuerpo(JUbicacion ubicacionDestino) {
		return  this.isDistanciaOK(ubicacionDestino, 0, 0);
	}
	
	public boolean isDistanciaOK(JUbicacion ubicacionDestino, int min, int max) {
		double distancia = ubicacion.distancia(ubicacionDestino);
		return distancia >= min && distancia <= max;
	}
		
}