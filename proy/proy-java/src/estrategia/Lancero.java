package estrategia;

public class Lancero extends Unidad {
	
	public static final int DAÑO = 25;
	
	public Lancero(Ubicacion ubicacion) {
		super(150, ubicacion);
	}

	public boolean atacar(Unidad unidad) {
		if (this.isMuerta() || !this.isDistanciaOK(unidad.getUbicacion(), 1, 3))
			return false;
		unidad.recibirDaño(DAÑO);
		return true;
	}

}