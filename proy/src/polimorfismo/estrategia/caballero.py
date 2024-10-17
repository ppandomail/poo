""" Los caballeros pueden atacar a una distancia de 1 a 2, 
siempre que su caballo no se haya puesto rebelde.
Infringe un daño de 50 puntos y comienza con 200 de salud. """

from unidad import Unidad
from caballo import Caballo


class Caballero(Unidad):
    """Los caballeros pueden atacar a una distancia de 1 a 2,
    siempre que su caballo no se haya puesto rebelde.
    Infringe un daño de 50 puntos y comienza con 200 de salud."""

    def __init__(self, posicion):
        super().__init__(50, 200, posicion)
        self.__caballo = Caballo()

    def puede_atacar(self, oponente):
        return (
            not self is oponente
            and not self.esta_muerto()
            and not oponente.esta_muerto()
            and self.esta_dentro_del_alcance(oponente, 1, 2)
            and not self.__caballo.esta_rebelde()
        )

    def atacar(self, oponente):
        if self.puede_atacar(oponente):
            self.__caballo.incrementar_ataques()
            self.infringir_danio(oponente)

    def agua_para_el_caballo(self):
        self.__caballo.beber_agua()
