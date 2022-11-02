package ar.edu.uno.poo1.proyecto_generics;

public class UsoCuentaBancaria {
	
	public static void main(String[] args) {
		
		CuentaBancariaObject cbDouble = new CuentaBancariaObject(1099.99);
		CuentaBancariaObject cbString = new CuentaBancariaObject("mil noventa y nueve con noventa y nueve");
		
		//String str = (String) cbDouble.getSaldo();
		//Double dbl = (Double) cbString.getSaldo();
		
		CuentaBancariaGenerica<Double> cbgD = new CuentaBancariaGenerica<Double>(1099.99);
		CuentaBancariaGenerica<String> cbgS = new CuentaBancariaGenerica<String>("mil noventa y nueve con noventa y nueve");
		
		System.out.println(cbgD.getSaldo());
		System.out.println(cbgS.getSaldo());
				
	}

}