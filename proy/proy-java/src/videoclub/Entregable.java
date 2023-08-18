package videoclub;

public interface Entregable {
	
	void entregar();
	void devolver();
	boolean isEntregado();
	int compareTo(Object objeto);

}