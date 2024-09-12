package colecciones;
public class JTeletipoTest {

	public static void main(String[] args) {
		JTeletipo teletipo1 = new JTeletipo("abc/d//e*");
		System.out.println("Tira resultante: " + teletipo1.ejecutar());
		
		JTeletipo teletipo2 = new JTeletipo("ab&c/d//e*");
		System.out.println("Tira resultante: " + teletipo2.ejecutar());
		
		JTeletipo teletipo3 = new JTeletipo("abcde*");
		System.out.println("Tira resultante: " + teletipo3.ejecutar());
		
		JTeletipo teletipo4 = new JTeletipo("h/o/l/AM/unD/o*");
		System.out.println("Tira resultante: " + teletipo4.ejecutar());
	}

}