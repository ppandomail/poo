package j_fizz_buzz;
public class JFizzBuzzImperativoSuperMejorado {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			if (JFizzBuzzImperativoSuperMejorado.esDivisiblePor3(i) && JFizzBuzzImperativoSuperMejorado.esDivisiblePor5(i))
				JFizzBuzzImperativoSuperMejorado.mostrarConsola("FizzBuzz");
			else if (JFizzBuzzImperativoSuperMejorado.esDivisiblePor3(i))
				JFizzBuzzImperativoSuperMejorado.mostrarConsola("Fizz");
			else if (JFizzBuzzImperativoSuperMejorado.esDivisiblePor5(i))
				JFizzBuzzImperativoSuperMejorado.mostrarConsola("Buzz");
			else
				JFizzBuzzImperativoSuperMejorado.mostrarConsola(String.valueOf(i));

	}

	public static boolean esDivisiblePor3(int numero) {
		return JFizzBuzzImperativoSuperMejorado.esDivisible(numero, 3);
	}

	public static boolean esDivisiblePor5(int numero) {
		return JFizzBuzzImperativoSuperMejorado.esDivisible(numero, 5);
	}

	public static boolean esDivisible(int numero, int divisor) {
		return numero % divisor == 0;
	}

	public static void mostrarConsola(String mensaje) {
		System.out.println(mensaje);
	}

}