package colecciones;

import java.util.ArrayList;
import java.util.List;

public class JClienteNotebook {
	
	private String nombre;
	private int dni;
	private List<JOrden> ordenes;
	
	public JClienteNotebook(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.ordenes = new ArrayList<JOrden>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}
	
	public void addOrden(JOrden o) {
		ordenes.add(o);
	}
	
	public int getNroOrdenes() {
		return ordenes.size();
	}
	
	public JOrden getOrdenById(int id) {
		for(JOrden orden : ordenes) 
			if (orden.getId() == id)
				return orden;
		return null;
	}
	
	public float getPrecioTotalOrdenes() {
		float acum = 0;
		for (JOrden orden : ordenes)
			acum += orden.calcularTotalOrden();
		return acum;
	}
	
	public void eliminarOrden(JOrden orden) {
		ordenes.remove(orden);	
	}
		
}