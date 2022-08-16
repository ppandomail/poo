# Componentes del Lenguaje Java

* Java es un lenguaje estáticamente tipado, por lo tanto, requiere declarar las variables con su tipo de datos.

## Tipos de datos

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

1. Intercambiar el valor de dos variables de tipo entero sin utilizar una tercera variable.
1. Invertir un string, sin usar la biblioteca que lo haga automáticamente.
1. Encriptar un mensaje usando el método de "la cifra del césar", que consiste en correr cada letra -considerando la posición de cada una en el alfabeto- una determinada cantidad de lugares. Ejemplo: si el corrimiento es de 2 lugares, la palabra "HOLA" se transforma en "JQNC". Si el alfabeto termina antes de poder correr la cantidad de lugares  necesarios, se vuelve a comenzar desde la letra "a".
1. Determinar si un número es par o no.
1. Implementar en Java el algoritmo de búsqueda secuencial y binaria.
