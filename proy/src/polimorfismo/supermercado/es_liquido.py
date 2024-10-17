from abc import ABCMeta
from abc import abstractmethod

class EsLiquido(metaclass=ABCMeta):
    
    @abstractmethod
    def set_volumen(self, volumen):
        pass
    
    @abstractmethod
    def get_volumen(self):
        pass
    
    @abstractmethod
    def set_tipo_envase(self, tipo_envase):
        pass
    
    @abstractmethod
    def get_tipo_envase(self):
        pass