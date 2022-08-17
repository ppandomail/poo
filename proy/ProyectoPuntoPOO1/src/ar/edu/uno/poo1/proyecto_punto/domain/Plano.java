package ar.edu.uno.poo1.proyecto_punto.domain;

public class Plano {
	
	private Punto [] puntos;
	private int cantidadPuntos;
	
	public Plano(int cantidadMaximaPuntos) {
		puntos = new Punto[cantidadMaximaPuntos];
		cantidadPuntos = 0;
	}
	
	public void agregarPunto(Punto punto) {
		if (cantidadPuntos < puntos.length) {
			puntos[cantidadPuntos] = punto;
			cantidadPuntos++;
		}	
	}
	
	public int contarPuntosPorCuadrante(Cuadrante cuadrante) {
		int contador = 0;
		for (int i=0; i< cantidadPuntos; i++)
			if (puntos[i].getCuadrante().equals(cuadrante))
				contador++;
		return contador;
	}
	
	public int contarPuntosPorCuadranteFOREACH(Cuadrante cuadrante) {
		int contador = 0;
		for (Punto punto : puntos)
			if ((punto != null) && (punto.getCuadrante().equals(cuadrante)))
				contador++;
		return contador;
	}

}
