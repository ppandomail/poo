package colecciones;

import java.util.Date;

public class JNotebooksTest {

	public static void main(String[] args) {
		JNotebook notebook1 = new JNotebook("Abble", "Pro", "", 100);
		JNotebook notebook2 = new JNotebook("Mamung", "Z", "", 200);
		JDetalleOrden detalleOrden1 = new JDetalleOrden(notebook1, 20000, 2);
		JDetalleOrden detalleOrden2 = new JDetalleOrden(notebook2, 10000, 1);
		JOrden orden = new JOrden(1, new Date());
		orden.agregarItem(detalleOrden1);
		orden.agregarItem(detalleOrden2);
		System.out.println(orden.calcularTotalOrden());
	}

}