from abc import ABCMeta
from abc import abstractmethod

class EsAlimento(metaclass=ABCMeta):
    
    @abstractmethod
    def set_caducidad(self, caducidad):
        pass
    
    @abstractmethod
    def get_caducidad(self):
        pass
    
    @abstractmethod
    def get_calorias(self):
        pass
    