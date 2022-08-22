# Introducción al Lenguaje Java

## Razones para aprender Java

1. Usado por diferentes empresas y gobiernos. Ej. Facebook, Amazon, Gobiernos de Países.
1. Funciona en casi todo tipos de dispositivos. Ej. Smartphones, SmartTV, Web, Desktop
1. Cuenta con una gran comunidad de más de 20 años.
1. Altamente demandado en el mercado tecnológico.

## Aspectos de Java

* **Plataforma**: es un ambiente de software y/o hardware sobre el que se ejecuta un programa.
  * Enorme biblioteca.
  * Código reutilizable.
  * Entorno de ejecución: seguridad, adaptabilidad, Garbage Collector.

![Plataforma](img/plataforma.png)

![Funcionamiento](img/funcionamiento.png)

* **Lenguaje**: posibilita el desarrollo de aplicaciones seguras, robustas sobre múltiples plataformas en redes heterogéneas y distribuidas.
  * Sintaxis agradable.
  * Semántica comprensible.

## Características de Java

### Simple y Familiar

* El objetivo de los diseñadores de Java fue crear un lenguaje de programación que fuera fácil de aprender. Java adoptó una sintaxis similar a la de C/C++ teniendo en cuenta su popularidad. Y eliminó aquellas características que son fuente de confusión.
* Características de C/C++ eliminadas en Java: Preprocesador,  estructuras de datos,  uniones, herencia múltiple de clases,  GOTO,  punteros.

### Orientado a Objetos

* Java posee todas las características de un lenguaje orientado a objetos: Polimorfismo, Encapsulamiento y Herencia.
* Java implementa herencia simple de clases. Una clase puede ser subclase de una única clase. Todas las clases heredan de la clase Object. (Todo es un objeto)
* Java enriquece el modelo de herencia simple de clases, implementando interfaces.

### Distribuido

* Con Java es posible usar protocolos como HTTP y FTP para leer o copiar archivos remotos de manera tan simple como si estuviesen en el File System local.
* El comportamiento distribuido de Java posibilita la colaboración y la distribución de carga de trabajo del sistema.

### Seguro

* En Java el modelo de alocación de memoria es transparente al programador, ya que es controlado íntegramente por JVM.
* El intérprete Java chequea los archivos “.class“ que vienen de la red, evaluando que el código no falsifique punteros,  no viole restricciones de acceso, no viole el acceso a los objetos usando casting.

### Arquitectura neutral

* Java fue diseñado para soportar aplicaciones que se ejecutan en ambientes de redes heterogéneos, independientemente de la plataforma de hardware y del sistema operativo.

* La arquitectura neutral dada por los ByteCodes es el paso más importante hacia la portabilidad de los programas.

### Multithreaded

* Un Thread es un flujo de control secuencial dentro de un programa. Java provee múltiples threads en un programa, ejecutándose concurrentemente y llevando a cabo tareas distintas.
* La API Java contiene primitivas de sincronización.
* Los múltiples hilos (threads) de ejecución permiten mejorar la interactividad y la performance del sistema. (Mejor respuesta interactiva y comportamiento de tiempo real)

### Interpretado y dinámico

* El compilador Java genera ByteCodes para la JVM. El intérprete, incorporado en la JVM es el que permite ejecutar el programa.
* Los ByteCodes de Java pueden ejecutarse en cualquier plataforma que tenga la JVM implementada.
* Java es dinámicamente extensible ya que las clases se linkean a medida que se necesitan y pueden ser cargadas dinámicamente a través de la red.

## IDE

* Es una aplicación que provee un entorno de desarrollo de software con diversas herramientas integradas:
  * editor de código con resaltador de sintaxis.
  * compilador.
  * depurador.
  * terminal.
  * control de versiones.
  * etc.

* IDEs:
  * Eclipse
  * IntelliJ
  * NetBeans
  * BlueJ
  * Visual Studio

## Eclipse

* Es un IDE abierto y extensible (plugins)
* En 2001 IBM y Borland crearon la Fundación Eclipse
* [Sitio web](www.eclipse.org)

![Atajos del Eclipse](img/eclipse.png)

## Hola Mundo

* Edición:

  ```java
  public class HolaMundo {
    public static void main(String[] args){
      System.out.println("Hola Mundo");
    }
  }
  ```

* Compilación:

  ```sh
  $javac HolaMundo.java
  ```

* Ejecución:

  ```sh
  $java HolaMundo
  ```

## Tipos de datos

* Java es un lenguaje estáticamente tipado, por lo tanto, requiere declarar las variables con su tipo de datos.
* Primitivos:
  * Numéricos enteros: byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes)
  * Numéricos reales: float (4 bytes), double (8 bytes)
  * Lógico: boolean (1 byte)
  * Carácter: char (2 bytes)
* Objetos (Clases, Interfaces, Enums)

* Para los tipos primitivos existen clases “wrappers”:
  * byte       Byte
  * short      Short
  * int        Integer
  * long       Long
  * float      Float
  * double     Double
  * boolean    Boolean
  * char       Character

## Clase String

* Es una secuencia de caracteres.
* No es un tipo primitivo.
* Los String son instancias de la clase java.lang.String.
* El compilador trata a los String como si fuesen tipos del lenguaje.
* La clase tiene varios métodos para trabajar con ellos.
* Son inmutables.

  ```java
  String saludo = “Hola”;
  String otroSaludo = new String(“Como andás?”);

  saludo.length();
  saludo.charAt(0);
  saludo.substring(0,2);
  saludo.compareTo(“adios”);
  saludo.equals(“Hol”);
  saludo.split(“o”);
  saludo.trim();
  saludo.indexOf(“a”);
  saludo.indexOf(“a”, 2);
  saludo.toLowerCase();
  saludo.toUpperCase();
  saludo.equalsIgnoreCase(“h”);
  saludo.endsWith(“la”);
  ```

## Operadores

* Asignación:   Ejemplos: i = i + 1;  j += k;
* Relacionales: Ejemplos: 2 >= p;     a == 5;       b !=  8;
* Aritméticos:  Ejemplos: i + 4 * f;  j – (8 / b);  cant % 4;
* Lógicos:      Ejemplos: a && b;     d || c;     !a;
* Condicional:  Ejemplo:  (x<y)? x : y;
* Otros:        Ejemplos: []    .   ()    (refundición)    new     instanceof

## Arreglos

* Todo arreglo es de un tipo o una clase.
* Se los instancia con el operador new
* Son “zero-based”

  ```java
  char[] caracteres;
  String[] palabras = new String[10];
  float[] arreglo = {2, 4, 6};
  int[][] matriz = {{1, 7}, {3, 4}};
  caracteres = new char[]{‘a’, ‘1’};
  palabras[2] = “chango”;
  ```

* Operaciones con arreglos: es necesario importar la clase java.util.Arrays.

  ```java
  int [] arreglo = new int [10000];
  …
  Arrays.sort(arreglo); 
  Arrays.binarySearch(arreglo, 3);
  Arrays.fill(arreglo, 3);
  ```

## Estructuras de control

* if

  ```java
  if (condición)
    sentencias;
  ```

* if else

  ```java
  if (condición)
    sentencias;
  else
    sentencias;
  ```

* switch

  ```java
  switch (i) {
    case 1:{sentencias; break; }
    case 2:{sentencias; break; }
    case 3:{sentencias; break; }
    [default: sentencias;]
  }
  ```

* while

  ```java
  while (condición)
    sentencias;
  ```

* for

  ```java
  for (int i=0; i < 8; i++)
    sentencias;

  for (tipo elemento: colección) 
    sentencias; // por c/ elemento
  ```

## Comentarios

* No aparecen en el programa ejecutable.
* Existen tres tipos:
  * Por línea: //
  * Bloque de código: /**/
  * JavaDoc: /**  */   Genera automáticamente la documentación a través de marcadores: @param, @return, @throws, @author, @version

  ```java
      /**
      * Returns the absolute value of a {@code long} value.
      * If the argument is not negative, the argument is returned.
      * If the argument is negative, the negation of the argument is returned.
      *
      * <p>Note that if the argument is equal to the value of
      * {@link Long#MIN_VALUE}, the most negative representable
      * {@code long} value, the result is that same value, which
      * is negative.
      *
      * @param   a   the argument whose absolute value is to be determined
      * @return  the absolute value of the argument.
      */
      public static long abs(long a) {
          return (a < 0) ? -a : a;
      }
  ```

## Entrada de datos por teclado

  ```java
  Scanner in = new Scanner(System.in);
  in.nextLine();       // lee una línea de entrada
  in.next();           // lee una sola palabra
  in.nextInt();        // lee un entero
  in.nextDouble();     // lee número de coma flotante
  in.hasNext();        // si hay o no otra palabra
  in.hasNextInt();     // si hay o no otro entero
  in.hasNextDouble();  // si hay o no otro número de coma flotante
  ```

## Salida de datos a consola

  ```java
  System.out.print(“Hola mundo”);
  System.out.println(“Hola mundo”);

  Double x = 10000.0/3.0;
  System.out.println(x);          // 3333.3333333
  System.out.printf(“%8.2f”, x);  // 3333.33
  System.out.printf(“%,.2f”, x);  // 3,333.33

  String.format(“Hola, %s. El año que viene tendrás %d”, nombre, edad);
  ```

## Ejercicios

1. FizzBuzz: Imprimir por pantalla los números del 1 al 100 pero considerando lo siguiente: a) Si el número es divisible por 3 se debe imprimir “Fizz”. b) Si el número es divisible por 5 se debe imprimir “Buzz”. c) Si el número es divisible por 3 y por 5 se debe imprimir “FizzBuzz”.
1. Sumados: Sumar los 1000 primeros números naturales (1 + 2 + 3 + 4 + … + 1000), imprimiendo por cada suma el resultado parcial obtenido.
1. Intercambiar el valor de dos variables de tipo entero sin utilizar una tercera variable.
1. Invertir un string, sin usar la biblioteca que lo haga automáticamente.
1. Encriptar un mensaje usando el método de "la cifra del césar", que consiste en correr cada letra -considerando la posición de cada una en el alfabeto- una determinada cantidad de lugares. Ejemplo: si el corrimiento es de 2 lugares, la palabra "HOLA" se transforma en "JQNC". Si el alfabeto termina antes de poder correr la cantidad de lugares  necesarios, se vuelve a comenzar desde la letra "a".
1. Determinar si un número es par o no.
1. Implementar en Java el algoritmo de búsqueda secuencial y binaria.
