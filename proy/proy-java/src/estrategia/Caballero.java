package estrategia;

public class Caballero extends Unidad {
	
	private Caballo caballo;
	public static final int DAÑO = 50;
	
	public Caballero(Ubicacion ubicacion) {
		super(200, ubicacion);
		caballo = new Caballo();
	}

	public boolean atacar(Unidad unidad) {
		if (this.isMuerta() || !this.isDistanciaOK(unidad.getUbicacion(), 1, 2) || caballo.isRebelde())
			return false;
		caballo.incrementarAtaque();
		unidad.recibirDaño(DAÑO);
		return true;
	}

}
