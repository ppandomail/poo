package basicos;

public class JFizzBuzzImperativoMejorado {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			if (JFizzBuzzImperativoMejorado.esDivisiblePor3(i) && JFizzBuzzImperativoMejorado.esDivisiblePor5(i))
				System.out.println("FizzBuzz");
			else if (JFizzBuzzImperativoMejorado.esDivisiblePor3(i))
				System.out.println("Fizz");
			else if (JFizzBuzzImperativoMejorado.esDivisiblePor5(i))
				System.out.println("Buzz");
			else
				System.out.println(i);

	}

	public static boolean esDivisiblePor3(int numero) {
		return numero % 3 == 0;
	}

	public static boolean esDivisiblePor5(int numero) {
		return numero % 5 == 0;
	}

}