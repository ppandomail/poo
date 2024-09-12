package colecciones;

import java.util.ArrayList;
import java.util.List;

public class JArrayListTest {

	public static void main(String[] args) {
		ArrayList<JPersona> personas = new JMiArrayList<JPersona>();    //capac default 10
		List<JPersona> personas2 = new ArrayList<JPersona>(5);  //capac param 5
		System.out.println(personas.size());
		System.out.println(personas);
		personas.add(new JPersona(111, "pepe", 13));
		System.out.println(personas.size());
		//System.out.println(personas);
		personas.add(new JPersona(222, "pepa", 60));
		System.out.println(personas);
		for (int i = 1; i <= 8; i++) {
			personas2.add(new JPersona(i, "poo1", 27));
			System.out.println(personas2);
		}
		System.out.println(personas2.isEmpty());
		personas2.clear();
		System.out.println(personas2.size());
		JPersona per = new JPersona(12345, "Pablo Pandolfo", 33);
		System.out.println(personas2.contains(per));
		personas2.add(per);
		System.out.println(personas2.contains(per));	
	}
	
	public static void mostrarArrayList(ArrayList<JPersona> personas) {
		for (JPersona p : personas)
			System.out.println(p);
	}

}