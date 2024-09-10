"""Interface Bebedor para el Soldado y el Caballo"""

from abc import abstractmethod
from abc import ABCMeta


class Bebedor(metaclass=ABCMeta):
    @abstractmethod
    def beber_agua(self):
        pass
