package genericidad;

public class JUsoCuentaBancaria {
	
	public static void main(String[] args) {
		
		JCuentaBancariaObject cbDouble = new JCuentaBancariaObject(1099.99);
		JCuentaBancariaObject cbString = new JCuentaBancariaObject("mil noventa y nueve con noventa y nueve");
		
		String str = (String) cbDouble.getSaldo();
		System.out.println(str);

		Double dbl = (Double) cbString.getSaldo();
		System.out.println(dbl);
		
		JCuentaBancariaGenerica<Double> cbgD = new JCuentaBancariaGenerica<Double>(1099.99);
		JCuentaBancariaGenerica<String> cbgS = new JCuentaBancariaGenerica<String>("mil noventa y nueve con noventa y nueve");
		
		System.out.println(cbgD.getSaldo());
		System.out.println(cbgS.getSaldo());
				
	}

}