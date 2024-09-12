package encapsulamiento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JComplejoTest {

	@Test
	public void testRealImaginario() {
		JComplejo z1 = new JComplejo();
		assertEquals(0, z1.getReal());
		assertEquals(0, z1.getImag());
	}

	@Test
	public void testSuma() {
		JComplejo z1 = new JComplejo();
		JComplejo z2 = new JComplejo(2, 2);
		JComplejo z3 = z1.suma(z2);
		assertEquals(2, z3.getReal());
		assertEquals(2, z3.getImag());
	}

	@Test
	public void testSumaSuma() {
		JComplejo z1 = new JComplejo();
		JComplejo z2 = new JComplejo(2, 2);
		JComplejo z3 = z1.suma(z2);
		JComplejo z4 = JComplejo.suma(z2, z3);
		assertEquals(4, z4.getReal());
		assertEquals(4, z4.getImag());
	}

}