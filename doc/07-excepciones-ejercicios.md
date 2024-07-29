# Excepciones

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
