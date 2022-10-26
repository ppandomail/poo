package ar.edu.uno.poo1.excepciones;

public class Pablo {
	
	private int numero;
	
	public Pablo(int numero) throws PabloException {
		if (numero == 0) throw new PabloException("No puede ser cero");
		this.numero = numero;
	}

}
