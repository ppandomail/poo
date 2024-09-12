package encapsulamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JCompiladorTest {

	@Test
	public void testProgramaFuenteVacio() {
		JCompilador compilador = new JCompilador();
		assertEquals("100 - El programa fuente se encuentra vacio.", compilador.compilar());
	}

	@Test
	public void testProgramaFuenteNoIniciaConSentenciaC() {
		JCompilador compilador = new JCompilador("F");
		assertEquals("200 - El programa fuente no inicia con la sentencia C.", compilador.compilar());
	}

	@Test
	public void testProgramaFuenteNoTerminaConSentenciaF() {
		JCompilador compilador = new JCompilador("C");
		assertEquals("300 - El programa fuente no termina con la sentencia F.", compilador.compilar());
	}

	@Test
	public void testProgramaFuenteNoIniciaConSentenciaC_NoTerminaConSentenciaF() {
		JCompilador compilador = new JCompilador("NN");
		assertEquals("200 - El programa fuente no inicia con la sentencia C.300 - El programa fuente no termina con la sentencia F.", compilador.compilar());
	}

	@Test
	public void testProgramaFuenteConSimbolosDesconocidos() {
		JCompilador compilador = new JCompilador("CPF");
		assertEquals("400 - Símbolos desconocidos.", compilador.compilar());
	}

	@Test
	public void testCompilacionExistosa() {
		JCompilador compilador = new JCompilador("CNNF");
		assertEquals("Compilación con éxito", compilador.compilar());
		assertEquals("x: 0, y: 2", compilador.ejecutar());
	}

	@Test
	public void testCompilacionExistosa2() {
		JCompilador compilador = new JCompilador("CSSSNNEEF");
		assertEquals("Compilación con éxito", compilador.compilar());
		assertEquals("x: 2, y: -1", compilador.ejecutar());
	}

}