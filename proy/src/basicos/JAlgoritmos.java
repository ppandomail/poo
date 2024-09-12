package basicos;

import java.util.Arrays;

public class JAlgoritmos {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + JAlgoritmos.testParImpar(i));
			System.out.println(i + ": " + JAlgoritmos.testPrimo(i));
		}

		int[] arreglo = new int[] { 2, 3, 5, 7, 9 };
		System.out.println(JAlgoritmos.testBusquedaSecuencial(arreglo, 7));
		System.out.println(JAlgoritmos.testBusquedaSecuencial(arreglo, 11));

		System.out.println(JAlgoritmos.testBusquedaBinaria(arreglo, 7));
		System.out.println(JAlgoritmos.testBusquedaBinaria(arreglo, 11));

		int[] arreglo2 = new int[] { 2, 7, 5, 9, 3 };
		System.out.println(Arrays.toString(arreglo2));
		JAlgoritmos.burbuja(arreglo2);
		System.out.println(Arrays.toString(arreglo2));
	}

	private static boolean isPar(int numero) {
		return numero % 2 == 0;
	}

	public static String testParImpar(int numero) {
		return (JAlgoritmos.isPar(numero)) ? "es par" : "no es par";
	}

	private static boolean isPrimo(int numero) {
		int x = 1;
		int contador = 0;
		while (x <= numero) {
			if (numero % x == 0)
				contador++;
			x++;
		}
		return contador == 2;
	}

	public static String testPrimo(int numero) {
		return (JAlgoritmos.isPrimo(numero)) ? "es primo" : "no es primo";
	}

	private static int busquedaSecuencial(int[] arreglo, int dato) {
		for (int i = 0; i < arreglo.length; i++)
			if (arreglo[i] == dato)
				return i;
		return -1;
	}

	public static String testBusquedaSecuencial(int[] arreglo, int dato) {
		return (JAlgoritmos.busquedaSecuencial(arreglo, dato) != -1) ? "encontrado" : "no encontrado";
	}

	private static int busquedaBinaria(int[] arreglo, int dato) {
		int n = arreglo.length;
		int centro, inf = 0, sup = n - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (arreglo[centro] == dato)
				return centro;
			else if (dato < arreglo[centro])
				sup = centro - 1;
			else
				inf = centro + 1;
		}
		return -1;
	}

	public static String testBusquedaBinaria(int[] arreglo, int dato) {
		return (JAlgoritmos.busquedaBinaria(arreglo, dato) != -1) ? "encontrado" : "no encontrado";
	}

	public static void burbuja(int[] arreglo) {
		int aux;
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 0; j < arreglo.length - i - 1; j++) {
				if (arreglo[j + 1] < arreglo[j]) {
					aux = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = aux;
				}
			}
		}
	}

}