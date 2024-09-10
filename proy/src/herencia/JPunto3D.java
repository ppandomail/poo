package herencia;

public class JPunto3D extends JPunto {
	
	private double z;
	
	public JPunto3D(double x, double y, double z) {
		super(x, y);
		this.setZ(z);
	}
	
	public JPunto3D(double xyz) {
		this(xyz, xyz, xyz);
	}
	
	public JPunto3D() {
		this(0.0);
	}
	
	public double getZ() {
		return this.z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public double calcularDistancia(JPunto punto) {
		if (!(punto instanceof JPunto3D))
			return 0.0;
		JPunto3D punto3D = (JPunto3D) punto;
		double sumaCuadradoCatetos = Math.pow(this.getX() - punto3D.getX(), 2) + 
				                     Math.pow(this.getY() - punto3D.getY(), 2) + 
				                     Math.pow(this.getZ() - punto3D.getZ(), 2);
		return Math.sqrt(sumaCuadradoCatetos);
	}

	@Override
	public double calcularDistancia(double x, double y) {
		return this.calcularDistancia(new JPunto3D(x, y, 0.0));
	}
	
	@Override
	public String toString() {
		return super.toString().replace(')', ',').concat(String.valueOf(this.getZ())).concat(")");
	}
	
}