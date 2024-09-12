package excepciones;

public class JDemoExcepciones {

	public static void main(String[] args) {
		try {
			JDocumento doc1 = new JDocumento(JTipoDocumento.DNI, 24862699L);
			System.out.println(doc1.getNumeroDocumento());
			JDocumento doc2 = new JDocumento(JTipoDocumento.DNI, 123456789L);
			System.out.println(doc2.getNumeroDocumento());
		} catch (JFormatoNumeroDocumentoException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
		}
	}

}
