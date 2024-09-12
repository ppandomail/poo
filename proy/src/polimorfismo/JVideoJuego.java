package polimorfismo;

public class JVideoJuego extends JEntrega {

	private int horasEstimadas;
	private String compañia;
	private int horasEstimadas_bkp;
	private String compañia_bkp;
	
	public JVideoJuego(String titulo, int horasEstimdas, JGenero genero, String compañia) {
		super(titulo, genero);
		this.setHorasEstimadas(horasEstimdas);
		this.setCompañia(compañia);
		this.setHorasEstimadas_bkp(horasEstimdas);
		this.setCompañia_bkp(compañia);
	}
	
	public JVideoJuego(String titulo, int horasEstimadas) {
		this(titulo, horasEstimadas, JGenero.NO_DEFINIDO, "");
	}
	
	public JVideoJuego() {
		this("", 10);
	}

	public int getHorasEstimadas() {
		return this.horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getCompañia() {
		return this.compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public int getHorasEstimadas_bkp() {
		return this.horasEstimadas_bkp;
	}

	private void setHorasEstimadas_bkp(int horasEstimadas_bkp) {
		this.horasEstimadas_bkp = horasEstimadas_bkp;
	}

	public String getCompañia_bkp() {
		return this.compañia_bkp;
	}

	private void setCompañia_bkp(String compañia_bkp) {
		this.compañia_bkp = compañia_bkp;
	}

	@Override
	public String toString() {
		return super.toString() + ", Horas estimadas=" + this.getHorasEstimadas() + ", Compañia=" + this.getCompañia();
	}
	
	@Override
	public int compareTo(Object objeto) {
		if (objeto == null) return 1;
		if (!(objeto instanceof JVideoJuego)) return 1;
		JVideoJuego videoJuego = (JVideoJuego) objeto;
		if (this.getHorasEstimadas() == videoJuego.getHorasEstimadas()) return 0;
		return this.getHorasEstimadas() > videoJuego.getHorasEstimadas()? 1 : -1;
	}
	
	public void reset() {
		super.reset();
		this.setHorasEstimadas(this.getHorasEstimadas_bkp());
		this.setCompañia(this.getCompañia_bkp());
	}
	
}