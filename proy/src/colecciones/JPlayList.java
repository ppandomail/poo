package colecciones;

import java.util.LinkedList;
import java.util.List;

public class JPlayList {
	
	private List<JCancion> canciones;
	
	public JPlayList() {
		canciones = new LinkedList<JCancion>();
	}
	
	public void agregar(JCancion cancion) {
		canciones.add(cancion);	
	}

	public Object getCantidadCanciones() {
		return canciones.size();
	}

	public int getDuracion() {
		int acum = 0;
		for(JCancion cancion : canciones)
			acum += cancion.getDuracion();
		return acum;
	}

	public String getTituloMenorDuracion() {
		if (canciones.isEmpty()) return "";
		JCancion cancionConDurMin = canciones.get(0);
		for (int i = 1; i < canciones.size(); i++)
			if (canciones.get(i).getDuracion() < cancionConDurMin.getDuracion())
				cancionConDurMin = canciones.get(i);
		return cancionConDurMin.getTitulo();
	}

}