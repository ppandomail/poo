package ar.edu.uno.poo1.proyecto_punto.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.uno.poo1.proyecto_punto.domain.Punto;

public class PuntoTest {
	
	@BeforeAll
	public static void antesDeTodosLosTests() {
		//precondiciones
		System.out.println("Abrir Conexion");
		
	}
	
	@BeforeEach
	public void antesDeCadaTest() {
		//precondiciones
		System.out.println("Antes de cada test");
	}
	
	
	@Test
	public void verificarValorX() {
		Punto p = new Punto(3.4, 4.8);
		assertEquals(3.4, p.getX());	
	}
	
	@Test
	public void verificarValorY() {
		Punto p = new Punto(3.4, 4.8);
		assertEquals(4.8, p.getY());
	}
	
	@Test
	public void verificarValorXDefault() {
		Punto p = new Punto();
		assertEquals(0.0, p.getX());
	}
	
	@Test
	public void verificarValorYDefault() {
		Punto p = new Punto();
		assertEquals(0.0, p.getY());
	}
	
	@Test
	public void verificarValorXDesdeOtroPunto() {
		Punto p = new Punto(1.2, 3.4);
		Punto p2 = new Punto(p);
		assertEquals(1.2, p2.getX());
	}
	
	@Test
	public void verificarValorYDesdeOtroPunto() {
		Punto p = new Punto(1.2, 3.4);
		Punto p2 = new Punto(p);
		assertEquals(p.getY(), p2.getY());
	}
	
	@Test
	public void verificarDistancia() {
		Punto p = new Punto(100.0, 200.0);
		Punto p2 = new Punto(400.0, 800.0);
		double distancia = p.calcularDistancia(p2);
		assertEquals(670.820393249937, distancia);
	}
	
	@Test
	public void verificarIgualdad() {
		Punto p = new Punto(1.0, 2.0);
		Punto p2 = new Punto(1.0, 2.0);
		assertEquals(true, p.isIgual(p2));
	}
	
	@Test
	public void verificarNoIgualdad() {
		Punto p = new Punto(1.0, 2.0);
		Punto p2 = new Punto(1.3, 2.0);
		assertEquals(false, p.isIgual(p2));
	}
	
	@Test
	public void verificarNoIgualdadPorNull() {
		Punto p = new Punto(1.0, 2.0);
		assertEquals(false, p.isIgual(null));
	}
	
	@Test
	public void verificarEqualsPorValoresIguales() {
		Punto p = new Punto(1.0, 2.0);
		Punto p2 = new Punto(1.0, 2.0);
		assertEquals(true, p.equals(p2));
	}
	
	@Test
	public void verificarEqualsPorValoresDiferentes() {
		Punto p = new Punto(1.0, 2.0);
		Punto p2 = new Punto(2.0, 1.0);
		assertEquals(false, p.equals(p2));
	}
	
	@Test
	public void verificarEqualsPorPosicionMemoria() {
		Punto p = new Punto(1.0, 2.0);
		Punto p2 = p;
		assertEquals(true, p.equals(p2));
	}
	
	@Test
	public void verificarEqualsPorNull() {
		Punto p = new Punto(1.0, 2.0);
		assertEquals(false, p.equals(null));
	}
	
	@Test
	public void verificarEqualsPorObjetoNoPunto() {
		Punto p = new Punto(1.0, 2.0);
		assertEquals(false, p.equals(new Integer(3)));
	}
	
	@AfterAll
	public static void despuesDeTodosLosTests() {
		//postcondiciones
		System.out.println("Cerrar conexión");
	}
	
	@AfterEach
	public void despuesDeCadaTest() {
		//postcondiciones
		System.out.println("Despues de cada test");
	}
	
	
}