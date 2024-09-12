package colecciones;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class JBiblioteca {

	private Map<JGenero, List<JPlayList>> mapa;

	public JBiblioteca() {
		mapa = new HashMap<JGenero, List<JPlayList>>();
	}

	public void agregar(JGenero genero, JPlayList playlist) {
		if (mapa.get(genero) == null) {
			List<JPlayList> listaPlayList = new LinkedList<JPlayList>();
			listaPlayList.add(playlist);
			mapa.put(genero, listaPlayList);
		} else {
			mapa.get(genero).add(playlist);
		}
	}

	public int getCantidadPlayList(JGenero genero) {
		return mapa.get(genero) == null ? 0 : mapa.get(genero).size();
	}

}