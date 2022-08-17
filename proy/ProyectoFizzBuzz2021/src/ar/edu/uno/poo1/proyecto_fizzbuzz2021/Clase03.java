package ar.edu.uno.poo1.proyecto_fizzbuzz2021;

import java.util.Arrays;

/**
 * 
 * @author Comision POO1 Martes Noche
 * @version 1.0
 * 
 * 
 */
public class Clase03 {
	
	/**
	 * 
	 * @param args argumentos de programa
	 */

	public static void main(String[] args) {
		int i = 1;
		int j = i + 2;
		
		Integer objInt = new Integer(1);
		Float objFloat = new Float(3.1);
		Double objDouble = new Double (3.14);
		
		Character objChar = new Character('a');
		Boolean objBool = new Boolean(true);
		
		String idioma = "Portugues";
		idioma = idioma.toUpperCase();
		System.out.println(idioma);
		
		System.out.println(idioma.length()); //9
		System.out.println("".length()); //0
		System.out.println(" ".length()); //1
		
		System.out.println(idioma.charAt(0)); //'P'
		System.out.println(idioma.charAt(8)); //'S'
		//System.out.println(idioma.charAt(9)); //StringIndexOutOfBoundsException
		
		System.out.println(idioma.substring(0, 5)); //PORTU
		System.out.println(idioma.substring(3)); //TUGUES
		System.out.println(idioma.substring(3, 9)); //TUGUES
		
		System.out.println(idioma.equals("Portugues")); //false
		System.out.println(idioma.equals("PORTUGUES")); //true
		System.out.println(idioma.equalsIgnoreCase("PorTUguEs")); //true
		
		System.out.println("  PRO   GRAMACION   ".trim());
		System.out.println("  PRO   GRAMACION   ".trim().replace("A", "4"));
		
		System.out.println(idioma.indexOf("GRA")); //-1
		System.out.println(idioma.indexOf("TUGUE")); //3
		System.out.println(idioma.indexOf("R")); //2
		System.out.println(idioma.indexOf("U")); //4
		System.out.println(idioma.indexOf("U", 5)); //6
		System.out.println(idioma.indexOf("U", 7)); //-1
		System.out.println(idioma.indexOf('U')); //4
		System.out.println(idioma.indexOf('U', 5)); //6
		
		System.out.println(idioma.toLowerCase());
		
		System.out.println(Character.toTitleCase(idioma.charAt(0)) + idioma.toLowerCase().substring(1));
		
		System.out.println(idioma.startsWith("PORTU")); //true
		System.out.println(idioma.startsWith("P")); //true
		System.out.println(idioma.startsWith("PORTUÑ")); //false
		System.out.println(idioma.endsWith("GUES")); //true
		System.out.println(idioma.endsWith("S")); //true
		System.out.println(idioma.endsWith("GES")); //false
		
		String mensaje = "Hay que cortar la verdura";
		String [] mensajeSpliteado = mensaje.split("ja");
		System.out.println(mensajeSpliteado[0]);
		
		System.out.println("Pepe".compareTo("Pepe")); //0
		System.out.println("Pepe".compareTo("Amor")); //15
		System.out.println("Pepe".compareTo("Zapato")); //-10
		
		System.out.println(Math.min(4, 4));
		System.out.println('P' - 'A');
		
		int [] array = new int [] {3, 6, 9};
		System.out.println(array[0]);
		Clase03.mostrarArreglo(array); //3-6-9
		array[1] = 12;
		Clase03.mostrarArreglo(array); //3-12-9
		Arrays.sort(array);
		Clase03.mostrarArreglo(array); //3-9-12
		
		String [] idiomas = new String[] {"Portugues", "Italiano", "Ingles", "Frances", "Español", "Aleman", "Japones"};
		Clase03.mostrarArreglo(idiomas);
		
	}
	
	/**
	 * 
	 * @param array arreglo de enteros son mostrados en consola
	 */
	public static void mostrarArreglo(int [] array) {
		for (int index = 0; index < array.length; index++)
			if (index == array.length - 1)
				System.out.print(array[index]);
			else 
				System.out.print(array[index] + "-");//3-6-9 
		System.out.println();
	}
	
	public static void mostrarArreglo(String [] array) {
		//Esto es un comentario 
		String cadenaAMostrar = "";
		/*
		 * Esto es un comentario multilinea
		 * otra linea.
		 */
		for(String elemento : array)
			cadenaAMostrar += elemento + "-";
		System.out.println(cadenaAMostrar.substring(0, cadenaAMostrar.length()-1));
	} 

}
