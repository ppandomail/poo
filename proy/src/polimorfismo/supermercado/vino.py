from es_liquido import EsLiquido
from producto import Producto
from con_descuento import ConDescuento
from es_alimento import EsAlimento
from datetime import datetime


class Vino(Producto, EsLiquido, ConDescuento, EsAlimento):
    
    def __init__(self, marca, precio, tipo_vino, grados_alcohol):
        super().__init__(marca, precio)
        self.tipo_vino = tipo_vino
        self.grados_alcohol = grados_alcohol
        self.descuento = 0
        self.volumen = 0
        self.tipo_envase = ''
        self.caducidad = datetime.now()
    
    def get_tipo_vino(self):
        return self.tipo_vino
    
    def set_tipo_vino(self, tipo_vino):
        self.tipo_vino = tipo_vino
    
    def get_grados_alcohol(self):
        return self.grados_alcohol
    
    def set_grados_alcohol(self, grados_alcohol):
        self.grados_alcohol = grados_alcohol
    
    def get_descuento(self):
        return self.descuento
    
    def set_descuento(self, descuento):
        self.descuento = descuento
    
    def get_precio_descuento(self):
        return self.precio - self.precio * self.descuento / 100
    
    def get_volumen(self):
        return self.volumen
    
    def set_volumen(self, volumen):
        self.volumen = volumen
    
    def get_tipo_envase(self):
        return self.tipo_envase
    
    def set_tipo_envase(self, tipo_envase):
        self.tipo_envase = tipo_envase
    
    def get_caducidad(self):
        return self.caducidad
    
    def set_caducidad(self, caducidad):
        self.caducidad = caducidad
    
    def get_calorias(self):
        return self.grados_alcohol * 10
    
    

    
    
        