package colecciones;

public class JCarritoTest {

	public static void main(String[] args) {
		JCarrito carrito = new JCarrito();
		carrito.agregarItemCarrito(new JItemCarrito(2,
			new JLibro("123", "Harry Potter", JGeneroLibro.INFANTIL, 100.0)));
		carrito.agregarItemCarrito(new JItemCarrito(1,
			new JLibro("456", "El Principito", JGeneroLibro.INFANTIL, 50.0)));
		carrito.agregarItemCarrito(new JItemCarrito(3, new JLibro("789", "Los Juegos del Hambre",
			JGeneroLibro.CIENCIA_FICCION, 150.0)));
		System.out.println(carrito.getPrecio());
		System.out.println(carrito.getCantidadLibrosPorGenero(JGeneroLibro.INFANTIL));
		System.out.println(carrito.getCantidadLibrosPorGenero(JGeneroLibro.CIENCIA_FICCION));
		System.out.println(carrito.getCantidadLibrosPorGenero(JGeneroLibro.TERROR));
		System.out.println(carrito);
	}

}