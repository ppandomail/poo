package basicos;

public class JCruzNumeros {

	public static void main(String[] args) {
		JCruzNumeros.mostrar(2);
		JCruzNumeros.mostrar(3);
		JCruzNumeros.mostrar(4);
		JCruzNumeros.mostrar(5);
		JCruzNumeros.mostrar(6);
	}

	public static void mostrar(int numero) {
		String blancos = "";
		for (int i = 1; i < numero; i++)
			blancos += " ";
		for (int i = 1; i < numero; i++)
			System.out.println(blancos + i);
		for (int i = 1; i <= numero; i++)
			System.out.print(i);
		for (int i = numero - 1; i > 0; i--)
			System.out.print(i);
		System.out.println();
		for (int i = numero - 1; i > 0; i--)
			System.out.println(blancos + i);
		System.out.println();
	}

}