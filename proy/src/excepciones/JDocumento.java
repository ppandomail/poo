package excepciones;

public class JDocumento {
	
	private JTipoDocumento tipoDocumento;
	private Long numeroDocumento;
	
	public JDocumento(JTipoDocumento tipoDocumento, Long numeroDocumento) throws JFormatoNumeroDocumentoException {
		if (numeroDocumento == null) 
			throw new NullPointerException("Numero de Documento es obligatorio");
		if (!numeroDocumento.toString().matches(tipoDocumento.getPatronFormatoNumerico()))
			throw new JFormatoNumeroDocumentoException();
		this.setTipoDocumento(tipoDocumento);
		this.setNumeroDocumento(numeroDocumento);	
	}

	public JTipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	private void setTipoDocumento(JTipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Long getNumeroDocumento() {
		return this.numeroDocumento;
	}

	private void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}