package ar.edu.uno.poo1.proyecto_punto.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ar.edu.uno.poo1.proyecto_punto.domain.Cuadrante;
import ar.edu.uno.poo1.proyecto_punto.domain.Plano;
import ar.edu.uno.poo1.proyecto_punto.domain.Punto;

public class PlanoTest {
	
	private static Plano plano;
	
	@BeforeAll
	public static void inicializarPlano() {
		plano = new Plano(1000000);
		plano.agregarPunto(new Punto(3.0, 8.1));
		plano.agregarPunto(new Punto(-3.0, 8.1));
		plano.agregarPunto(new Punto(3.0, 8.1));
		plano.agregarPunto(new Punto(3.0, 8.1));
		plano.agregarPunto(new Punto());
	}
	
	
	@Test
	public void verificarCantPuntosEnCuadrante1() {
		assertEquals(3, plano.contarPuntosPorCuadranteFOREACH(Cuadrante.PRIMER));
	}
	
	@Test
	public void verificarCantPuntosEnCuadrante2() {
		assertEquals(1, plano.contarPuntosPorCuadranteFOREACH(Cuadrante.SEGUNDO));
	}
	
	@Test
	public void verificarCantPuntosEnCuadrante3() {
		assertEquals(0, plano.contarPuntosPorCuadrante(Cuadrante.TERCER));
	}
	
	@Test
	public void verificarCantPuntosEnCuadrante4() {
		assertEquals(0, plano.contarPuntosPorCuadrante(Cuadrante.CUARTO));
	}
	
	@Test
	public void verificarCantPuntosEnSinCuadrante() {
		assertEquals(1, plano.contarPuntosPorCuadrante(Cuadrante.SIN_CUADRANTE));
	}
	
	

}
