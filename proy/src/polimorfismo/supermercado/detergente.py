from producto import Producto
from con_descuento import ConDescuento


class Detergente(Producto, ConDescuento):
    
    def __init__(self, marca, precio):
        super().__init__(marca, precio)
        self.descuento = 0
        
    def get_descuento(self):
        return self.descuento
    
    def set_descuento(self, descuento):
        self.descuento = descuento
    
    def get_precio_descuento(self):
        return self.precio - self.precio * self.descuento / 100
    
    def __str__(self):
        return f'{super().__str__()}, Descuento: {self.descuento}%'
