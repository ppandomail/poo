package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JMain {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String linea = null;
		JPoblacion poblacion = new JPoblacion();
		try {
			fileReader = new FileReader("src/archivos/poblacion.txt");
			bufferedReader = new BufferedReader(fileReader);
			while ((linea = bufferedReader.readLine()) != null) {
				poblacion.agregarCromosoma(new JCromosoma(linea));
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		try {
			if (bufferedReader != null)
				bufferedReader.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
		for (JCromosoma c : poblacion.getPoblacion())
			System.out.println(c);
		System.out.println(poblacion.mutar());
	}

}