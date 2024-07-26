# Genericidad

* Consiste en escribir código con **variables de tipos (TV)** que se puede reutilizar para objetos de muy distintos tipos

## Convención de nombres de las variables de tipos

| Nombre | Descripción | Ejemplo |
| -- | -- | -- |
| **E**       | Tipo de elemento de las colecciones | ArrayList\<E> |
| **K**       | Tipo de clave                       | Hashtable<K,V> |
| **V**       | Valor de las tablas                 | Dictionary<K,V> |
| **T, U, V** | Absolutamente cualquier tipo        | Comparable\<T> |

## Genérico con Método/Función

=== "java"

  ```java
  // se puede definir métodos genéricos con variables de tipos sin que la clase sea genérica
  public class Colecciones {

    public static <T> T getPrimero(T[] items) {
      if (items == null) return null;
      if (items.length == 0) return null;
      return items[0];
    }

  }

  // uso
  String [] letras = {"a", "b", "c"};
  Integer [] nros  = {1, 2, 3};
  String  priL = Colecciones.getPrimero(letras); // "a"
  Integer priN = Colecciones.getPrimero(nros);   // 1
  ```

=== "python"

  ```py
  from typing import TypeVar, List

  T = TypeVar('T')

  def get_primero(items: List[T]) -> T:
    return items[0]

  # uso
  print(get_primero(['a', 'b', 'c'])) # 'a'
  print(get_primero([1, 2, 3]))       # 1
  ```

## Genérico con diferentes tipos de datos

=== "java"

  ```java
  
  public class Utils {

    public static <T, U> String combinar(T a, U b) {
      if (a == null || b == null) return null;
      return a.toString() + b.toString();
    }

  }

  // uso
  System.out.println(Utils.combinar(10, 20));        // "1020"
  System.out.println(Utils.combinar("Oi", 9111975)); // "Oi9111975"
  ```

=== "python"

  ```py
  from typing import TypeVar

  T = TypeVar('T')
  U = TypeVar('U')

  def combinar(a: T, b: U) -> str:
    return str(a) + str(b)

  # uso
  print(combinar(10, 20))         # "1020"   
  print(combinar('Oi', 9111975))  # "Oi9111975"
  ```

## Genérico con clase

=== "java"

  ```java
  public class Contenedor <T> {

    private T contenido;
  
    public Contenido(T contenido) {
      this.contenido = contenido;
    }
    
    public T getContenido() {
      return this.contenido; 
    }

  }

  // uso
  Contenedor<Integer> cInt = new Contenedor(10);
  Contenedor<String> cStr = new Contenedor("Oi");
  System.out.println(cInt.getContenido());  // 10
  System.out.println(cStr.getContenido());  // "Oi"
  ```

=== "python"

  ```py
  from typing import TypeVar, Generic

  T = TypeVar(Generic[T])

  class Contenedor:

      def __init__(self, contenido: T):
          self.contenido = contenido
      
      def get_contenido(self) -> T:
          return self.contenido

  # uso
  c_int = Contenedor(10)
  c_str = Contenedor('Oi')

  print(c_int.get_contenido()) # 10 
  print(c_str.get_contenido()) # 'Oi' 
  ```

## Límites y restricciones para las TV en Java

| Límite | Ejemplo |
| -- | -- |
| Restringir la TV a una clase que implemente una interface o subclase | `public static <T extends Comparable<T>> T minimo(T[] arreglo) {}` |
| Las TVs pueden tener múltiples límites | `<T extends Comparable<T> & Serializable>` |

| Restricción: No es posible... | Ejemplo |
| -- | -- |
| Reemplazar una TV por un primitivo             | `T a = 0;` |
| Lanzar ni capturar objetos de clases genéricas | `throw new A<String>()` |
| Que una clase genérica extienda a Throwable    | `public class A <T> extends Throwable` |
| Declarar arreglos de tipos parametrizados      | `Pareja\<String> [] v = new Pareja\<String>(10);` |
| Crear objetos de TV                            | `new T();` |
| Hacer referencias a TVs en atributos o métodos estáticos | `private static T ejemplarUnico;` |

## Ejercicios

1. Escribir una clase Pila genérica usando para ello un atributo del tipo LinkedList. La clase Pila tendrá los siguientes métodos:
    * isVacia(): devuelve true si la pila está vacía y false en caso contrario.
    * desapilar(): elimina el primer elemento de la colección.
    * ver(): devuelve el primer elemento de la colección.
    * apilar(): agrega un objeto por el extremo que corresponda.
    * toString(): devuelve en forma de String la información de la colección.

1. Implementar una pila utilizando como atributos un array genérico y un entero que cuente el número de objetos insertados. La clase se debe llamar PilaArray y tiene los mismos métodos que la pila del ejercicio anterior.

1. Escribir una clase Matriz genérica con el siguiente comportamiento:
    * constructor que recibe por parámetro el número de filas y columnas de la matriz.
    * set() recibe por parámetro la fila, la columna y el elemento a insertar. El elemento es de tipo genérico. Este método inserta el elemento en la posición indicada.
    * get() recibe por parámetro la fila y la columna. Devuelve el elemento en esa posición. El elemento devuelto es genérico.
    * columnas() devuelve el número de columnas de la matriz.
    * filas() devuelve el número de filas de las matriz.
    * toString() devuelve en forma de String la información de la matriz.

1. Escribir una clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable. La clase debe tener lo siguiente:
    * Un constructor
    * void add(E o)
    * E get(int index)
    * int size()
    * boolean isEmpty()
    * boolean remove(E o)
    * int indexOf(E o)
    * String toString()

1. Escribir una interface genérica Operable, que sea genérica y que declare las cuatro operaciones básicas: suma, resta, producto y división.
