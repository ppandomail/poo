package polimorfismo;

public class JEntregas {
	
	private JEntrega [] arreglo;
	
	public JEntregas(JEntrega [] arreglo) {
		this.setArreglo(arreglo);
	}
	
	public JEntrega[] getArreglo() {
		return this.arreglo;
	}

	public void setArreglo(JEntrega[] arreglo) {
		this.arreglo = arreglo;
	}
	
	public int getCantidadEntregados() {
		if (this.getArreglo() == null) return 0;
		int contador = 0;
		for (JEntregable entrega : this.getArreglo()) 
			if (entrega.isEntregado())
				contador++;
		return contador;
	}
	
	public JEntrega getMax() {
		if (this.getArreglo() == null) return null;
		if (this.getArreglo().length == 0) return null;
		JEntrega entregaMax = this.getArreglo()[0];
		for (JEntrega entrega : this.getArreglo())
			if (entrega.compareTo(entregaMax) > 0)
				entregaMax = entrega;
		return entregaMax;
	}
	
}