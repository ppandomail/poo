package polimorfismo;

public class JCuadrado implements JFigura {

	private double lado;
	
	public JCuadrado(double lado) {
		this.setLado(lado);
	}
	
	public JCuadrado() {
		this(1.0);
	}

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return this.getLado() * this.getLado();
	}

	@Override
	public String toString() {
		return "Cuadrado [lado= " + this.getLado() + "]";
	}
	
}