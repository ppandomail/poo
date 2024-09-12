package excepciones;

public class JEjercicio1 {

	public static void main(String[] args) {
		try {
			throw new Exception("Exception de ejemplo");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Paso por aquí");
		}
	}

}