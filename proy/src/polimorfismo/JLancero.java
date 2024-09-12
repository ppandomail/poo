package polimorfismo;

public class JLancero extends JUnidad {
	
	public static final int DAÑO = 25;
	
	public JLancero(JUbicacion ubicacion) {
		super(150, ubicacion);
	}

	public boolean atacar(JUnidad unidad) {
		if (this.isMuerta() || !this.isDistanciaOK(unidad.getUbicacion(), 1, 3))
			return false;
		unidad.recibirDaño(DAÑO);
		return true;
	}

}