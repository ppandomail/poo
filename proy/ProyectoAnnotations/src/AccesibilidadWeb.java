
@Bug(numero = 123, descripcion = "el sitio destellaba mas de 3 veces", tester="Gosling")
public class AccesibilidadWeb {
	
	private String url;
	private int puntaje;
	
	@Bug(numero = 456, tester = "na")
	public AccesibilidadWeb(String url, int puntaje) {
		this.url = url;
		this.puntaje = puntaje;
	}
	
}