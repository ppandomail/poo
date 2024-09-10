"""Clase abstracta Unidad"""

from abc import ABC, abstractmethod


class Unidad(ABC):
    """Clase abstracta Unidad
    Modela a cualquiera de las unidades
    que participan del juego"""

    def __init__(self, danio, salud, posicion):
        self.__danio = danio
        self.__salud = salud
        self.__posicion = posicion

    @abstractmethod
    def puede_atacar(self, oponente) -> bool:
        """Metodo bool que retorna True  o False, si una inidad puede o no,
        atacar a su oponente de acuerdo a las propiedades de cada una"""

    @abstractmethod
    def atacar(self, oponente):
        """Ataca al oponente, infringiendo daño al mismo,
        y actualizando sus propiedades segun cada clase"""

    def get_salud(self):
        """Retorna el valor actual de la salud de la Unidad"""
        return self.__salud

    def set_salud(self, salud):
        """Establece el valor de la Unidad"""
        self.__salud = salud

    def get_danio(self):
        """Retorna el valor del daño que la Unidad provoca al oponente"""
        return self.__danio

    def get_posicion(self):
        return self.__posicion

    def infringir_danio(self, oponente):
        oponente.set_salud(oponente.get_salud() - self.get_danio())

    def esta_dentro_del_alcance(self, oponente, desde, hasta):
        return (
            abs(self.get_posicion() - oponente.get_posicion()) >= desde
            and abs(self.get_posicion() - oponente.get_posicion()) <= hasta
        )

    def esta_muerto(self):
        return self.get_salud() <= 0
