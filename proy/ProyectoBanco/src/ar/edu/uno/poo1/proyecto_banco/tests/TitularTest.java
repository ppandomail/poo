package ar.edu.uno.poo1.proyecto_banco.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.uno.poo1.proyecto_banco.modelo.Titular;

public class TitularTest {
	
	@Test
	public void verificarToStringTitular() {
		Titular t = new Titular("pepe", "9876");
		assertEquals("pepe - 9876", t.toString());
	}

}
