package anotaciones;

import java.lang.reflect.Method;

public class JAnnotationTest {

  public static void main(String[] args) {
    Method[] metodos = JPersona.class.getMethods();
    for (Method m : metodos)
      System.out.println(m.getName() + "->" + m.getDeclaredAnnotations().length);
  }

}
