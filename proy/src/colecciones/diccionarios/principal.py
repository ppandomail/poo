from diccionario import Diccionario


class Principal:

    def __init__(self):
        self.__dicc = Diccionario()
        self.__dicc.nuevo_par('Coche', 'Car')
        self.__dicc.nuevo_par('Perro', 'Dog')
        self.__dicc.nuevo_par('Mesa', 'Table')

    def iniciar_cuestionario(self):
        palabra = self.__dicc.palabra_aleatoria()
        print(palabra + ': ' + self.__dicc.primera_letra_traduccion(palabra))
        respuesta_usr = input('Indique la respuesta: ')
        respuesta_ok = self.__dicc.traduce(palabra)
        if respuesta_usr.strip().upper() == respuesta_ok.strip().upper():
            print('¡CORRECTO!')
        else:
            print('¡NO! La respuesta correcta es ' + respuesta_ok)

p = Principal()
p.iniciar_cuestionario()
