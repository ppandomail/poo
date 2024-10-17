"""Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen suficientes flechas. 
Comienzan con 20 flechas en su carcaj, y pueden recargar si reciben un paquete de seis flechas. 
Infringen un daño de 5 puntos, y comienzan con 50 de salud.
"""


from unidad import Unidad


class Arquero(Unidad):
    
    def __init__(self, posicion):
        super().__init__(5, 50, posicion)
        self.__flechas = 20

    def get_flechas(self):
        return self.__flechas

    def puede_atacar(self, oponente):
        return (
            not self is oponente
            and not self.esta_muerto()
            and not oponente.esta_muerto()
            and self.esta_dentro_del_alcance(oponente, 2, 5)
            and self.__flechas > 0
        )

    def atacar(self, oponente):
        if self.puede_atacar(oponente):
            self.__flechas -= 1
            self.infringir_danio(oponente)

    def recargar_flechas(self):
        self.__flechas += 6
