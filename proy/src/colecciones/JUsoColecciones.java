package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JUsoColecciones {

	public static void main(String[] args) {
		// ArrayList
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("POO1");
		arrayList.add("SO");
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.size());
		System.out.println(arrayList);

		// LinkedList
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Lic. Inf.");
		lista.add("Ing. Inf");
		lista.add("Tecn. Prog.");
		System.out.println(lista);

		// Stack : LIFO
		Stack<Integer> pila = new Stack<Integer>();
		pila.push(3);
		pila.push(1);
		pila.push(2);
		System.out.println(pila.peek());
		int elem = pila.pop();
		System.out.println(elem);
		System.out.println(pila.peek());

		// ConcurrentLinkedQueue : FIFO
		ConcurrentLinkedQueue<Character> cola = new ConcurrentLinkedQueue<Character>();
		// COLE C -> A -> B
		cola.offer('C');
		cola.offer('A');
		cola.offer('B');
		System.out.println(cola.peek());
		cola.poll();
		System.out.println(cola.peek());

		// HashMap : mapa, diccionario clave y un valor
		// titulo = Simulador de Aviones
		// CantUsuarios = 3
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("Materia", "POO1");
		mapa.put("Nota", "7");
		mapa.put("Materia", "SO");
		System.out.println(mapa.get("Materia"));
		System.out.println(mapa);

		// HashSet : conjunto, no admite repetidos
		HashSet<String> conjunto = new HashSet<String>();
		conjunto.add("oct");
		conjunto.add("nov");
		conjunto.add("octubre");
	}

}