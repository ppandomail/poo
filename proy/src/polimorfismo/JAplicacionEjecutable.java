package polimorfismo;

public class JAplicacionEjecutable {

	public static void main(String[] args) {
		JPelicula [] peliculas = new JPelicula[] {new JPelicula(), new JPelicula("Titanic", 2021, JGenero.DRAMA, "Cameron")};
		JSerie [] series = new JSerie[] {new JSerie(), new JSerie("Lost", 1, JGenero.SUSPENSO, "Abrams"), new JSerie()};
		JVideoJuego [] videoJuegos = new JVideoJuego[] {new JVideoJuego(), new JVideoJuego("Pacman", 5)};
		peliculas[1].entregar();
		series[0].entregar();
		series[1].entregar();
		JEntregas entregasPeliculas = new JEntregas(peliculas);
		JEntregas entregasSeries = new JEntregas(series);
		JEntregas entregasVideoJuegos = new JEntregas(videoJuegos);
		System.out.println(entregasPeliculas.getCantidadEntregados());
		System.out.println(entregasSeries.getCantidadEntregados());
		System.out.println(entregasVideoJuegos.getCantidadEntregados());
		System.out.println(entregasPeliculas.getMax());
		System.out.println(entregasSeries.getMax());
		System.out.println(entregasVideoJuegos.getMax());
	}
	
	

}