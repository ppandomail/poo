# Encapsulamiento

## Ejercicios

1. Defina una clase Punto que tendrá dos atributos, de tipo double, x e y, que representarán las coordenadas del punto dentro del plano. Implemente los siguientes métodos:

    ```java
    public boolean estaSobreElEjeX() {}
    public boolean estaSobreElEjeY() {}
    public boolean esElOrigenDeCoordenadas() {}
    public double distanciaAlOrigen() {}
    public static double distancia(Punto p1, Punto p2) {}
    public double distancia(Punto p) {}
    ```

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
