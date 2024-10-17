from abc import ABCMeta
from abc import abstractmethod

class ConDescuento(metaclass=ABCMeta):
    
    @abstractmethod
    def set_descuento(self, descuento):
        pass
    
    @abstractmethod
    def get_descuento(self):
        pass
    
    @abstractmethod
    def get_precio_descuento(self):
        pass