package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import encapsulamiento.JCuadrante;
import encapsulamiento.JPlano;
import encapsulamiento.JPunto;

public class LecturaArchivoPuntos {
	
	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String linea = null;
		JPlano plano = new JPlano();
		try {
			fileReader = new FileReader(
				"resources//puntos.in");
			bufferedReader = new BufferedReader(fileReader);
			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
				String[] lineaSpliteada = linea.split(",");
				plano.agregarPunto(new JPunto(Double.parseDouble(lineaSpliteada[0]), Double
					.parseDouble(lineaSpliteada[1])));
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
		System.out.println(plano.getCantidadPuntos(JCuadrante.I));
		System.out.println(plano.getCantidadPuntos(JCuadrante.II));
		System.out.println(plano.getCantidadPuntos(JCuadrante.III));
		System.out.println(plano.getCantidadPuntos(JCuadrante.IV));
	}

}