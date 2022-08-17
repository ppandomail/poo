package ar.edu.uno.poo1.utilidades;

public class Date {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Date() {
		this(1, 1, 1970);
	}
	
	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	public Date(Date otrafecha) {
		this(otrafecha.getDia(), otrafecha.getMes(), otrafecha.getAno());
	}
	
	public Date(String stringfecha) {
		this(Integer.parseInt(stringfecha.split("-")[0]), Integer.parseInt(stringfecha.split("-")[1]), Integer.parseInt(stringfecha.split("-")[2]));	
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
	
	public boolean m(Date d) {
		return this == d;
	}
	


}
