package genericidad;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class JDemoPuntoGenerico {

	public static void main(String[] args) {
		JPunto<Integer, Integer> p = new JPunto<Integer, Integer>(1, 2);
		System.out.println(p.getY());
		System.out.println(p);
		
		JPunto<Double, Character> p5 = new JPunto<Double, Character>(9.8, 'G');
		System.out.println(p5.getY());
		System.out.println(p5);
		
		ArrayList<Double> valoresConocidos = new ArrayList<Double>();
		valoresConocidos.add(9.8);
		valoresConocidos.add(3.14);
		valoresConocidos.add(2.7);
		
		ArrayList<Character> constantesConocidas = new ArrayList<Character>();
		constantesConocidas.add('G');
		constantesConocidas.add('P');
		constantesConocidas.add('E');
		
		JPunto<ArrayList<Double>, ArrayList<Character>> p6 = new JPunto<ArrayList<Double>, ArrayList<Character>>(valoresConocidos, constantesConocidas);
		System.out.println(p6.getY());
		System.out.println(p6);

		JPunto<String, Integer> p2 = new JPunto<String, Integer>("Nov", 2);
		System.out.println(p2.getX());
		System.out.println(p2);
		
		JPunto<Date, File> p3 = new JPunto<Date, File>(new Date(), new File("resources/Archivo.txt"));
		System.out.println(p3.getX());
		System.out.println(p3.getY().exists());
		System.out.println(p3);
		
		JPunto<ArrayList<Integer>, String> p4 = new JPunto<ArrayList<Integer>, String>(new ArrayList<Integer>(), "Prueba");
		System.out.println(p4);
	}

}