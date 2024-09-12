package encapsulamiento;

public class JComplejo implements Comparable<JComplejo> {

	private double real;
	private double imag;

	public JComplejo(double real ,double imag) {
		this.setReal(real);
		this.setImag(imag);
	}

	public JComplejo() {
		this(0,0);
	}

	public JComplejo suma(JComplejo z) {
		return new JComplejo(this.getReal() + z.getReal(), this.getImag() + z.getImag());
	}

	public static JComplejo suma(JComplejo z1, JComplejo z2) {
		return new JComplejo(z1.getReal() + z2.getReal(), z1.getImag() + z2.getImag());
	}
	
	public double modulo() {
		return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImag(), 2));
	}

	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null) 
			return false;
		if (this.getClass() != obj.getClass()) 
			return false;
		JComplejo other = (JComplejo) obj;
		if (Double.doubleToLongBits(this.getImag()) != Double
				.doubleToLongBits(other.getImag())) 
			return false;
		if (Double.doubleToLongBits(this.getReal()) != Double
				.doubleToLongBits(other.getReal())) 
			return false;
		return true;
	}


	public String toString() {
		return "Complejo [real=" + this.getReal() + ", imag=" + this.getImag() + "]";
	}

	public int compareTo(JComplejo c1) {
		if (this.modulo()< c1.modulo())
			return -1;
		if (this.modulo()> c1.modulo())
			return 1;
		return 0;
	}

	public final double getReal() {
		return this.real;
	}
	
	public final void setReal(double real) {
		this.real = real;
	}
	
	public final double getImag() {
		return this.imag;
	}
	
	public final void setImag(double imag) {
		this.imag = imag;
	}

}