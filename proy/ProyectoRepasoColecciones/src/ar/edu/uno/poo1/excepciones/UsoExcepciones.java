package ar.edu.uno.poo1.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UsoExcepciones {

	public static void main(String[] args) {
		String [] arreglo = new String[] {"Lun", "Mie", "Vie"};
		System.out.println(arreglo.length);
		System.out.println(arreglo[1]);
		//System.out.println(arreglo[3]);
		//int edad = Integer.parseInt("18a");
		//System.out.println(edad+1);
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/pepe.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("Crear el archivo...");
		}
		
		try {
			Pablo pablo = new Pablo(0);
		} catch (PabloException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
