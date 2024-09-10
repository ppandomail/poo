import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JColaPersonas {
	
	private ConcurrentLinkedQueue<JPersona> personas;
	
	public JColaPersonas() {
		this.setPersonas(new ConcurrentLinkedQueue<JPersona>());
	}

	public ConcurrentLinkedQueue<JPersona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(ConcurrentLinkedQueue<JPersona> personas) {
		this.personas = personas;
	}
	
	public void agregarPersona(JPersona persona) {
		this.getPersonas().offer(persona);
	}
	
	public HashMap<JTipoCola, ConcurrentLinkedQueue<JPersona>> getMapaEdad() {
		ConcurrentLinkedQueue<JPersona> colaAux = new ConcurrentLinkedQueue<JPersona>();
		HashMap<JTipoCola, ConcurrentLinkedQueue<JPersona>> mapa = new HashMap<JTipoCola, ConcurrentLinkedQueue<JPersona>>();
		ConcurrentLinkedQueue<JPersona> cola20 = new ConcurrentLinkedQueue<JPersona>();
		ConcurrentLinkedQueue<JPersona> cola30 = new ConcurrentLinkedQueue<JPersona>();
		ConcurrentLinkedQueue<JPersona> cola40 = new ConcurrentLinkedQueue<JPersona>();
		while(!this.getPersonas().isEmpty()) {
			JPersona persona = this.getPersonas().poll();
			if (persona.getEdad() >= 20 && persona.getEdad() < 30)
				cola20.offer(persona);
			if (persona.getEdad() >= 30 && persona.getEdad() < 40)
				cola30.offer(persona);
			if (persona.getEdad() >= 40 && persona.getEdad() < 50)
				cola40.offer(persona);
			colaAux.offer(persona);
		}
		while(!colaAux.isEmpty()) {
			this.getPersonas().offer(colaAux.poll());
		}
		mapa.put(JTipoCola.Cola20, cola20);
		mapa.put(JTipoCola.Cola30, cola30);
		mapa.put(JTipoCola.Cola40, cola40);
		return mapa;
	}
	
	public String toString() {
		String representacion = " | ";
		ConcurrentLinkedQueue<JPersona> colaAux = new ConcurrentLinkedQueue<JPersona>();
		while(!this.getPersonas().isEmpty()) {
			JPersona persona = this.getPersonas().poll();
			representacion += persona + " | ";
			colaAux.offer(persona);
		}
		while(!colaAux.isEmpty()) {
			this.getPersonas().offer(colaAux.poll());
		}
		return representacion;
	}
	
}