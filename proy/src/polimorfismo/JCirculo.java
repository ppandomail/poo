package polimorfismo;

public class JCirculo implements JFigura {
	
	private double radio;
	
	public JCirculo(double radio) {
		this.setRadio(radio);
	}
	
	public JCirculo() {
		this(1.0);
	}
	
	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * this.getRadio() * this.getRadio();
	}

	@Override
	public String toString() {
		return "Circulo [radio= " + this.getRadio() + "]";
	}
	
}