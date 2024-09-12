package polimorfismo;

public class JAplicacionReseteable {

	public static void main(String[] args) {
		JEntrega entregas [] = new JEntrega[] {
				new JPelicula("Batman", "Campanella"),
				new JSerie("Los Simuladores", 2, JGenero.ACCION, "Sifrom"),
				new JPelicula()
		};
		entregas[0].setTitulo("Batman 2");
		System.out.println(entregas[0]);
		entregas[0].reset();
		System.out.println(entregas[0]);
	}

}
