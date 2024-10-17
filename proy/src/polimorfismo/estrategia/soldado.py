"""class Soldado"""

from unidad import Unidad
from bebedor import Bebedor

class Soldado(Unidad, Bebedor):
    """Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energía.
    Cada ataque les consume 10 puntos de energía, y comienzan con 100.
    Restauran energía si reciben la poción de agua.
    Infringen un daño de 10 puntos y comienzan con 200 de salud."""

    def __init__(self, posicion):
        super().__init__(10, 200, posicion)
        self.__energia = 100

    def get_energia(self):
        """Retorn la energía actual del soldado"""
        return self.__energia

    def puede_atacar(self, oponente):
        return (
            not self is oponente
            and not self.esta_muerto()
            and not oponente.esta_muerto()
            and self.esta_dentro_del_alcance(oponente, 0, 0)
            and self.__energia >= 10
        )

    def atacar(self, oponente):
        if self.puede_atacar(oponente):
            self.__energia -= 10
            self.infringir_danio(oponente)

    def beber_agua(self):
        self.__energia = 100

    def __str__(self):
        return (
            "\nSoldado en la posicion: "
            + str(self.get_posicion())
            + ", con energía de: "
            + str(self.get_energia())
        )

    def __eq__(self, other) -> bool:
        return (
            self.get_danio() == other.get_danio()
            and self.get_energia() == other.get_energia()
            and self.get_salud() == other.get_salud()
            and self.get_posicion() == other.get_posicion()
        )


# rambo = Soldado(1)
# conan = Soldado(1)
#
# print(rambo.puede_atacar(conan))
# rambo.atacar(conan)
# rambo.atacar(conan)
# rambo.atacar(conan)
# print(conan.get_salud())
# print(rambo.get_energia())
