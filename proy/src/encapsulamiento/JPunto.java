package encapsulamiento;

public class JPunto {

	private double x;
	private double y;

	public JPunto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public JPunto(double xy) {
		this(xy, xy);
	}

	public JPunto() {
		this(0.0);
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double calcularDistancia(JPunto punto) {
		return Math.hypot(this.getX() - punto.getX(), this.getY() - punto.getY());
	}

	public double calcularDistancia(double x, double y) {
		return this.calcularDistancia(new JPunto(x, y));
	}

	public static double calcularDistancia(JPunto punto1, JPunto punto2) {
		return Math.hypot(punto1.getX() - punto2.getX(), punto1.getY() - punto2.getY());
	}

	public JCuadrante getCuadrante() {
		if (this.getX() > 0 && this.getY() > 0) return JCuadrante.I;
		if (this.getX() < 0 && this.getY() > 0) return JCuadrante.II;
		if (this.getX() < 0 && this.getY() < 0) return JCuadrante.III;
		if (this.getX() > 0 && this.getY() < 0) return JCuadrante.IV;
		return JCuadrante.SC;
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}

}