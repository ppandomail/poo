package ar.edu.uno.poo1.proyecto_fizzbuzz2021;

import ar.edu.uno.poo1.utilidades.Date;
import ar.edu.uno.poo1.utilidades.Feriado;

public class Clase04 {

	public static void main(String[] args) {
		Date midate = new Date(31, 8, 2021);
		Date midatestr = new Date("31-8-2021");
		System.out.println(midate.getDia());
		System.out.println(midate.getMes());
		System.out.println(midate.getAno());
		System.out.println("-------------");
		System.out.println(midatestr.getDia());
		System.out.println(midatestr.getMes());
		System.out.println(midatestr.getAno());
		
		
		Date midatecopia = new Date(midate);
		System.out.println(midatecopia.m(midate)); //false
		
		System.out.println(midatecopia.m(midatecopia)); //true
		
		Date pepe = midatecopia;
		System.out.println(pepe.m(midatecopia)); //true
		
		
		Date datePorDefault = new Date();
		System.out.println(datePorDefault.getAno());
		
		Feriado feriado = new Feriado();
		System.out.println(feriado.getAlgo()); //0
		System.out.println(feriado.isFeriado()); //false
		System.out.println(feriado.getFecha()); //null
		
		
	}

}
