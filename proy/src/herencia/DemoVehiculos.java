package herencia;

public class DemoVehiculos {

	public static void main(String[] args) {
		JPersona persona1 = new JPersona(001, "A", "A");
		JPersona persona2 = new JPersona(010, "B", "B");
		JPersona persona3 = new JPersona(110, "C", "C");
		JPersona persona4 = new JPersona(100, "D", "D");
		JPersona persona5 = new JPersona(101, "E", "E");
		
		JMotocicleta motocicleta1 = new JMotocicleta(persona1, 1000);
		JMotocicleta motocicleta2 = new JMotocicleta(persona2, 2000, persona3);
		
		JAutobus autobus1 = new JAutobus(persona1, 3000);
		JAutobus autobus2 = new JAutobus(persona2, 4000);
		autobus2.agregarPasajero(persona2);
		autobus2.agregarPasajero(persona3);
		autobus2.agregarPasajero(persona4);
		autobus2.agregarPasajero(persona5);
		
		JVehiculo [] vehiculos = new JVehiculo[] {motocicleta1, motocicleta2, autobus1, autobus2};
		for (JVehiculo vehiculo : vehiculos) {
			vehiculo.setChofer(new JPersona(999));
			System.out.println(vehiculo);
		}
			
	}

}