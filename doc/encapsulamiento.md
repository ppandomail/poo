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
      Fecha f1 = new Fecha(23, 6, 1912);
      Fecha f2 = new Fecha(7, 6, 1954);
      Fecha f3 = new Fecha(); 
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
* [Sitio Oficial](https://junit.org/junit5/docs/current/user-guide/)
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
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SumadorTest {

  @Test
  public test1() {
    Sumador sumador = new Sumador(1, 2);
    assertEquals(3, sumador.sumar());
  }

}
```

### Anotaciones JUnit

| Anotación | Descripción |
| -- | -- |
| @Test | Denota que un método es un método test |
| @ParameterizedTest | Denota que un método es una prueba parametrizada |
| @RepeatedTest | Para repetir pruebas.  Ejemplo: @RepeatedTest(10) |
| @BeforeEach | Denota que el método se va a ejecutar antes de cada test (precondición) |
| @AfterEach | Denota que el método se va a ejecutar después de cada test (postcondición) |
| @BeforeAll | Denota que el método se va a ejecutar antes de la suite de tests |
| @AfterAll | Denota que el método se va a ejecutar después de la suite de tests |
| @Disabled | Usado para deshabilitar una clase test o un método test |

## Actividad

1. Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano. Defina un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos. Defina otro método que calcule la distancia de un objeto de la clase Punto al origen de coordenadas. Para probar esta funcionalidad, escriba un método main en el que se creen dos puntos, el primero de los cuales deberá tener las coordenadas 100.0, 200.0 y el segundo deberá tener las coordenadas 400.0, 800.0 y calcule e imprima la distancia entre ambos y sus distancias al origen de coordenadas.

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
  
1. Se tiene un jugador de futbol definido por cantidad de goles y la cantidad de infracciones que hizo y cantidad de partidos en que jugó; además, se cuenta con un equipo de fútbol con 11 jugadores. De un campeonato con 10 equipos de fútbol se desea determinar cual es el equipo que hizo “juego sucio” y para cada equipo determinar “una figura”, para esto se deberá codificar los métodos:
    * esBuenjugador(): retorna true si hizo al menos 10 goles y cometió menos de 5 infracciones, retorna false en otro caso.
    * una Figura(): devuelve el número de jugador más goleador entre todos los “buenos jugadores” del equipo.
    * juegoSucio(): retorna true si todos los jugadores de un mismo equipo que hicieron algún gol y jugaron más de 2 partidos, cometieron alguna infracción, retorna false en otro caso.
    * Los datos para los 10 equipos del campeonato se generaran al azar y en un archivo de salida se guardaran los datos del campeonato.
    * Se deberán codificar las clases y métodos necesarios.

1. Supongamos una máquina que dispone de un conjunto de N pulsadores numerados de 0 a N-1, cada uno de los cuales puede estar activo o no, en un instante de tiempo. Necesitamos programar una clase en JAVA, que permita almacenar la información de cuáles de esos pulsadores están o no activos en un instante dado. La clase necesitará los siguientes métodos:
    * activarPulsador: que recibirá un número de pulsador y hará que figure como activo.
    * desactivarPulsador: que recibirá un número de pulsador y hará que figure como NO activo.
    * activado: que recibirá un número de pulsador y devolverá si este está activo o no.
    * numActivos: que devolverá el número de pulsadores que están activados.

1. Escribir el código JAVA de una clase denominada ObraEdificio, con las siguientes características. Cada objeto de esta clase deberá tener información acerca de la superficie total a cimentar de una obra, y de la superficie que ya ha sido cimentada (en m^2, sin decimales). Existirán los siguientes métodos:
    * Constructor: en la creación se fijará el área total a cimentar para este edificio.
    * cimentando: recibirá un número indicando los metros de superficie que se están cimentando en ese momento. Si la suma de la superficie previamente cimentada más la que se supone que se está cimentando ahora, es mayor que la superficie total a cimentar, se escribirá un mensaje de error, y no se modificara nada. En caso contrario, se acumulara la cantidad de metros que se están cimentando con los que ya se habían cimentado antes.
    * restaPorCimentar: devolverá los metros que faltan por cimentar para alcanzar la superficie total.
    * terminado: devolverá verdadero si la superficie cimentada ya es igual a la superficie total a cimentar.

1. Definir una clase que represente a un número fraccionario. Una fracción está definida por un numerador y un denominador, ambos son números enteros. La clase deberá contener:
    * un constructor por defecto que inicialice la fracción en la fracción nula: 0/1
    * un constructor con dos parámetros: dos números enteros para inicializar el numerador y el denominador de la fracción. Se deberá tener en cuenta que el denominador debe ser no nulo.
    * Los métodos set y get respectivos.
    * El método toString()
    * El método ftor (): convierte una fracción a número real.
    * El método reducir(): simplifica la fracción hasta que queda irreducible.

1. Definir una clase que represente a un producto. El producto tendrá los siguientes atributos: código (int), descripcion (String), precio unitario (float), stock (int). La clase deberá contener:
    * un constructor por defecto.
    * un constructor con parámetros.
    * los métodos set y get respectivos.
    * el método toString().

1. Definir una clase que represente a un libro. La clase deberá contener:
    * un constructor por defecto.
    * un constructor con parámetros.
    * los métodos set y get respectivos.
    * el método toString().

1. Definir una clase Tiempo que representa una hora en formato hora, minuto y segundo. La clase deberá contener:
    * un constructor por defecto.
    * un constructor con parámetros.
    * los métodos set y get respectivos.
    * el método toString().
    * has(): que transforma hhmmss a segundos.
    * sah(): que transforma segundos a hhmmss.

1. Definir una clase que represente a una fecha. Sus atributos serán: día (entero), mes (entero), ano(entero), mesStr (String). La clase deberá contener:
    * un constructor por defecto.
    * un constructor con parámetros.
    * los métodos set y get respectivos.
    * el método toString().
    * aJuliana(): transforma la fecha gregoriana a fecha juliana representada por dos números enteros: el número ordinal que le corresponde a la fecha en el ano y el ano, ejemplo:
        * 1 de febrero de 2001 se corresponde con 32 de 2001
        * 1 de enero de 2001 se corresponde con 1 de 2001

1. Definir una clase que represente a un número complejo. Sus atributos serán dos números reales que representarán la parte real y la parte imaginaria del número complejo. La clase deberá contener:
    * un constructor por defecto.
    * un constructor con parámetros.
    * los métodos set y get respectivos.
    * el método toString().
    * suma(), resta(), producto(), division() y conjugado().

1. Desarrollar una clase Segmento para representar segmentos. Los datos miembro de esta clase son dos objetos de la clase Punto extremos de un segmento. Estos datos han de ser privados. Para esta clase se piden los siguientes constructores y métodos:
    * El constructor Segmento que recibe como argumentos dos objetos de la clase Punto, P1 y P2, y construye un nuevo objeto de la clase Segmento cuyos extremos son P1 y P2.
    * Los métodos de acceso extremoA y extremoB, sin argumentos, que devuelven los extremos de un objeto Segmento.
    * Los métodos modificadores extremoA y extremoB, que reciben como argumento un objeto de la clase Punto y modifican el correspondiente extremo de un objeto Segmento.
    * El método igual, que comprueba si un objeto de la clase Segmento es igual a otro dado que se pasa como argumento.
    * El método longitud, sin argumentos, que calcula la longitud de un objeto de la clase Segmento.
    * El método proporcional, que comprueba si un objeto de la clase Segmento es proporcional a otro dado que se pasa como argumento.
    * El método perpendicular, que comprueba si un objeto de la clase Segmento es perpendicular a otro dado que se pasa como argumento.
    * El método puntoMedio, sin argumentos, que devuelve el objeto Punto que representa el punto medio de un objeto Segmento.
    * El método pertenece, que recibe como argumento un objeto Punto P, y comprueba si P se encuentra en el segmento representado por un objeto Segmento.
    * El método recta, sin argumentos, que construye un objeto Recta que contiene a un objeto Segmento.
    * El método mediatriz, sin argumentos, que devuelve un objeto Recta que representa la mediatriz de un objeto Segmento.

1. Implementar la clase Nota

```java
class Nota {

    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) { }
    
    /**
     * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
     */
    public int obtenerValor() { }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() { }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() { }
    
}
```

1. Agregar a la clase Nota el método:

```java
    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo por nuevoValor, siempre y cuando nuevoValor sea superior al valor numérico actual de la Nota.
    */
    public void recuperar(int nuevoValor) { }
```

1. Implementar una clase que modele un círculo, del que se desea manipular (obtener y cambiar):
    * radio
    * diámetro
    * perímetro
    * área

1. Implementar una clase que modele una corona circular utilizando la clase Circulo desarrollada previamente. Se desea manipular (obtener y cambiar):  @
    * radio interior
    * radio exterior
    * perímetro interior
    * perímetro exterior
    * área

1. Implementar la clase Cubo a partir de la siguiente interfaz:

```java
class Cubo {

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) { }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() { }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) { }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() { }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) { }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() { }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) { }
}
```

1. Implementar la clase TarjetaBaja a partir de la siguiente declaración:

```java
class TarjetaBaja {

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) { }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() { } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) { }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() { }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() { }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() { }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() { }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() { }
}
```

1. Implementar la clase Ticket a partir de la siguiente interfaz

```java
class Ticket {

    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() { }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) { }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) { }

    /**
     * post: devuelve el importe acumulado hasta el momento, sin cerrar el Ticket.
     */
    public double calcularSubtotal() { }

    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() { }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() { }

}
```

1. Implementar la clase CajaDeAhorro con la siguiente interfaz:

```java
class CajaDeAhorro {

    /**
     * post: la instancia queda asignada al titular indicado y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) { }
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() { }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() { }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto depositado.  
     */
    public void depositar(double monto) { }
 
    /**
     * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
     */
    public void extraer(double monto) { }
}
```

1. Implementar la clase Cerradura con los siguientes métodos. Indique axiomas de la clase, pre y post condiciones de los métodos. Cuando una Cerradura se bloquea no puede volver a abrirse nunca más.

```java
class Cerradura {

   public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean)

    public boolean abrir(int clave)

    public void cerrar()

    public boolean estaAbierta()

    public boolean estaCerrada()

    public boolean fueBloqueada()

    public int contarAperturasExitosas()

    public int contarAperturasFallidas()

}
```

1. Implementar la clase ExpendedorDePasajes con los siguientes métodos. Indique axiomas de la clase, pre y post condiciones de los métodos.

```java
class ExpendedorDePasajes {

    public ExpendedorDePasajes(double precioPorKm)

    public double venderPasaje(double distanciaEnKm)

    public double venderPasajes(int cantidad, double distanciaEnKm)

    public int contarPasajesVendidos()

    public double obtenerDistanciaMaxima()

    public double calcularDistanciaPromedio()

    public double calcularVentaTotal()
}
```

1. Un Tragamonedas está compuesto por 3 Tambores. Cuando el Tragamonedas se activa, giran los 3 Tambores. Cada Tambor se detiene en una posición comprendida entre 1 y 8.  El Tragamonedas entrega un premio cada vez que, luego de ser activado los 3 Tambores se detienen en la misma posición. Implementar las clases Tragamonedas usando la clase Tambor:

```java
class Tambor {

    private int posicion;

    /**
     * post: inicialmente el Tambor está en la posición 1.
     */
    public Tambor() {

        posicion = 1;
    }

    /**
     * post: devuelve el número de posición en la que se encuentra el Tambor. Es un valor comprendido entre 1 y 8.
     */
    public int obtenerPosicion() { 

        return posicion;
    }

    /**
     * post: hace girar el tambor y luego se detiene en una posición comprendida entre 1 y 8.
     */
    public void girar() { 

        /* provee un número aleatorio en el rango [0.0, 1.0) */
        double aleatorio = Math.random();

        posicion = (int) (aleatorio * 8) + 1;
    }
}


class Tragamonedas {

    /**
     * post: los 3 Tambores del Tragamonedas están en la posición 1.
     */
    public Tragamonedas() { }

    /**
     * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
     */
    public void activar() { }

    /**
     * post: indica si el Tragamonedas entrega un premio a partir de la posición de sus 3 Tambores.
     */
    public boolean entregaPremio() { }

/**
     * post: obtiene la posición del iésimo tambor del Tragamonedas
       pre:  i => 0; i < n (n = cantidad de tambores)
     */
    public int obtenerPosicionDelTambor(int i) { }
}
```

1. Implementar la clase SalaDeCine, tal que tenga operaciones para:
    1. Crearla con la cantidad de butacas totales, y cantidad de filas.
    1. Consultar si una butaca está ocupada (referida por fila y asiento).
    1. Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada.
    1. Consultar la cantidad total de butacas ocupadas.
    1. Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila.

    ```java
    public class SalaDeCine {
      private boolean [][] sala;
      public SalaDeCine(int butacas, int filas) { /*TODO*/ }
      public boolean estaOcupada(int fila, int asiento) { /*TODO*/ }
      public void ocuparButaca(int fila, int asiento) { /*TODO*/ }
      public int cantidadDeButacasOcupadas() { /*TODO*/ }
      boolean hayEspacioPara(int cantidadDePersonas) { /*TODO*/ }
    ```

1. Implementar la class Biblioteca. Para cada uno de los puntos confeccionar los casos de prueba JUnit que aseguren su correcto funcionamiento.

  ```java
  public class Bibioteca {
    private Libro[] libros;
    // Se construya a partir de la máxima cantidad de libros que puede contener.
    public Biblioteca (int maxCantidadDeLibros) { /*TODO*/ }
    // Se pueda consultar la cantidad de libros que contiene.
    public int cuantosLibros() { /*TODO*/ }
    //Se pueda agregar un libro indicando su título, autor, Genero y cantidad de páginas, siempre y cuando haya lugar en la Biblioteca. Los Generos literarios que le gustan a éste bibiotecario son: POESIA, CIENCIAFICCION, AVENTURA, NOVELA, HISTORIA, INFANTILES.
    public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) { /*TODO*/ }
    // Devuelva el título de un libro a partir de la posición.
    public String libroEnLaPosicion(int posicion) { /*TODO*/ }
    //Devuelva el libro con más cantidad de páginas.
    public Libro libroConMasPaginas() { /*TODO*/ }
    // Se pueda consultar cuantos libros hay de determinado autor.
    public int cuantosLibrosDelAutor(String autor) { /*TODO*/ }
    // Devuelva un arreglo con todos los Libros de un autor que se pasa por parámetro.
    public Libro [] librosDelAutor(String autor) { /*TODO*/ }
    // Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo que se tarda 1 minuto por página.
    public int tiempoEnLeetTodosLosLibros() { /*TODO*/ }
    // Informe por pantalla la cantidad de libros que hay por cada Genero literario.
    public void librosPorGeneroLiterario() { /*TODO*/ }
  ```  
