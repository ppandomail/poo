package colecciones;


import java.util.ArrayList;

public class JCarrito {
	
	private static final Integer CANTIDAD_MAXIMA_ITEMS = 30;
	private Integer contadorItems;
	private ArrayList<JItemCarrito> itemsCarrito;
	
	public JCarrito() {
		this.setContadorItems(0);
		this.setItemsCarrito(new ArrayList<JItemCarrito>(JCarrito.getCantidadMaximaItems()));
	}
	
	public Integer getContadorItems() {
		return this.contadorItems;
	}
	
	public void setContadorItems(Integer contadorItems) {
		this.contadorItems = contadorItems;
	}
	
	public ArrayList<JItemCarrito> getItemsCarrito() {
		return this.itemsCarrito;
	}
	
	public void setItemsCarrito(ArrayList<JItemCarrito> itemsCarrito) {
		this.itemsCarrito = itemsCarrito;
	}
	
	public static Integer getCantidadMaximaItems() {
		return JCarrito.CANTIDAD_MAXIMA_ITEMS;
	}
	
	public void agregarItemCarrito(JItemCarrito itemCarrito) {
		if (this.getContadorItems() <= JCarrito.getCantidadMaximaItems()) {
			this.getItemsCarrito().add(itemCarrito);
			this.setContadorItems(this.getContadorItems() + 1);
		}
	}
	
	public void eliminarItemCarrito(JItemCarrito itemCarrito) {
		
	}
	
	public Double getPrecio() {
		Double acumuladorPrecioItemCarrito = 0.0;
		for (JItemCarrito itemCarrito : this.getItemsCarrito())
			acumuladorPrecioItemCarrito += itemCarrito.getPrecio();
		return acumuladorPrecioItemCarrito;
	}
	
	public Integer getCantidadLibrosPorGenero(JGeneroLibro genero) {
		Integer contadorLibrosPorGenero = 0;
		for (JItemCarrito itemCarrito : this.getItemsCarrito())
			if (itemCarrito.getLibro().getGenero().equals(genero))
				contadorLibrosPorGenero++;
		return contadorLibrosPorGenero;
	}
	
	public String toString() {
		String representacion = "--------------------------------------" + "\n";
		for (JItemCarrito itemCarrito : this.getItemsCarrito())
			representacion += itemCarrito.getCantidadLibrosAComprar() + "\t"
					+ String.format("%1$-20s", itemCarrito.getLibro().getTitulo()) + "\t"
					+ itemCarrito.getPrecio() + "\n";
		representacion += "--------------------------------------" + "\n";
		representacion += "Cantidad Items: " + this.getContadorItems() + "\n";
		representacion += "TOTAL A PAGAR : " + this.getPrecio();
		return representacion;
	}
	
}