package ar.edu.uno.poo1.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LectorEscritorArchivoPersonas {
	
	public static final int EDAD_MAYOR = 30;

	public static void main(String[] args) {
		LectorEscritorArchivoPersonas larch = new LectorEscritorArchivoPersonas();
		ArrayList<Persona> personas = larch.leerPersonas("resources/personas.in");
		larch.escribirPersonas("resources/personas_mayor_edad.out", personas);
	}

	public ArrayList<Persona> leerPersonas(String path) {
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		try {
			fr = new FileReader(new File(path));
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String [] lineaSpliteada = linea.split(" ");
				Persona per = new Persona(Long.parseLong(lineaSpliteada[0]), lineaSpliteada[1], Integer.parseInt(lineaSpliteada[2]));
				personas.add(per);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return personas;
	}

	public void escribirPersonas(String path, ArrayList<Persona> personas) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(path));
			bw = new BufferedWriter(fw);
			for (Persona per : personas) {
				if (per.getEdad() > EDAD_MAYOR) {
					bw.write(per.toString());
					bw.newLine();
				}
			}

		} catch(IOException e) {
			e.printStackTrace();
		}
		if (bw != null)
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}