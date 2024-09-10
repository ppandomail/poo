package herencia;

public class JMotocicleta extends JVehiculo {
	
	private JPersona acompañante;
	
	public JMotocicleta(JPersona chofer, double cantKm, JPersona acompañante) {
		super(chofer, cantKm);
		this.setAcompañante(acompañante);
	}
	
	public JMotocicleta(JPersona chofer, double cantKm) {
		this(chofer, cantKm, null);
	}

	public JPersona getAcompañante() {
		return this.acompañante;
	}

	public void setAcompañante(JPersona acompañante) {
		this.acompañante = acompañante;
	}
	
	public void setChofer(JPersona chofer) {
		if (this.getAcompañante() == null)
			super.setChofer(chofer);
	}
	
	public String toString() {
		String representacion = "-----------------------------" + "\n";
		representacion += super.toString() + "\n" + "Acompañante: ";
		representacion += (this.getAcompañante() == null)? "Sin acompañante" : this.getAcompañante().toString();
		representacion += "\n" + "-----------------------------" + "\n";
		return representacion;
	}
	
}