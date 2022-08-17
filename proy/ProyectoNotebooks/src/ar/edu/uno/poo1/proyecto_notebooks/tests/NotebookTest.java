package ar.edu.uno.poo1.proyecto_notebooks.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ar.edu.uno.poo1.proyecto_notebooks.modelo.Cliente;
import ar.edu.uno.poo1.proyecto_notebooks.modelo.DetalleOrden;
import ar.edu.uno.poo1.proyecto_notebooks.modelo.Notebook;
import ar.edu.uno.poo1.proyecto_notebooks.modelo.Orden;

public class NotebookTest {
	
	private static Cliente cliente;
	
	
	@BeforeAll
	public static void setUp() {
		cliente = new Cliente("Leo Messi", 10101010);
		Orden orden = new Orden(1, new Date());
		DetalleOrden detOrden1 = new DetalleOrden(new Notebook("Abble", "Pro", "Intel", 512), 20000, 2);
		DetalleOrden detOrden2 = new DetalleOrden(new Notebook("Mamung", "Z", "AMD", 1024), 10000, 1);
		orden.agregarItem(detOrden1);
		orden.agregarItem(detOrden2);
		cliente.addOrden(orden);			
	}
	
	@Test
	public void testCantidadOrdenes() {
		assertEquals(1, cliente.getNroOrdenes());
	}
	
	@Test
	public void testDniCliente() {
		assertEquals(10101010, cliente.getDni());
	}
	
	@Test
	public void testPrecioTotalOrden() {
		assertEquals(50000, cliente.getOrdenById(1).calcularTotalOrden());
	}
	
	@Test
	public void testPrecioTotalOrdenesCliente() {	
		Orden orden = new Orden(2, new Date());
		orden.agregarItem(new DetalleOrden(new Notebook("X", "Y", "P", 1), 35000, 2));
		cliente.addOrden(orden);		
		assertEquals(120000, cliente.getPrecioTotalOrdenes());
		cliente.eliminarOrden(orden);
	}
	
	@Test
	public void testPrecioTotalOrdenesClienteEliminandOrden() {	
		cliente.eliminarOrden(new Orden(1, null));		
		assertEquals(0, cliente.getPrecioTotalOrdenes());
	}

}