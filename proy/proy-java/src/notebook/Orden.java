package notebook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
	
	private List<DetalleOrden> items;
	private int id;
	private Date creacion;
	private Date envio;
	
	public Orden(int id, Date creacion) {
		this.items = new ArrayList<DetalleOrden>();
		this.id = id;
		this.creacion = creacion;
		this.envio = null;
	}
	
	public void agregarItem(DetalleOrden detalle) {
		items.add(detalle);
	}
	
	public int getNroItems() {
		return items.size();
	}
	
	public void setEnvio(Date envio) {
		this.envio = envio;
	}

	public int getId() {
		return id;
	}

	public Date getCreacion() {
		return creacion;
	}

	public Date getEnvio() {
		return envio;
	}
	
	public float calcularTotalOrden() {
		float acum = 0;
		for (DetalleOrden detalle : items)
			acum += detalle.getPrecioUnitario() * detalle.getCantidad();
		return acum;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!( o instanceof Orden)) return false;
		Orden orden = (Orden) o;
		return this.id == orden.id;
	}

}