from electrodomestico import Electrodomestico


class Lavadora(Electrodomestico):
    
    
    def __init__(self, tipo, marca, potencia, precio, agua_caliente=False):
        super().__init__(tipo, marca, potencia)
        self.__precio = precio
        self.__agua_caliente = agua_caliente
    
    def get_precio(self):
        return self.__precio
    
    def set_precio(self, precio):
        self.__precio = precio
    
    def get_agua_caliente(self):
        return self.__agua_caliente
    
    def set_agua_caliente(self, agua_caliente):
        self.__agua_caliente = agua_caliente
    
    def get_consumo(self, horas):
        if not self.__agua_caliente:
            return super().get_consumo(horas)
        return horas * (self.__potencia + self.__potencia * 0.20)
    
    def __str__(self):
        return f'{super().__str__()}, {self.__precio}, {self.__agua_caliente}'