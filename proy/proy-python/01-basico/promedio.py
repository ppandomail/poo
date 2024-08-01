"""

Ejercicio:

Ingresar nom y ape de un alumno y sus notas de mate, literatura y fisica.
Se pide imprimir el nom, ape y promedio.
Si prom es mayor a 6 aparecer cartel "Aprobado"
Si menos de 4 puntos "Insuficiente"
Si entre 4 y 5.9999 "A recuperatorio"
Si 9 o mas "Alumno destacado"

"""



def calcular_promedio(nota1, nota2, nota3):
    return (nota1 + nota2 + nota3) / 3


def obtener_cartel(promedio):
    cartel = str(promedio) + ": "
    if promedio >= 6:
        cartel += "Aprobado"
        if promedio >= 9:
            cartel += " -> Alumno destacado"
    elif (promedio >= 4) and (promedio < 6):
        cartel += "A recuperatorio"
    else:
        cartel += "Insuficiente"
    return cartel


nombre = input("Nombre: ")
apellido = input("Apellido: ")
nota_matematica = int(input("Nota de matematicas: "))
nota_literatura = int(input("Nota de literatura: "))
nota_fisica = int(input("Nota de fisica: "))
print (nombre, apellido, obtener_cartel(calcular_promedio(nota_matematica, nota_literatura, nota_fisica)))
