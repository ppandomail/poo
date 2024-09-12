package archivos;

import java.util.ArrayList;

public class JPoblacion {

	private ArrayList<JCromosoma> poblacion;

	public JPoblacion() {
		this.setPoblacion(new ArrayList<JCromosoma>());
	}

	public ArrayList<JCromosoma> getPoblacion() {
		return this.poblacion;
	}

	public void setPoblacion(ArrayList<JCromosoma> poblacion) {
		this.poblacion = poblacion;
	}

	public void agregarCromosoma(JCromosoma cromosoma) {
		this.getPoblacion().add(cromosoma);
	}

	public JCromosoma mutar() {
		int k = (int) ((Math.random() * 10) % this.getPoblacion().size());
		System.out.println(k);
		JCromosoma c = this.getPoblacion().get(k);
		return c;
	}

}