public class JClave {
	
	private static JClave clave; 
	private JCromosomaTP cromosomaTP;
	
	private JClave(String representacionHexadecimal) {
		this.setCromosomaTP(new JCromosomaTP(representacionHexadecimal, 0));
	}
	
	public static JClave getClave() {
		return clave;
	}

	public static void setClave(String representacionHexadecimal) {
		JClave.clave = new JClave(representacionHexadecimal);;
	}

	public JCromosomaTP getCromosomaTP() {
		return cromosomaTP;
	}

	public void setCromosomaTP(JCromosomaTP cromosomaTP) {
		this.cromosomaTP = cromosomaTP;
	}

}