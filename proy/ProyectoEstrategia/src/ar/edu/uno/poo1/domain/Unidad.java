package ar.edu.uno.poo1.domain;

public abstract class Unidad {
	
	private int salud;
	private Ubicacion ubicacion;
	
	public Unidad(int salud, Ubicacion ubicacion) {
		this.salud = salud;
		this.ubicacion = ubicacion;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public abstract boolean atacar(Unidad unidad);
	
	public void recibirDaño(int daño) {
		salud -= daño;
	}
	
	public boolean isMuerta() {
		return salud <= 0;
	}
	
	public boolean isCuerpoACuerpo(Ubicacion ubicacionDestino) {
		return  this.isDistanciaOK(ubicacionDestino, 0, 0);
	}
	
	public boolean isDistanciaOK(Ubicacion ubicacionDestino, int min, int max) {
		double distancia = ubicacion.distancia(ubicacionDestino);
		return distancia >= min && distancia <= max;
	}
		
}