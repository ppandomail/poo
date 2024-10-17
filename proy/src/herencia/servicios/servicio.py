from abc import abstractmethod
from abc import ABCMeta

class Servicio(metaclass=ABCMeta):
    
    def __init__(self, trabajador, fh_inicio, cliente):
        self.trabajador = trabajador
        self.fh_inicio = fh_inicio
        self.cliente = cliente
    
    def get_trabajador(self):
        return self.trabajador
    
    def get_fh_inicio(self):
        return self.fh_inicio
    
    def get_cliente(self):
        return self.cliente
    
    @abstractmethod
    def coste_material(self):
        pass
    
    @abstractmethod
    def coste_mano_obra(self):
        pass
    
    @abstractmethod
    def coste_total(self):
        pass
    
    @abstractmethod
    def detalle_servicio(self):
        pass
    
    