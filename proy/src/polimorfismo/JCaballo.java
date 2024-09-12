package polimorfismo;

public class JCaballo implements JAguable {

	private int cantidadAtaques;
	
	public JCaballo() {
		cantidadAtaques = 0;
	}
	
	public int getCantidadAtaques() {
		return cantidadAtaques;
	}

	public void setCantidadAtaques(int cantidadAtaques) {
		this.cantidadAtaques = cantidadAtaques;
	}
	
	public void incrementarAtaque() {
		cantidadAtaques++;
	}
	
	public boolean isRebelde() {
		return cantidadAtaques >= 3;
	}

	public void recibirRacionAgua() {
		cantidadAtaques = 0;		
	}

}