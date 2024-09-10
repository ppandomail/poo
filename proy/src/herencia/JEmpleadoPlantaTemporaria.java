package herencia;

public class JEmpleadoPlantaTemporaria extends JEmpleado {
	
	private static final Double IMPORTE_POR_HORA = 20.0;
	
	public JEmpleadoPlantaTemporaria(Integer cantidadHorasTrabajadas, Boolean estaCasado, Integer cantidadHijos) {
		super(cantidadHorasTrabajadas, estaCasado, cantidadHijos);
	}
	
	public Double getSalarioHorasTrabajadas() {
		return this.getCantidadHorasTrabajadas() * JEmpleadoPlantaTemporaria.IMPORTE_POR_HORA;
	}
	
	public Double getSalarioAntiguedad() {
		return 0.0;
	}
	
}