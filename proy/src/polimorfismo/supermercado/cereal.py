from es_alimento import EsAlimento
from producto import Producto


class Cereal(Producto, EsAlimento):
    
    def __init__(self, marca, precio, tipo_cereal, caducidad):
        super().__init__(marca, precio)
        self.tipo_cereal = tipo_cereal
        self.caducidad = caducidad
    
    def get_tipo_cereal(self):
        return self.tipo_cereal
    
    def set_tipo_cereal(self, tipo_cereal):
        self.tipo_cereal = tipo_cereal
    
    def get_caducidad(self):
        return self.caducidad
    
    def set_caducidad(self, caducidad):
        self.caducidad = caducidad
    
    def get_calorias(self):
        if self.tipo_cereal == 'espelta':
            return 5
        if self.tipo_cereal == 'maiz':
            return 8
        if self.tipo_cereal == 'trigo':
            return 12
        return 15

    def __str__(self):
        return f'{super().__str__()}, Tipo Cereal: {self.tipo_cereal}, Caducidad: {self.caducidad}'
