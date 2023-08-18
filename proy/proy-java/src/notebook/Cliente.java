package notebook;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private int dni;
	private List<Orden> ordenes;
	
	public Cliente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.ordenes = new ArrayList<Orden>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}
	
	public void addOrden(Orden o) {
		ordenes.add(o);
	}
	
	public int getNroOrdenes() {
		return ordenes.size();
	}
	
	public Orden getOrdenById(int id) {
		for(Orden orden : ordenes) 
			if (orden.getId() == id)
				return orden;
		return null;
	}
	
	public float getPrecioTotalOrdenes() {
		float acum = 0;
		for (Orden orden : ordenes)
			acum += orden.calcularTotalOrden();
		return acum;
	}
	
	public void eliminarOrden(Orden orden) {
		ordenes.remove(orden);	
	}
		
}