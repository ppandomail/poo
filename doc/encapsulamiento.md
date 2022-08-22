# Encapsulamiento

## Paquete

* Es un conjunto de artefactos java relacionados de acuerdo a su función que proveen acceso protegido y administración de nombres.
* Ejemplo de paquetes que son parte del lenguaje:
  * java.lang: clases del lenguaje. Se importa por defecto.
  * java.io: para manejo de Entrada/Salida.
* El programador agrupa sus artefactos en paquetes, anteponiendo la cláusula **package** nombrepaquete; a las declaraciones de todos los artefactos agrupados.
* Se recomienda utilizar el nombre de dominio de Internet al revés. Ejemplo: ar.edu.uno.poo.xxx
* El alcance de un identificador de artefacto es todo el paquete en donde se declara el artefacto, por lo tanto no puede haber dos artefactos con el mismo nombre dentro de un mismo paquete.

### Accesos estáticos

* Permiten llamar a un método o propiedad estática sin necesidad de hacer referencia al nombre de su clase.
* La sintaxis general, es:
  * Para un sólo método o propiedad:

    ```java
    import static paquete.Clase.metodo_o_propiedad_static;
    ````

  * Para todos los elementos estáticos de la clase:

    ```java
    import static paquete.Clase.*; 
    ```

* Ejemplo:

    ```java
    import static java.lang.System.*;
    out.println(“Hola”);  
    exit(0);
    ```

## Clase

* Cada clase, excepto la clase Object, es una extensión (subclase), de una sola clase ya existente (herencia simple).
* En Java, una clase se compone de:
  * Declaración.
  * Cuerpo.
* Ejemplo:

```java
[package nombre_paquete;]
{import nombre_paquete.[* | artefacto];}
[modificadores_clase] class NombreClase [extends NombreSuperClase][implements {NombreInterface}] {
  // Cuerpo de la clase
  // Atributos (datos)
  {[accesibilidad] [modificadores_atributo] tipo nombreAtributo [= valor];}
  // Constructores: inicializan los atributos del objeto
  {[accesibilidad] NombreClase([parámetros]) [throws NombreExceptions] {
    // Cuerpo del constructor
  }}
  // Métodos (comportamiento)
  {[accesibilidad] [modificadores_método] tipoRetorno nombreMetodo([parametros]) [throws NombreExceptions]{
    // Cuerpo del método
  }}
  
}
```

* Si una clase no declara explícitamente su superclase, entonces se asume que extiende a la clase Object

### Modificadores de la Clase

* **public**: clases que son accedidas por todos.
* **package**: clases que son accedidas dentro el paquete donde fueron declaradas.
* **abstract**: clases que no se pueden instanciar. Ejemplo Number. Toda clase que tenga 1 o más métodos abstractos tiene que declararse abstracta a su vez. Puede tener atributos y métodos concretos.
* **final**: clases que no se pueden extender.  Ejemplo String. Todos los métodos de una clase final son final automáticamente NO así los atributos.

* Son opcionales. Se pueden combinar, salvo **abstract** y **final**.

  ```java
  public class MesaAlgarrobo extends Mesa {...}
  abstract class Mesa {...}
  public final class Conexion implements ErrorListener {...}
  public abstract class Estado {...}
  ````

### Convenciones de nombres

* Las convenciones de nomenclatura en Java son importantes y determinan estándares de nombramiento de elementos en Java.
* La convención más usada y recomendada es Camel Case en sus 2 variaciones:
  * **UpperCamelCase**: convención que nombra las iniciales con Mayúsculas.
    * Usos: Clases.
    * Ejemplos: Person, CarJapanese, etc.
  * **LowerCamelCase**: convención que nombra la primera inicial en minúsculas.
    * Usos: Atributos y Métodos.
    * Ejemplos: name, lastName, personalAddress, createPerson, getSalary, etc.

### Accesibilidades

| Accesibilidad | Clase | Paquete | Subclase | Mundo |
| -- | -- | -- | -- | -- |
| private | X | | | |
| package | X | X | | |
| protected | X | X | X | |
| public | X | X | X | X |

### Constructor

* Si una clase no declara ningún constructor, entonces tiene el constructor por defecto.
  * Números se inicializan en 0.
  * Booleanos se inicializan en false.
  * Objetos se inicializan en null.

  ```java
  public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
      this.dia = dia;
      this.mes = mes;
      this.anio = anio;
    }

    // Sobrecarga del constructor
    public Fecha() {
      this(1, 1, 2000);
    }

    public static void main(String [] args) {
      Fecha f1 = Fecha(23, 6, 1912);
      Fecha f2 = Fecha(7, 6, 1954);
      Fecha f3 = Fecha(); 
    }

  }
  ```

### Modificadores de las variables

* **static**: variables de clase (variable compartida).
* **transient**: no persistentes.
* **volatile**: indica a la JVM que la variable puede ser modificada en forma asincrónica por cualquier thread.
* **final**: constantes. Deben recibir valor inicial cuando se construye el objeto. En lo sucesivo, el campo o atributo no podrá ser modificado. Ejemplo: Math.PI

  ```java
  public static final double PI = 3.14….;
  ```

### Alcance de las variables

* Bloque de código en donde es accesible la variable.
* Hay 3 categorías: a nivel clase, a nivel método, a nivel bloque.

  ```java
  public class MiClase {
    String s;
    public void miMetodo(boolean b) {
      int s;
      if (b) {
        long s;
      }
    }
  }
  ```

### Métodos privados

* Se declaran métodos privados cuando:
  * Demasiado cerca de la implementación.
  * Requieren un determinado orden de llamada.
  * Se utilizan en las operaciones de la propia clase.
* La base del encapsulamiento se basa en que determinados métodos o atributos **no deben ser de acceso público por seguridad de manejo de datos**.

  ```java
  public class Laptop {
    private Color color;
    private String marca;
    private double tamanio;

    public void encender() {...}
    public void apagar() {...}
    public void reiniciar() {...}
    private void cambiarMemoriaRAM() {...}
    private void cambiarHDD() {...}
    private void cambiarFuenteEnergia() {...}
  }
  ```

### Modificadores de los métodos

* **abstract**: no tiene implementación. Debe ser miembro de una clase abstracta. Actúan como reservas de espacio para los métodos que se implementan en las subclases.
* **static**: no necesita de un objeto que lo controle. Ejemplo: Math.pow  
  * Métodos factoría: Métodos estáticos que retornan objetos de su propia clase. Ejemplo: NumberFormat.getCurrencyInstance()
* **final**: el método no puede ser redefinido por las subclases.
* **native**: el método está implementado en otro lenguaje.
* **synchronized**: permite que múltiples objetos invoquen el mismo método con exclusión mutua.

### Lista de parámetros variables de los métodos

* Número variable de argumentos (varargs). Ejemplo:

  ```java
  public void unMetodo(Object...args) {
  //args es manipulado como un arreglo de Objects
  }

  public static void main(String[] args) {
    objeto.unMetodo(new Punto());
    objeto.unMetodo(new Punto(), new Integer(3));
    objeto.unMetodo(new Integer(3), “Hola”, “Mundo”);
  }
  ```

### Sintaxis básica de Java

![Sintaxis](img/sintaxis.jpg)

![Clase Coche](img/ejemplo-clase-coche.png)

## Enums

* Para declarar variables con un conjunto restringido de valores.
* Enum es un objeto que posee objetos.
* Ejemplo declaración:
  
    ```java
    public enum Talle {
      MINI, 
      MEDIANO, 
      GRANDE, 
      EXTRA_GRANDE
    };
    ```

* Ejemplo uso:

    ```java
    Talle talle = Talle.MEDIANO;
    ```

### Enumerado con representación

  ```java
  public enum Talle {
    MINI(“S”), 
    MEDIANO(“M”), 
    GRANDE(“X”);
    private representacion;
    private Talle(String representacion) { 
      this.setRepresentacion(representacion); 
    }
  }
  ```

## JUnit

* Es un conjunto de clases (framework) que permite realizar la ejecución de clases Java de manera controlada, para poder evaluar si el funcionamiento de cada uno de los métodos de la clase se comporta como se espera.
* Es decir, en función de algún valor de entrada se evalúa el valor de retorno esperado; si la clase cumple con la especificación, entonces JUnit devolverá que el método de la clase pasó exitosamente la prueba; en caso de que el valor esperado sea diferente al que regresó el método durante la ejecución, JUnit devolverá un fallo en el método correspondiente.
* [Link](http://www.vogella.com/tutorials/JUnit/article.html)
* Ejemplo:

```java
public class Sumador {
  private int operando1;
  private int operando2;

  public Sumador(int operando1, int operando2){
    this.operando1 = operando1;
    this.operando2 = operando2;
  }

  public int sumar() {
    return operando1 + operando2;
  }

}
```

```java
public class SumadorTest {

  @Test
  public test1() {
    Sumador sumador = new Sumador(1, 2);
    assertEquals(3, sumador.sumar());
  }

}
```

## Actividad

1. Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano. Defina un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos. Para probar esta funcionalidad, escriba un método main en el que se creen dos puntos, el primero de los cuales deberá tener las coordenadas 100.0, 200.0 y el segundo deberá tener las coordenadas 400.0, 800.0 y calcule e imprima la distancia entre ambos.
1. Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona dispone en un momento dado. La clase deberá tener un constructor que permitirá crear un monedero con una cantidad de dinero inicial y deberá definir un método para meter dinero en el monedero, otro para sacarlo y finalmente, otro para consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero a través de este último método. Por supuesto, no se podrá sacar más dinero del que haya en un momento dado en el monedero. Para probar el funcionamiento de la clase, escriba un método 'main' con una serie de instrucciones que hagan uso de los métodos definidos.
1. Implementar en Java la simulación de la tarjeta SUBE para viajar en subte y premetro. Información de funcionamiento y tarifas en:
[Tarifas, pases y abonos](http://www.buenosaires.gob.ar/subte/tarifas-pases-y-abonos)
1. Se plantea una simplificación del laberinto del juego del pacman representado por una secuencia de caracteres como la siguiente:

    ```sh
    UP        LEFT      RIGHT     DOWN
    .....     .....     .....     .....
    .....     .....     .....     .....
    ..V..     ..>..     ..<..     ..^..
    .....     .....     .....     .....
    .....     .....     .....     .....
    ```

* Para resolverlo vamos a crear una clase Maze que represente al laberinto y en ella algunos métodos que nos permitan mover al pacman en distintas direcciones, métodos para saber si el pacman está en cierta posición o con cierta dirección, un método que permite simular el paso de un instante de tiempo y un método que nos muestre en la consola el estado del laberinto. Una posible solución está representada por el siguiente código:

  ```java
  public class Maze {
    private int rows;
    private int columns;
    public boolean isPacManAt(int row, int column){}
    public boolean isPacManLoockingDown(){}
    public boolean isPacManLookingUp(){}
    public boolean isPacmManLookingLeft(){}
    public boolean isPacManLookingRight(){}
    public boolean isEmptyAt(int row, int column){}
    public void pacManDown(){}
    public void pacManUp(){}
    public void pacManLeft(){}
    public void pacManRight(){}
    public void tick(){}
    public void print(){}

    public static void main(String[] args) {
      Maze maze = new Maze();
      maze.pacManRight();
      maze.tick();
      maze.print()
      
      // * * * * *
      // * * * * *
      // * *   < *
      // * * * * *
      // * * * * *
    }
  }
  ```

1. Probar la clase Maze, para los siguientes casos de prueba:
    * testPacManLooksUpInCenterOfMaze
    * testPacManMovesUp
    * testPacManWrapsAroundWhenAtTop
    * testTickLeftTickCheck
    * testPacManMovesUpAndBackAgain
    * testPacManMovesLeftAndBackAgain
    * testPacManChangesDirectionLeft
    * testPacManMovesLeft
    * testPacManWrapsAroundLeft
    * testPacManChangesDirectionDown
    * testPacManChangesDirectionRight
    * testPacManChangesDirectionUp
    * assertThereIsExactlyOnePacMan
  