package polimorfismo;

public class JRectangulo implements JFigura {
	
	private double base;
	private double altura;
	
	public JRectangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public JRectangulo() {
		this(2.0, 1.0);
	}
	
	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.getBase() * this.getAltura();
	}

	@Override
	public String toString() {
		return "Rectangulo [base= " + this.getBase() + ", altura= " + this.getAltura() + "]";
	}
	
}