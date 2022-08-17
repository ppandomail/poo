package ar.edu.uno.poo1.proyecto_punto.domain;

public class Punto {
	
	private double x;
	private double y;
	private Cuadrante cuadrante;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
		this.cuadrante = deducirCuadrante(x, y);
	}
	
	public Punto() {
		this(0.0, 0.0);
	}
	
	public Punto(Punto punto) {
		this(punto.getX(), punto.getY());
	}
	
	private Cuadrante deducirCuadrante(double x, double y) {
		if ((x > 0) && (y > 0))
			return Cuadrante.PRIMER;
		if ((x < 0) && (y > 0))
			return Cuadrante.SEGUNDO;
		if ((x < 0) && (y < 0))
			return Cuadrante.TERCER;
		if ((x > 0) && (y < 0))
			return Cuadrante.CUARTO;
		return Cuadrante.SIN_CUADRANTE;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Cuadrante getCuadrante() {
		return cuadrante;
	}

	public double calcularDistancia(Punto punto) {
		double cateto1 = this.getX() - punto.getX();
		double cateto2 = this.getY() - punto.getY();
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	
	public boolean isIgual(Punto punto) {
		if (punto == null) return false;
		return this.calcularDistancia(punto) == 0;
	}
	
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null) return false;
		if (!(object instanceof Punto)) return false;
		Punto otroPunto = (Punto) object;
		return (this.x == otroPunto.getX()) && (this.getY() == otroPunto.getY());
	}
	
}