package excepciones;

public class JFormatoNumeroDocumentoException extends Exception {
	
	private static final long serialVersionUID = -7604086288207236282L;

	public JFormatoNumeroDocumentoException() {
		super("El numero de documento no responde al formato correcto");
	}

}