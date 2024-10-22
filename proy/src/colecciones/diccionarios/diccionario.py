import random

class Diccionario:

    """ La clase representa un diccionario """

    def __init__(self):
        self.__diccionario = {}

    def nuevo_par(self, espaniol, ingles):
        self.__diccionario[espaniol] = ingles

    def traduce(self, espaniol):
        return None if espaniol not in self.__diccionario.keys() else self.__diccionario[espaniol]

    def palabra_aleatoria(self):
        n = random.randrange(0, len(self.__diccionario))
        return list(self.__diccionario.keys())[n]

    def primera_letra_traduccion(self, espaniol):
        return self.traduce(espaniol)[0]

    def __str__(self):
        return str(self.__diccionario.items())
