import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class UsoAnnotation {

	public static void main(String[] args) {
		
		Bug anotacion = AccesibilidadWeb.class.getAnnotation(Bug.class);
		
		Annotation [] anot = AccesibilidadWeb.class.getAnnotations();
		Constructor<?> [] cons = AccesibilidadWeb.class.getConstructors();
		
		System.out.println(anot.length);
		
		for (Annotation a : anot)
			System.out.println(a.toString());
		
		for (Constructor<?> c : cons) {
			for (Annotation a : c.getAnnotations())
				System.out.println(a.toString());
		}
		
		if (anotacion != null) {
		  System.out.println(anotacion.numero());
		  System.out.println(anotacion.descripcion());
		  System.out.println(anotacion.tester());
		}
	}

}
