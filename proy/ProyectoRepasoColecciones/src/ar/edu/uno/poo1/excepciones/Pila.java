package ar.edu.uno.poo1.excepciones;

public class Pila {
	
	class Nodo {
		
		private int info;
		private Nodo sig;
		
		public Nodo(int info, Nodo sig) {
			this.info = info;
			this.sig = sig;
		}
		
		public Nodo(int info) {
			this(info, null);
		}

		public int getInfo() {
			return info;
		}

		public void setInfo(int info) {
			this.info = info;
		}

		public Nodo getSig() {
			return sig;
		}

		public void setSig(Nodo sig) {
			this.sig = sig;
		}
			
	}
	
	private Nodo tope;
	
	public Pila( ) {
		tope = null;
	}
	
	public boolean isVacia() {
		return tope == null;
	}
	
	public void agregar(int numero) throws IllegalArgumentException {
		if (numero < 0)
			throw new IllegalArgumentException("No se puede apilar numeros negativos");
		tope = new Nodo(numero, tope);
	}
	
	public int sacar() throws PilaVaciaException {
		if (this.isVacia())
			throw new PilaVaciaException();
		//TODO
		return 0;
	}
	
	

}
