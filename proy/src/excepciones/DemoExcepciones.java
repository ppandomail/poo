public class DemoExcepciones {

	public static void main(String[] args) {
		try {
			Documento doc1 = new Documento(TipoDocumento.DNI, 24862699L);
			System.out.println(doc1.getNumeroDocumento());
			Documento doc2 = new Documento(TipoDocumento.DNI, 123456789L);
			System.out.println(doc2.getNumeroDocumento());
		} catch (FormatoNumeroDocumentoException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
		}
	}

}
