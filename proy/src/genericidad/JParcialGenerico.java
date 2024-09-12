package genericidad;

import java.util.LinkedList;
import java.util.List;

public class JParcialGenerico {
	
	public <T> List<T> diferencia(List<T> l1, List<T> l2) {
		List<T> listaDiferencia = new LinkedList<T>();
		for(T eL1 : l1) 
			if (!l2.contains(eL1))
				listaDiferencia.add(eL1);
		return listaDiferencia;		
	}
	
	public static void main(String[] args) {
		JParcialGenerico pg = new JParcialGenerico();
		
		List<String> l1 = new LinkedList<String>();
		l1.add("poo1");
		l1.add("ayed");
		l1.add("mate");
		
		List<String> l2 = new LinkedList<String>();
		l2.add("lf");
		l2.add("poo1");
		l2.add("poo2");
		
		System.out.println(pg.<String>diferencia(l1, l2));
	}

}
