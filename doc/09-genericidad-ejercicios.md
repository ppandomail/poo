# Genericidad

## Ejercicios

1. Escribir una clase Pila genérica usando para ello un atributo del tipo LinkedList

    | Comportamiento ||
    | -- | -- |
    | isVacia()   | devuelve true si la pila está vacía y false en caso contrario |
    | desapilar() | elimina el primer elemento de la colección |
    | ver()       | devuelve el primer elemento de la colección |
    | apilar()    | agrega un objeto por el extremo que corresponda |
    | toString()  | devuelve en forma de String la información de la colección |

1. Implementar una pila utilizando como atributos un array genérico y un entero que cuente el número de objetos insertados. La clase se debe llamar PilaArray y tiene los mismos métodos que la pila del ejercicio anterior

1. Escribir una clase Matriz genérica

    | Comportamiento ||
    | -- | -- |
    | constructor | recibe por parámetro el número de filas y columnas de la matriz |
    | set()       | recibe por parámetro la fila, la columna y el elemento a insertar. El elemento es de tipo genérico. Este método inserta el elemento en la posición indicada |
    | get()       | recibe por parámetro la fila y la columna. Devuelve el elemento en esa posición. El elemento devuelto es genérico |
    | columnas()  | devuelve el número de columnas de la matriz |
    | filas()     | devuelve el número de filas de las matriz |
    | toString()  | devuelve en forma de String la información de la matriz |

1. Escribir una clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable

    | Comportamiento |
    | -- |
    | constructor |
    | void add(E o) |
    | E get(int index) |
    | int size() |
    | boolean isEmpty() |
    | boolean remove(E o) |
    | int indexOf(E o) |
    | String toString() |

1. Escribir una interface genérica Operable, que sea genérica y que declare las cuatro operaciones básicas: suma, resta, producto y división
