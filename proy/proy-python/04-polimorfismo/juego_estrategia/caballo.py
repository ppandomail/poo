""" Un caballo se pone rebelde luego de 3 ataques, 
y puede calmarse si recibe una poción de agua. """

import bebedor as bb


class Caballo(bb.Bebedor):

    def __init__(self) -> None:
        self.__ataques = 0
        self.__rebelde = False

    def beber_agua(self):
        self.__ataques = 0
        self.__rebelde = False

    def incrementar_ataques(self):
        if self.__ataques < 3:
            self.__ataques += 1
        if self.__ataques >= 3:
            self.__rebelde = True

    def esta_rebelde(self):
        return self.__rebelde
