# UNIVERSIDAD NACIONAL DEL OESTE

## ESCUELA DE INFORMÁTICA

## PROGRAMACIÓN CON OBJETOS I

### Profesor: Mag. Ing. Pablo Pandolfo / Sr. Martin Ivaldi

---

### Segundo Examen Parcial noviembre 2022

* ALUMNO:  
* LU:
* CARRERA:

---

1. Se dispone del archivo ventas.in con las ventas realizadas por la empresa de los productos enviados por el depósito número 5. Cada línea del archivo contiene: Código de producto (5 caracteres alfanuméricos) y Cantidad vendida (entero 1 y 1000). Los campos están separados por un espacio en blanco. Generar el archivo ventasPorProducto.out con el siguiente formato (una línea por producto). Nota: Se espera un adecuado tratamiento de excepciones. Ejemplo:

    * ventas.in:

    ```plain
    af234 235 
    bc456 100 
    ... 
    cx213 1000 
    ... 
    af234 200 
    cx213 1000
    ```

    * ventasPorProducto.out:

    ```plain
    af234 435 
    bc456 100 
    cx213 2000 
    ...
    ```

    ```java
    public class Ventas {
        private Map<String, Integer> ventasPorProducto;
        public Ventas() { /* TODO */ }
        public void leerVentas(String entrada) { /* TODO */ }
        public void escribirVentasPorProducto(String salida) { /* TODO */ }
        public static void main(String[] args) throws IOException { /* TODO */ }
    }
    ```

1. Escribir un método que reciba dos listas como parámetros  y devuelva una tercera lista que sea la diferencia simétrica entre la primera y la segunda. La diferencia simétrica entre dos listas son los objetos que están en la primera lista o en la segunda pero no ambos a la vez. Considere que los objetos que están contenidos en las listas tienen órden total (Implementan Comparable y tienen implementado su propio equals y hashCode).

---
