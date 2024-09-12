package polimorfismo;

public class JFigurasTest {

	public static void main(String[] args) {
		JFigura [] figuras = new JFigura[] {new JCuadrado(), 
				new JCirculo(10.0), 
				new JRectangulo(5.0, 10.0),
				new JCirculo(),
				new JCuadrado(5.0),
				new JRectangulo()};
		double acumuladorArea = 0;
		for (JFigura figura : figuras) {
			System.out.println(figura + " -> area: " + figura.area());
			acumuladorArea += figura.area();
		}
		System.out.println("\nDe un total de " + figuras.length + " figuras, el área total es de " + acumuladorArea);
	}

}