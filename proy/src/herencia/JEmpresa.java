package herencia;

import java.util.ArrayList;

public class JEmpresa {

	private String CUIT;
	private String razonSocial;
	private ArrayList<JEmpleado> empleados;
	
	public JEmpresa(String CUIT, String razonSocial) {
		this.setCUIT(CUIT);
		this.setRazonSocial(razonSocial);
		this.setEmpleados(new ArrayList<JEmpleado>());
	}
	
	public String getCUIT() {
		return this.CUIT;
	}
	
	public void setCUIT(String CUIT) {
		this.CUIT = CUIT;
	}
	
	public String getRazonSocial() {
		return this.razonSocial;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public ArrayList<JEmpleado> getEmpleados() {
		return this.empleados;
	}
	
	public void setEmpleados(ArrayList<JEmpleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(JEmpleado empleado) {
		this.getEmpleados().add(empleado);
	}
	
	public Double getMontoTotal() {
		Double acumuladorMonto = 0.0;
		for (JEmpleado empleado : this.getEmpleados())
			acumuladorMonto += empleado.getSueldo();
		return acumuladorMonto;
	}
	
	public void mostrarEnConsolaLiquidacion() {
		System.out.println("Empresa: ".concat(this.getRazonSocial()).concat("\t\t").concat("CUIT: ")
			.concat(this.getCUIT()));
		System.out.println("Empleados");
		System.out.println("Cantidad Horas Trabajadas".concat("\t").concat("Esta Casado?").concat("\t")
			.concat("Cantidad Hijos").concat("\t").concat("Cantidad Años Antiguedad"));
		for (JEmpleado empleado : this.getEmpleados())
			System.out.println(empleado);
		System.out.println();
		System.out.println("TOTAL: ".concat(String.valueOf(this.getMontoTotal())));
	}

}