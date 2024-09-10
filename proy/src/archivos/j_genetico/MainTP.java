public class MainTP {

	public static void main(String[] args) {
		JClave.setClave("FA");
		
		JCromosomaTP cromosoma1 = new JCromosomaTP("A1");
		JCromosomaTP cromosoma2 = new JCromosomaTP("FA");
		System.out.println(cromosoma1);
		System.out.println(cromosoma2);
		cromosoma1.mutar();
		System.out.println(cromosoma1);
		cromosoma2.mutar();
		System.out.println(cromosoma2);
	}

}