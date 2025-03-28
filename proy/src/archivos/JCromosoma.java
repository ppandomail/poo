package archivos;

public class JCromosoma {

	private String genes;

	public JCromosoma(String genes) {
		this.setGenes(genes);
	}

	public String getGenes() {
		return this.genes;
	}

	public void setGenes(String genes) {
		this.genes = genes;
	}

	public Integer getAdaptabilidad() {
		return Integer.parseInt(this.getGenes(), 2);
	}

	public String toString() {
		return this.getGenes() + " (" + this.getAdaptabilidad() + ")";
	}

}