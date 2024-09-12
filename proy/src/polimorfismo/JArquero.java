package polimorfismo;

public class JArquero extends JUnidad {
	
	private int cantidadFlechas;
	public static final int DAÑO = 5;
	public static final int CANT_FLECHAS_POR_PAQUETE = 6;
	
	public JArquero(JUbicacion ubicacion) {
		super(50, ubicacion);
		cantidadFlechas = 20;
	}

	
	public boolean atacar(JUnidad unidad) {
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