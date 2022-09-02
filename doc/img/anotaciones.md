# Anotaciones

* Son marcadores que se insertan en el código fuente para procesarlas empleando ciertas herramientas.
* Se pueden procesar los marcadores en el nivel de código fuente, pero el compilador también puede insertarlos en archivos de clases. @Retention(RetentionPolicy.RUNTIME).

## Declaración de Anotación

```java
[modificadores] @interface NombreAnotacion {
  // declaraciones de elementos
}
```

* Las anotaciones se definen mediante una interface de anotación.
* Todas las interfaces de anotación extienden implícitamente la interface java.lang.annotation.Annotation.
* No es posible extender las interfaces de anotación.
* Los métodos no pueden tener parámetros ni cláusulas throws, tampoco ser genéricos.

## Declaración de elementos

* Las declaraciones de los elementos tienen la forma:
  * tipo nombreElemento();
  * tipo nombreElemento() default  valor_predeterminado;
* El tipo puede ser: Primitivos, String, Class, Enum, Annotation, [] de anteriores
* Ejemplo:

```java
public @interface NotificacionError {
  String asignadoA() default "[none]";
  int severidad() default 0;
}
```

## Formato de las anotaciones

```java
@NotificacionError(severidad=10, asignadoA="Harry")
@NotificacionError(severidad=10)
@NotificacionError
```

## Metaanotaciones (aplicables a anotaciones)

* **@Target**: restringe los elementos a los que se puede aplicar la anotación.
  * @Target(ElementType.PACKAGE)
  * @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
  * Las anotaciones que no tienen una restricción @Target se pueden aplicar a cualquier elemento.

* **@Retention**: inclusión de anotaciones
  * @Retention(RetentionPolicy.SOURCE)  No se incluyen en .class
  * @Retention(RetentionPolicy.CLASS)   Se incluyen en .class, JVM no las carga.
  * @Retention(RetentionPolicy.RUNTIME) Se incluyen en .class, JVM las carga.

## Ejemplo

1. Crear la anotación

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Anotacion {
  int elemento1();
  String elemento2();
}
```

1. Usar la anotación

```java
@Anotacion(elemento1=999, elemento2="Prueba")
public class Clase {
  ...
}
```

1. Procesar la anotación

```java
Anotacion anotacion = (Anotacion) Clase.class.getAnnotation(Anotacion.class);
if (anotacion != null) {
  System.out.println(anotacion.elemento1());
  System.out.println(anotacion.elemento2());
}
```
