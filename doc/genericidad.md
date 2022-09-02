# Genericidad

* Consiste en escribir código que se puede reutilizar para objetos de muy distintos tipos.
* Antes de JDK 5.0, la programación genérica en Java siempre se realizaba por herencia (Object). * Problemas: Se necesita una refundición siempre que se recupera un valor y no hay comprobación de errores. Un error de compilación es mucho mejor que una excepción de refundición (ClassCastException) durante la ejecución.
* JDK 5.0 ofrece una solución mejor: los parámetros de tipo.
* Ventajas: programas fáciles de leer y seguros (no se necesita refundir).
* Desventajas: no es tan fácil implementarlas.

## Convención de nombres de las variables de tipos

| Nombre | Descripción | Ejemplo |
| -- | -- | -- |
| E | Tipo de elemento de las colecciones | ArrayList\<E> |
| K | Tipo de clave | Hashtable<K,V> |
| V | Valor de las tablas | Dictionary<K,V> |
| T, U, V | Absolutamente cualquier tipo | Comparable\<T> |

## Clase genérica

* Es una clase que tiene una o más variables de tipo.

```java
public class Pareja <T> {
  private T primero;
  private T segundo;
  public Pareja() {
    this(null, null); 
  }
  public Pareja(T primero, T segundo) {
    this.primero = primero; 
    this.segundo = segundo;
  }
  public T getPrimero() {
    return this.primero; 
  }
  public T getSegundo() {
    return this.segundo; 
  }
}
```

* Los tipos genéricos se particularizan reemplazando las variables de tipo por tipos:

```java
Pareja<String> pareja1 = new Pareja<String>();
Pareja<String> pareja2 = new Pareja<String>("1", "2");
Pareja<Integer> pareja3 = new Pareja<Integer>(3, 4);
Pareja<Double> pareja4 = new Pareja<Double>(5.0, 6.0);
Pareja<Comprobante> pareja5 = new Pareja<Comprobante>(new RLIQ(), new OPPRE());
Pareja<LinkedList<Integer>> pareja6 = new Pareja<LinkedList<Integer>> (new LinkedList<Integer>(), new LinkedList<Integer>());
```

## Método genérico

* Se puede definir métodos genéricos con parámetros de tipo sin que la clase sea genérica.

```java
public class ManejoColecciones {

  public static <T> T getMitad(T[] arreglo) {
    if (arreglo == null) return null;
    if (arreglo.length == 0) return null;
    return arreglo[(int) (arreglo.length/2)];
  }

}
```

```java
String [] vocales = {"a", "e", "i"};
String mitad = ManejoColecciones.<String>getMitad(vocales);
```

## Límites para las variables de tipo

* Restringir la variable de tipo a una clase que implemente una interface o subclase:

```java
public static <T extends Comparable<T>> T minimo(T[] arreglo) {
  ...
}
```

* Las variables de tipo pueden tener múltiples límites:

```java
<T extends Comparable<T> & Serializable>
```

## Restricciones para las variables de tipo

* No es posible reemplazar un parámetro de tipo por un tipo primitivo.
* No es posible lanzar ni capturar objetos de clases genéricas.
* No se permite que una clase genérica extienda a Throwable.
* No es posible declarar vectores de tipos parametrizados.
  * Ejemplo: Pareja\<String> [] v = new Pareja\<String>(10);
* No se pueden crear objetos de tipos genéricos.
  * Ejemplo: new T();
* No es posible hacer referencias a variables de tipo en atributos o métodos estáticos.
  * Ejemplo: private static T ejemplarUnico;
