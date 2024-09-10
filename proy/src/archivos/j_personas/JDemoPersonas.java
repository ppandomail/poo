import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JDemoPersonas {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		JColaPersonas colaPersonas = new JColaPersonas();
		try {
			fr = new FileReader("resources/Datos.in");
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String [] split = linea.split(",");
				JPersona persona = new JPersona(split);
				colaPersonas.agregarPersona(persona);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			if (br != null)
				br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(colaPersonas);
		HashMap<JTipoCola, ConcurrentLinkedQueue<JPersona>> mapa = colaPersonas.getMapaEdad();
		for(JTipoCola tc : mapa.keySet())
			System.out.println(mapa.get(tc));
	}

}