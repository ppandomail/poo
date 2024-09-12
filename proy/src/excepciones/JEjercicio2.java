package excepciones;

public class JEjercicio2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String msg = null;
			msg.charAt(0);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
}