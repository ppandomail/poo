package colecciones;


import java.util.ArrayList;

public class JMiArrayList<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;
	
	public JMiArrayList() {
		super();
	}
	
	public JMiArrayList(int cap) {
		super(cap);
	}
	
	public String toString() {
		String representacion = "[";
		for (Object p : this.toArray())
			representacion += p.toString() + "\n";
		return representacion + "]";
	}
	
}