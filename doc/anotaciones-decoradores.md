# Anotaciones en Java y Decoradores en Python

## Anotaciones en Java

* Son marcadores que se insertan en el código fuente para procesarlas empleando ciertas herramientas

### Declaración

```java
// extienden implícitamente la interface java.lang.annotation.Annotation
public @interface NotificacionError {
  // declaraciones de elementos
  // tipos: primitivos, String, class, enum, annotation, [] de anteriores
  String asignadoA() default "[none]";
  int severidad() default 0;
}

// uso
@NotificacionError(severidad=10, asignadoA="Harry")
@NotificacionError(severidad=10)
@NotificacionError
```

### Metaanotaciones

| Metaanotación |  | Ejemplo 1 | Ejemplo 2 | Ejemplo 3 |
| -- | -- | -- | -- | -- |
| **@Target** | restringe los elementos a los que se puede aplicar la anotación | @Target(ElementType.PACKAGE) | @Target({ElementType.METHOD, ElementType.CONSTRUCTOR}) | |
| **@Retention** | inclusión de anotaciones | @Retention(RetentionPolicy.SOURCE) | @Retention(RetentionPolicy.CLASS)  | @Retention(RetentionPolicy.RUNTIME) |

### Ejemplo

Ejemplo

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

## Decoradores en Python

* Permiten encapsular otra función para extender el comportamiento de la función encapsulada
* Es una función de orden superior que toma otra función como argumento, agrega alguna funcionalidad y devuelve una nueva función. Permite modificar o ampliar el comportamiento de funciones o métodos

### Ejemplo 1 - Sin parámetros

```py
# funcion decorador que recibe como parámetro una función sin parámetros
def entra_sale(f):

  # función interna
  def fi():
    print('->')
    f()
    print('<-')

  return fi

@entra_sale
def sumar():
  print(1 + 2)

sumar()
```

### Ejemplo 2 - Con parámetros

```py
def entra_sale(f):

  def fi(*args):
    print('->')
    f(*args)
    print('<-')

  return fi

@entra_sale
def sumar(n1, n2):
  print(n1 + n2)

sumar(1, 2)
```

### Ejemplo 3 - Con retorno

```py
def entra_sale(f):

  def fi(*args):
    print('->')
    v = f(*args)
    print('<-')
    return v

  return fi

@entra_sale
def sumar(n1, n2):
  return n1 + n2

print(sumar(1, 2))
```

### Ejemplo 4 - Encadenamiento de decoradores

```py
def decor1(func): 
  def inner(): 
    x = func() 
    return x * x 
  return inner 

def decor(func): 
  def inner(): 
    x = func() 
    return 2 * x 
  return inner 

@decor1
@decor
def num(): 
  return 10

@decor
@decor1
def num2():
  return 10
  
print(num())   # similar a decor1(decor(num))
print(num2())  # similar a decor(deco1(num2))
```

### Ejemplo 5

```py
import time
import math

# decorador que calcula duración
def calculate_time(func):
    
  def inner1(*args, **kwargs):
      begin = time.time()
      func(*args, **kwargs)
      end = time.time()
      print("Tiempo total en : ", func.__name__, end - begin)

  return inner1

@calculate_time
def factorial(num):
    time.sleep(2)
    print(math.factorial(num))

factorial(10)
```
