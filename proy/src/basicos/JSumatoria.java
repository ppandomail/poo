package basicos;

public class JSumatoria {

	public static void main(String[] args) {
		int n1 = 4;
		int n2 = 5;
		int resultado = n1 + n2;
		mostrarConsola(resultado);
		mostrarConsola(sumar(n1, n2));
		mostrarConsola(sumar(2, 3));
	}
	
	public static int sumar(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void mostrarConsola(int n) {
		System.out.println(n);
	}

}
