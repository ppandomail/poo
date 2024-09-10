package herencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JEmpleadosTest {

	@Test
	public void testLiquidacion() {
		JEmpresa empresa = new JEmpresa("20-24862699-3", "Universidad Nacional del Oeste");
		empresa.agregarEmpleado(new JEmpleadoPlantaTemporaria(80, Boolean.TRUE, 0));
		empresa.agregarEmpleado(new JEmpleadoPlantaPermanente(80, Boolean.TRUE, 2, 6));
		empresa.agregarEmpleado(new JEmpleadoPlantaPermanente(160, Boolean.FALSE, 0, 4));
		empresa.agregarEmpleado(new JEmpleadoGerente(160, Boolean.TRUE, 1, 10));
		assertEquals(15540.0, empresa.getMontoTotal());
	}

}