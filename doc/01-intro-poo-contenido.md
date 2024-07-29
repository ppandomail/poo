# Introducción al Paradigma Orientado a Objetos

## ¿Qué es programación?

* Es el proceso de **codificar un algoritmo** en el lenguaje de programación determinado, con el objetivo que sea ejecutado por la computadora
* Es una habilidad que se adquiere mejor con la **práctica** y el **ejemplo** más que con los libros (Alan Turing)

  ![Programación](img/programacion.png)

## ¿Cuáles son las ramas de la programación?

  ![Ramas de la programación](img/ramas-programacion.png)

## ¿Qué hace un programador?

* Crear soluciones tecnológicas que satisfagan las necesidades de los usuarios

  1. **Diseñar**: el código necesita una estructura ordenada que asegure su funcionamiento
  1. **Testear**: se prueba el software en busca de posibles errores de funcionamiento
  1. **Depurar**: diagnóstico y arreglo de errores

* Se espera un código:
  * Eficiente
  * Robusto
  * Legible
  * Confiable

## ¿Cuáles son los niveles de los desarrolladores?

* **Junior**: necesita supervisión
* **Semi Senior**: capacidad. técnica de realizar tareas con menos supervisión
* **Senior**: es capaz de supervisar y dirigir equipos

## ¿Cómo se aprende a programar?

* Se aprende a programar en la **Universidad**
* Es necesario ser **autodidactas**, ya que las tecnologías evolucionan muy rápido
* Las empresas contratan basándose con **habilidades comprobadas**

## ¿Qué es un algoritmo?

* Es la secuencia de pasos que resuelven un problema y es la base de la programación
* Partes de un algoritmo:

  |||
  | -- | -- |
  | **Entrada** | datos |
  | **Proceso** | operaciones con los datos |
  | **Salida**  | resultado |

* Características:

  |||
  | -- | -- |
  | **Preciso**  | resolver el problema sin errores |
  | **Definido** | si se ejecuta el algoritmo varias veces, las salidas serán iguales en cada ejecución |
  | **Finito**   | debe tener un inicio y un fin |
  | **Legible**  | cualquier persona que vea el algoritmo debe ser capaz de comprenderlo |

* Representación:

  |||
  | -- | -- |
  | Gráfica    | **Diagrama de Flujo** |
  | No gráfica | **Pseudocódigo** |
  | Formal     | **Código de un lenguaje de programación** |

  ![Representación algoritmos](img/algoritmo.jpg)

## ¿Cómo se desarrolla un algoritmo?

1. Obtener una descripción clara (sin ambiguedades, asunciones, contradicciones) del problema
1. Analizar el problema (datos, reglas)
1. Diseñar el algoritmo (técnicas)
1. Desarrollar el algoritmo a alto nivel
1. Refinar el algoritmo agregando detalles
1. Revisar el algoritmo (determinar si resuelve el problema)

## ¿Cómo se resuelve un problema?

1. **Diseñar** un algoritmo para el problema
2. Expresar el algoritmo como un **Programa** (especificación formal de un algoritmo por medio de un lenguaje de programación)
3. **Ejecutar** el programa (Eficiencia + V&V)

    ![Algoritmo](img/algoritmo.png)

## ¿Cuáles son los entornos de trabajo en el desarrollo de software?

1. **Desarrollo local**: lo que el programador ve en un su computadora.
1. **Entorno de pruebas**: los tester prueban el producto para encontrar o reportar fallas.
1. **Staging**: características del entorno de producción, se hacen pruebas de confiabilidad (aceptación)
1. **Entorno de producción**

## ¿Qué son los paradigmas de programación?

* Son los diferentes estilos de usar la programación para resolver un problema
* Es un modelo que brinda reglas que permiten abstraer la realidad
* Tipos:

  * Operacionales (COMO)

    | Paradigma | | Lenguajes |
    | -- | -- | -- |
    | **Imperativo**          | secuencia, ciclos y condiciones. Mutación de variables | Fortran, C, Pascal, COBOL, ... |
    | **Orientado a Objetos** | objetos que tiene datos y comportamiento y se comunican enviándose mensajes | Java, Python, C++, C#, Eiffel, Smalltack, ... |
  
  * Declarativos (QUE)

    | Paradigma | | Lenguajes |
    | -- | -- | -- |
    | **Funcional** | funciones que no manejan datos mutables o estados | Lisp, Haskell, ... |
    | **Lógico**    | reglas y hechos basados en la lógica de predicado | Prolog y dialectos, ... |

## ¿Qué es la POO?

* Es una forma de programar, más cercana a como expresaríamos las cosas en la vida real que otros tipos de programación (alto nivel)
* Se escriben programas en términos de: clases, objetos, encapsulamiento, propiedades, herencia, polimorfimo
* Todo es pensado como un objeto
* Los objetos que existen en el mundo real pueden ser conceptuales (Ej. pedido, plano, punto, caja de ahorro) o físicos (Ej. vehículo)

  ![POO](img/poo.png)

## ¿Qué es un POO?

* Es un conjunto de objetos que se comunican entre sí, enviándose mensajes para resolver un problema

## ¿Cual es el ciclo de vida del objeto?

  || Ejemplo |
  | -- | -- |
  | **1. Creación**    | CA ca1 = new CA() |
  | **2. Uso**         | ca1.getSaldo() |
  | **3. Destrucción** | ca1 fuera de su scope. Garbagge Collector |

## ¿Cuáles son las características del POO?

|||
| -- | -- |
| **Abstracción/Clase**           | describir la estructura del objeto, responsable de crear sus instancias |
| **Encapsulamiento** | ocultar detalles de implementación de un objeto |
| **Polimorfismo**    | objetos de diferentes tipos responden al mismo mensaje (mismo comportamiento) |
| **Herencia**        | compartir conocimiento. Se dá en una jerarquía (clasificación). Un objeto adquiere las propiedades de otro objeto |

![Pilares POO](img/poo-pilares.JPG)

## ¿Cuáles son las relaciones entre las clases?

| Relación ||| Ejemplo |
| -- | -- | -- | -- |
| **Dependencia** | colaboradores externos | "usa un ..." | Pedido utiliza la clase Cuenta |
| **Composición** | colaboradores internos | "tiene un ..." | Pedido contiene objetos de tipo Artículo |
| **Herencia**    | compartir conocimiento | "es un ..." | PedidoVigente es un Pedido |

![UML](img/uml.png)

## Ejemplo de jerarquía de clases

![Jerarquía](img/jerarquia.png)

## Desafío UML

![Desafío UML](img/uml-desafio.JPG)

![Solución UML](img/uml-solucion.JPG)

## ¿Qué es un lenguaje de programación?

* Es una notación para escribir programas
* Proporcionan estructuras:

  |||
  | -- | -- |
  | **sintácticas** | cómo escribir una expresión |
  | **semánticas**  | cómo evaluar una expresión  |

## ¿Cuáles son las características de un LOO?

* Todo es un objeto
* Todo objeto es instancia de una clase
* Todos los objetos de la misma clase pueden recibir los mismos mensajes
* Las clases se organizan en una estructura arbórea de raíz única, llamada jerarquía de clases

## Genealogía de los LOO

* A partir de los ‘90 proliferan con gran éxito la tecnología y LOO
* Los más implantados en la actualidad: Java, Python, C++, C#, ...

  ![Genealogía](img/genealogia.png)

## Proceso de AOO (Análisis Orientado a Objetos) y DOO (Diseño Orientado a Objetos)

![Pasos AOO y DOO](img/aoo-doo-1.JPG)
![Pasos AOO y DOO](img/aoo-doo-2.JPG)
![Pasos AOO y DOO](img/aoo-doo-3.JPG)
