package herencia;

public class DemoPuntos {

	public static void main(String[] args) {
		JPunto3D p3D1 = new JPunto3D();
		JPunto3D p3D2 = new JPunto3D(1.0, 2.0, 3.0);
		JPunto3D p3D3 = new JPunto3D(9.9);
		JPunto p2D1 = new JPunto(2.0, 3.0);
		
		System.out.println(p3D1.getX()); //0.0
		System.out.println(p3D1.calcularDistancia(p3D1)); //0.0
		System.out.println(p3D1.calcularDistancia(p2D1)); //0.0
		System.out.println(p3D1.calcularDistancia(p3D2)); //3.74
		
		JPunto [] vector = new JPunto[] {p3D1, p2D1, p3D2, p3D3, new JPunto(), new JPunto(3.14)};
		for (JPunto p : vector) 
			System.out.println(p);
	}

}