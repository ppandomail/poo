package colecciones;

public class JProductosTest {

	public static void main(String[] args) {
		JProductos listaProductos = new JProductos();
		listaProductos.agregarProducto(new JProducto(1, "MacBook", 300000.0, 42));
		listaProductos.agregarProducto(new JProducto(2, "IPAD", 100000.0, 21));
		listaProductos.agregarProducto(new JProducto(3, "IPHONE", 80000.0, 53));
		listaProductos.agregarProducto(new JProducto(4, "PEN", 15000.0, 7));
		listaProductos.agregarProducto(new JProducto(5, "KEY", 18000.0, 89));
		System.out.println(listaProductos);
		System.out.println(listaProductos.getKesimo(2));
		System.out.println();
		listaProductos.incrementarImporte(new JProducto(2), 10);
		System.out.println(listaProductos);
		System.out.println(listaProductos.getStock(new JProducto(2)));
		System.out.println(listaProductos.getStock(new JProducto(9)));
		System.out.println();
		System.out.println(listaProductos.getProductosStockInferiorA(50));
		System.out.println(listaProductos.getProductosStockSuperiorIgualA(50));
	}

}