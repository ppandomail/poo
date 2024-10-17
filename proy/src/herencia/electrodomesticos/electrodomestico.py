class Electrodomestico:
    
    def __init__(self, tipo, marca, potencia):
        self.__tipo = tipo
        self.__marca = marca
        self.__potencia = potencia
    
    def get_tipo(self):
        return self.__tipo
    
    def set_tipo(self, tipo):
        self.__tipo = tipo
    
    def get_marca(self):
        return self.__marca
    
    def set_marca(self, marca):
        self.__marca = marca
    
    def get_potencia(self):
        return self.__potencia
    
    def set_potencia(self, potencia):
        self.__potencia = potencia
    
    def get_consumo(self, horas):
        return self.__potencia * horas
    
    def get_costo_consumo(self, horas, costo_hora):
        return self.get_consumo(horas) * costo_hora
    
    def __str__(self):
        return f'{self.__tipo}, {self.__marca}, {self.__potencia}'
