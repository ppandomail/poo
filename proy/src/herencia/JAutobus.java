package herencia;

public class JAutobus extends JVehiculo {
	
	public static final int CANT_MAX_PASAJEROS = 24; 
	private JPersona [] pasajeros;
	private int size;
	
	public JAutobus(JPersona chofer, double cantKm) {
		super(chofer, cantKm);
		this.setPasajeros(new JPersona[24]);
		this.setSize(0);
	}

	public JPersona[] getPasajeros() {
		return this.pasajeros;
	}

	public void setPasajeros(JPersona[] pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean agregarPasajero(JPersona pasajero) {
		if (pasajero == null) return false;
		if (this.getSize() == JAutobus.CANT_MAX_PASAJEROS) return false;
		this.getPasajeros()[this.getSize()] = pasajero;
		this.setSize(this.getSize() + 1);
		return true;
	}
	
	public void setChofer(JPersona chofer) {
		if (this.getSize() == 0) 
			super.setChofer(chofer);
	}
	
	public String toString() {
		String representacion = "-----------------------------" + "\n";
		representacion += super.toString() + "\n" + "Cant Pasajeros: ";
		representacion += this.getSize();
		representacion += "\n" + "-----------------------------" + "\n";
		return representacion;
	}
	
}