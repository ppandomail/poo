# UNIVERSIDAD NACIONAL DEL OESTE

## ESCUELA DE INFORMÁTICA

## PROGRAMACIÓN CON OBJETOS I

### Profesor: Mag. Ing. Pablo Pandolfo / Sr. Martin Ivaldi

---

### Examen Final diciembre 2022

* ALUMNO:  
* LU:
* CARRERA:

---

1. [1 punto] - Indíquese si el siguiente enunciado es verdadero o falso justificando la respuesta: "Un atributo de tipo enumerado que no es inicializado en la declaración ni en el constructor, toma como valor por defecto el primer valor del enumerado".

    * **Solución**
    * Falso. Un enum es un objeto, se inicializa por default en null.

1. [1 punto] - En la implementación de una clase, ¿puede un método de instancia llamar a un método de clase de la propia clase? ¿Y al revés? Justifica la respuesta.

    * **Solución**
    * Un método de instancia puede llamar a un método de clase. Un método de clase no puede llamar a un método de instancia (error de compilación)

1. [1 punto] - ¿Dos métodos declarados en la misma clase con el mismo nombre, la misma lista de parámetros y distinto valor de retorno están sobrecargados? Justifica la respuesta.

    * **Solución**
    * No están sobrecargados. Error de compilación (ambiguedad para el compilador).

1. [1 punto] - ¿Tiene sentido que una clase final declare algún método que sea abstracto? Justifica la respuesta.

    * **Solución**
    * No tiene sentido, una clase final no va a ser extendida por ninguna clase. Un método abstracto obliga a que la clase sea abstracta.

1. [1 punto] - ¿Qué habría que hacer para que el programa muestre el siguiente mensaje tras su ejecución: “Exception in thread "main" java.lang.AssertionError: programa incompleto"

    ```java
    public class Examen { public static void main(String[] args){} }
    ```

    * **Solución**
    * throw new AssertionError("programa incompleto"); o assert condicion : "programa incompleto";

1. [1 punto] - Indíquese si el siguiente enunciado es verdadero o falso, justificando la respuesta: "Sea la clase genérica Contenedor<T>, sobre las entidades de tipo genérico (tipo T) dentro del código de la clase Contenedor no es posible aplicarle ningún método".

    * **Solución**
    * Falso. Al atributo genérico se le pueden aplicar métodos.

1. [1 punto] - Sea la interfaz Dibujable, ¿puedo declarar y construir un array cuyo tipo sea el de la interfaz? Justifica la respuesta.

    ```java
    Dibujable[] array = new Dibujable[10];
    ```

    * **Solución**
    * Verdadero. Se define un arreglo de tamaño 10.

1. [1 punto] - ¿Cómo podemos recorrer la colección de valores de un Map? Ejemplifique.

    * **Solución**

    ```java
    // opc1
    Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();   
    while(itr.hasNext()) {
        Map.Entry<String, String> entry = itr.next();
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
    // opc2
    map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
    // opc3
    for (String key : map.keySet()) {
        String value = gfg.get(key);
        System.out.println("Key = " + key + ", Value = " + value);
    }
    // opc4
    for (Map.Entry<String,String> entry : map.entrySet()) 
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    ```

1. ¿Es correcto el siguiente código? Justifica la respuesta.

    ```java
    Object obj = 5;
    int i = (int)obj;
    ```

    * **Solución**
    * Es correcto. Autoboxing and unboxing.

1. [1 punto] - Dadas las excepciones Exc0 que hereda de Exception y Exc1 que hereda de Exc0 ¿Cuál es el resultado de la ejecución del siguiente código? Justifica la respuesta.

```java
public class Examen {
    public static void main (String[] args) {
        try { throw new Exc1(); } 
        catch (Exc0 e1) { System.out.println("Capturada Exc0"); }
        catch (Exception e2) { System.out.println("Capturada Exception"); } 
    }
}
```

* **Solución**
* "Capturada Exc0"

---
