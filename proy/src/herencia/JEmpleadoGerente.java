package herencia;

public class JEmpleadoGerente extends JEmpleadoPlantaPermanente {
	
	private static final Double IMPORTE_POR_HORA = 40.0;
	private static final Double IMPORTE_POR_AÑO_ANTIGUEDAD = 15.0;
	
	public JEmpleadoGerente(Integer cantidadHorasTrabajadas, Boolean estaCasado, Integer cantidadHijos,
			Integer cantidadAñosTrabajados) {
		super(cantidadHorasTrabajadas, estaCasado, cantidadHijos, cantidadAñosTrabajados);
	}
	
	public Double getSalarioHorasTrabajadas() {
		return this.getCantidadHorasTrabajadas() * JEmpleadoGerente.IMPORTE_POR_HORA;
	}
	
	public Double getSalarioAntiguedad() {
		return this.getCantidadAñosAntiguedad() * JEmpleadoGerente.IMPORTE_POR_AÑO_ANTIGUEDAD;
	}
	
}