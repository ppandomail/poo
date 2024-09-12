package encapsulamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JMonederoTest {

	@Test
	public void testMonederoCreado() {
		JMonedero monedero = new JMonedero(25000.0);
		assertEquals(25000.0, monedero.consultarSaldoFormatoNumerico());
		assertEquals("$ 25000.0", monedero.consultarSaldoFormatoString());
	}

	@Test
	public void testMeterDinero() {
		JMonedero monedero = new JMonedero(25000.0);
		monedero.meterDinero(2000.0);
		assertEquals(27000.0, monedero.consultarSaldoFormatoNumerico());
	}

	@Test
	public void testIntentarSacarDinero() {
		JMonedero monedero = new JMonedero(25000.0);
		monedero.sacarDinero(30000.0);
		assertEquals(25000.0, monedero.consultarSaldoFormatoNumerico());
	}

	@Test
	public void testSacarDinero() {
		JMonedero monedero = new JMonedero(25000.0);
		monedero.sacarDinero(25000.0);
		assertEquals(0.0, monedero.consultarSaldoFormatoNumerico());
	}
		
}