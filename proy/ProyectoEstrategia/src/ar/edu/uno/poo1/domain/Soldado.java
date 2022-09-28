package ar.edu.uno.poo1.domain;

public class Soldado extends Unidad implements Aguable {
	
	private int energia;
	public static final int CONSUMO_ENERGIA = 10;
	public static final int DAÑO = 10;
	

	public Soldado(Ubicacion ubicacion) {
		super(200, ubicacion);
		energia = 100;
	}
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public boolean atacar(Unidad unidad) {
		if (this.isMuerta() || !this.isCuerpoACuerpo(unidad.getUbicacion()) || !this.hasSuficienteEnergia())
			return false;
		this.consumirEnergia();
		unidad.recibirDaño(DAÑO);
		return true;
	}
	
	public void consumirEnergia() {
		energia -= CONSUMO_ENERGIA;
	}
	
	public boolean hasSuficienteEnergia() {
		return energia >= CONSUMO_ENERGIA;
	}

	public void recibirRacionAgua() {
		energia = 100;	
	}
	
}