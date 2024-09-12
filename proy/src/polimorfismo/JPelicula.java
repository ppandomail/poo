package polimorfismo;

import java.util.Calendar;

public class JPelicula extends JEntrega {
	
	private int año;
	private String director;
	private int año_bkp;
	private String director_bkp;
	
	public JPelicula(String titulo, int año, JGenero genero, String director) {
		super(titulo, genero);
		this.setAño(año);
		this.setDirector(director);
		this.setAño_bkp(año);
		this.setDirector_bkp(director);
	}
	
	public JPelicula(String titulo, String director) {
		this(titulo, Calendar.getInstance().get(Calendar.YEAR), JGenero.NO_DEFINIDO, director);
	}
	
	public JPelicula() {
		this("", "");
	}
	
	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getAño_bkp() {
		return this.año_bkp;
	}

	private void setAño_bkp(int año_bkp) {
		this.año_bkp = año_bkp;
	}

	public String getDirector_bkp() {
		return this.director_bkp;
	}

	private void setDirector_bkp(String director_bkp) {
		this.director_bkp = director_bkp;
	}

	@Override
	public String toString() {
		return super.toString() + ", Año=" + this.getAño() + ", Director=" + this.getDirector();
	}

	@Override
	public int compareTo(Object objeto) {
		if (objeto == null) return 1;
		if (!(objeto instanceof JPelicula)) return 1;
		JPelicula pelicula = (JPelicula) objeto;
		if (this.getAño() == pelicula.getAño()) return 0;
		return this.getAño() > pelicula.getAño()? 1 : -1;
	}
	
	public void reset() {
		super.reset();
		this.setAño(this.getAño_bkp());
		this.setDirector(this.getDirector_bkp());
	}
	
}