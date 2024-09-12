package polimorfismo;

public class JCaballero extends JUnidad {
	
	private JCaballo caballo;
	public static final int DAÑO = 50;
	
	public JCaballero(JUbicacion ubicacion) {
		super(200, ubicacion);
		caballo = new JCaballo();
	}

	public boolean atacar(JUnidad unidad) {
		if (this.isMuerta() || !this.isDistanciaOK(unidad.getUbicacion(), 1, 2) || caballo.isRebelde())
			return false;
		caballo.incrementarAtaque();
		unidad.recibirDaño(DAÑO);
		return true;
	}

}
