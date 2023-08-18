package estrategia;

public class Arquero extends Unidad {
	
	private int cantidadFlechas;
	public static final int DAÑO = 5;
	public static final int CANT_FLECHAS_POR_PAQUETE = 6;
	
	public Arquero(Ubicacion ubicacion) {
		super(50, ubicacion);
		cantidadFlechas = 20;
	}

	
	public boolean atacar(Unidad unidad) {
		if (this.isMuerta() || !this.isDistanciaOK(unidad.getUbicacion(), 2, 5) || !this.hasSuficienteFlechas())
			return false;
		this.consumirFlecha();
		unidad.recibirDaño(DAÑO);
		return true;
	}
	
	public void recargar() {
		cantidadFlechas += CANT_FLECHAS_POR_PAQUETE;
	}
	
	public void consumirFlecha() {
		cantidadFlechas--;
	}
	
	public boolean hasSuficienteFlechas() {
		return cantidadFlechas >= 1;
	}

}