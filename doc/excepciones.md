# Excepciones

* Representan condiciones excepcionales que el programador quiere tratar.
* La clase Exception extiende la clase Throwable.
* La clase Throwable provee características útiles para tratar con excepciones. Específicamente:
  * provee un slot para un mensaje.
  * contiene un stack trace.

## Manejo de errores en tiempo de ejecución

* Introducción de datos de formato incorrecto ->  **NumberFormatException**
* Archivo con información incorrecta -> **IOException**
* Índice matricial incorrecto -> **ArrayIndexOutOfBoundsException**
* null.método() -> **NullPointerException**
* Refundiciones incorrectas -> **ClassCastException**
* Usuarios esperan que el programa se comporte de forma sensata cuando se producen errores -> volver a un estado seguro.

![Ejemplos de Exceptions](img/ex-ejemplos.JPG)

## Clasificación de Excepciones

* **Exception**: se produce porque se ha cometido un error de programación. Recuperable.
* **Error**: describe errores internos y el agotamiento de recursos dentro del sistema de ejecución de Java (JVM). No se deben lanzar objetos de este tipo. No recuperable.

![Jerarquia Excepciones](img/ex-jerarquia.png)

* **Comprobadas**:
  * El compilador verifica que el programador proporcione, o bien, un manejador o que lance la excepción.
  * Ejemplos: IOException, FileNotFoundException, SQLException, etc.

* **No Comprobadas**:
  * Son las excepciones comunes, como por ejemplo, acceder a una referencia nula, que no se comprueban.
  * Ejemplos: Error y sus subclases (OutOfMemoryError, InternalError, etc.) y RuntimeException y sus subclases (NullPointerException, ArrayIndexOutOfBoundException, NumberFormatException, ClassCastException, ArithmeticException, etc.)

## Declaración

* Para crear excepciones propias generalmente se hace una subclase de Exception.

```java
package nombre_paquete;
{importaciones}
[modificadores] class NombreException extends Exception {
  ...
}
```

## ¿Cómo se causan excepciones?

* Implícitamente: el programa hace algo ilegal.
* Explícitamente: ejecución de la sentencia throw.

```java
public class SinNaftaException extends Exception { }

public class Auto {
  ...
  if (nafta < 0.1)
    throw new SinNaftaException();
  ...
}  
```

## ¿Cómo manejar una excepción?

```java
try {
  // Código que levanta una excepción
} catch (TipoExcepción nombre) {
  // Código que se ejecuta en caso de excepción
} finally {
  // Código que se ejecuta siempre (si se produce o no la exception)
}
```

## ¿Cómo manejar múltiples excepciones?

```java
try {
  // sentencias;
} catch (TipoExcepcion1 nombre) {
} catch (TipoExcepcion2 nombre) {
}
// En aumento a Exception (de lo particular a lo general); al revés no compila.
```

## Ejemplo

```java
// Declaración y cuerpo del método que lanza excepciones
public Object pop() throws SinElementosException {
  if (this.getElementos().isEmpty())
    throw new SinElementoException();
  return this.getElementos().removeLast();
}

// Uso del método
try {
  elemento = pila.pop();
} catch (SinElementosException sinElementoException) {
    sinElementoException.printStackTrace();
}
```

## Comportamiento de tipo reanudación

```java
Boolean continuar = Boolean.TRUE;
while (continuar) {
  try {
    System.out.print("Introduce un número entero: ");
    Scanner scanner = new Scanner(System.in);
    Integer numero = scanner.nextInt();
    scanner.close();
    System.out.println("El cuadrado de " + numero + " = " + (numero * numero));
    continuar = Boolean.FALSE;
  } catch (Exception e) {}
}
```

## Sobre el uso de excepciones

* Una condición de error es tratada sólo donde tiene sentido hacerlo y no en todo el nivel entre que ocurre y es tratada.
* El código puede ser escrito como si todas las operaciones funcionaran correctamente.
* Deben ser tratadas lo más específicamente posible.
* No se deben dejar vacíos o solo imprimiendo el stack trace los bloques catch.
* Stack Trace (Seguimiento de Pila): listado de todas las llamadas a métodos pendientes en un determinado momento de la ejecución de un programa.

## Ejercicios

1. Cree una clase con un método main() que genere un objeto de la clase Exception dentro de un bloque try. Proporcione al constructor de Exception un argumento String. Capture la excepción dentro de una cláusula catch e imprima el argumento String. Añada una cláusula finally e imprima un mensaje para demostrar que pasó por allí.

1. Defina una referencia a un objeto e inicializela a null. Trate de invocar un método a través de esta referencia. Ahora rodee el código con una cláusula try-catch para probar la nueva excepción.

1. Escriba código para generar y capturar una excepción ArrayIndexOutOfBoundsException (Índice de matriz fuera de límites).

1. Cree su propia clase de excepción utilizando la palabra clave extends. Escriba un constructor para dicha clase que tome un argumento String y lo almacene dentro del objeto como una referencia de tipo String. Escriba un método que muestre la cadena de caracteres almacenada. Cree una cláusula try-catch para probar la nueva excepción.

1. Defina un comportamiento de tipo reanudación utilizando un bucle while que se repita hasta que se deje de generar una excepción.

1. Un banco contiene las Cuentas de sus clientes. Las cuentas de ahorro no pueden tener números rojos. Las cuentas corrientes pueden tener una cuenta de ahorro asociada, de forma que si se intenta retirar más dinero del saldo actual, se debe retirar el dinero que falte de la cuenta de ahorro asociada.
    1. Define Cuenta de forma que no pueda instanciarse. De toda Cuenta se debe poder ingresar y retirar dinero, preguntar por el saldo, por el DNI del titular y debe tener un método toString de devuelva al menos el saldo y el DNI del titular.
    1. Implementa las clases CuentaCorriente y CuentaDeAhorro.
    1. Crea una especialización CuentaDeAhorroEsp de CuentaDeAhorro en la que se añade un entero penalización, de forma que se penaliza la retirada con una penalización % del dinero retirado. Sobrescribe sólo los métodos necesarios (incluyendo constructor y toString).
    1. Si el saldo de CuentaDeAhorro fuese a quedar negativo, antes de debe lanzar una excepción SaldoNegativo (que hereda de Exception).
    1. Implementa la clase Banco que contiene una colección de Cuentas, incluyendo el constructor que consideres más apropiado.
    1. Incluye el método totalSaldoMaxPenalización en la clase Banco que devuelva la suma de los saldos de todas las cuentas corrientes y la máxima penalización entre las CuentaDeAhorroEsp.
    1. Crea una clase con método main en la que instanciamos un Banco de 100 Cuentas, nos creamos una CuentaCorriente con 5000 pesos y una cuenta de ahorro especial con una penalización del 5%. Finalmente debe mostrar información de todas las Cuentas del Banco. En un bloque try & catch retirar dinero de una Cuenta de Ahorro.
