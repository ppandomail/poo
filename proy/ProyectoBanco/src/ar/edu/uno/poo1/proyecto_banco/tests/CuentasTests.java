package ar.edu.uno.poo1.proyecto_banco.tests;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.uno.poo1.proyecto_banco.modelo.CajaAhorro;
import ar.edu.uno.poo1.proyecto_banco.modelo.CuentaBancaria;
import ar.edu.uno.poo1.proyecto_banco.modelo.CuentaCorriente;
import ar.edu.uno.poo1.proyecto_banco.modelo.Titular;

public class CuentasTests {
	
	@Test
	public void verificarConstruccionCorrectaCajaAhorro() {
		CajaAhorro ca = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		assertEquals(1234.56, ca.getSaldo());
		assertEquals("Pepe", ca.getTitular().getNombre());
		assertEquals("1234", ca.getTitular().getCUIT());
	}
	
	@Test
	public void verificarDepositoCorrectoCajaAhorro() {
		CajaAhorro ca = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		ca.depositar(0.44);
		assertEquals(1235.0, ca.getSaldo());
	}
	
	@Test
	public void verificarExtraccionCorrectaCajaAhorro() {
		CajaAhorro ca = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		ca.depositar(0.44);
		ca.extraer(0.44);
		assertEquals(1234.56, ca.getSaldo());
	}
	
	@Test
	public void verificarExtraccionImporteMayorASaldoCajaAhorro() {
		CajaAhorro ca = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		ca.depositar(0.44);
		ca.extraer(0.44);
		ca.extraer(1288.0);
		assertEquals(1234.56, ca.getSaldo());
	}
	
	
	@Test
	public void verificarToStringCajaAhorro() {
		CajaAhorro ca = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		assertEquals("1234.56 -> Pepe - 1234", ca.toString());
	}
	
	@Test
	public void verificarToStringCuentaCorriente() {
		CuentaCorriente cc = new CuentaCorriente(999.88, new Titular("Ana", "3322"));
		assertEquals("999.88 -> Ana - 3322", cc.toString());
	}
	
	@Test
	public void verificarSumaSaldoCuentas() {
		CuentaBancaria [] cb = new CuentaBancaria[4];
		cb[0] = new CajaAhorro(1234.56, new Titular("Pepe", "1234"));
		cb[1] = new CuentaCorriente(999.88, new Titular("Ana", "3322"));
		cb[2] = new CuentaCorriente(9.7, new Titular("Rosa", "3345"));
		cb[3] = new CuentaCorriente(33.0, new Titular("Jose", "666"));
		double saldoTotal = 0;
		for (CuentaBancaria c : cb) 
			saldoTotal += c.getSaldo();
		assertEquals(2277.14 ,saldoTotal);
	}
	
	

}
