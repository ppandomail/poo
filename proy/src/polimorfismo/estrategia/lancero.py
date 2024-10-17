"""Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. 
Infringen un daño de 25 puntos, y comienzan con 150 de salud."""

from unidad import Unidad


class Lancero(Unidad):

    def __init__(self, posicion):
        super().__init__(25, 150, posicion)

    def puede_atacar(self, oponente):
        return (
            not self is oponente
            and not self.esta_muerto()
            and not oponente.esta_muerto()
            and self.esta_dentro_del_alcance(oponente, 1, 3)
        )

    def atacar(self, oponente):
        if self.puede_atacar(oponente):
            self.infringir_danio(oponente)
