package herencia;

public abstract class JVehiculo {
	
	private JPersona chofer;
	private double cantidadKm;
	
	public JVehiculo(JPersona chofer, double cantidadKm) {
		this.setChofer(chofer);
		this.setCantidadKm(cantidadKm);
	}

	public JPersona getChofer() {
		return this.chofer;
	}

	public void setChofer(JPersona chofer) {
		this.chofer = chofer;
	}

	public double getCantidadKm() {
		return this.cantidadKm;
	}

	public void setCantidadKm(double cantidadKm) {
		this.cantidadKm = cantidadKm;
	}
	
	public String toString() {
		String representacion = "Chofer: ";
		representacion += (this.getChofer() != null)? this.getChofer().toString() : "Sin chofer";
		return representacion + "\n" + "Cantidad Km: " + this.getCantidadKm();
	}
	
}