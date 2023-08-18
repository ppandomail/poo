package excepciones;

public class FormatoNumeroDocumentoException extends Exception {
	
	private static final long serialVersionUID = -7604086288207236282L;

	public FormatoNumeroDocumentoException() {
		super("El numero de documento no responde al formato correcto");
	}

}