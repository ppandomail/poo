package colecciones;

public class JSupermercadoTest {

	public static void main(String[] args) {
		System.out.println("DIA");
		JSupermercado dia = new JSupermercado();
		dia.agregarClientesColaA(10);
		System.out.println(dia);
		dia.abrirColaB(15);
		System.out.println(dia);
		System.out.println();
		
		System.out.println("COTO");
		JSupermercado coto = new JSupermercado();
		coto.agregarClienteColaA(new JCliente(1, 9));
		coto.agregarClienteColaA(new JCliente(2, 3));
		coto.agregarClienteColaA(new JCliente(3, 7));
		System.out.println(coto);
		coto.abrirColaB(5);
		System.out.println(coto);		
	}

}
