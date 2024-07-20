package generics;

public class UsoCuentaBancaria {
	
	public static void main(String[] args) {
		
		CuentaBancariaObject cbDouble = new CuentaBancariaObject(1099.99);
		CuentaBancariaObject cbString = new CuentaBancariaObject("mil noventa y nueve con noventa y nueve");
		
		String str = (String) cbDouble.getSaldo();
		System.out.println(str);

		Double dbl = (Double) cbString.getSaldo();
		System.out.println(dbl);
		
		CuentaBancariaGenerica<Double> cbgD = new CuentaBancariaGenerica<Double>(1099.99);
		CuentaBancariaGenerica<String> cbgS = new CuentaBancariaGenerica<String>("mil noventa y nueve con noventa y nueve");
		
		System.out.println(cbgD.getSaldo());
		System.out.println(cbgS.getSaldo());
				
	}

}