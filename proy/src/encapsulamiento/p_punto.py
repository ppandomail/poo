import math

class Punto:
    
    __cont = 0
    
    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y
        Punto.contar()
    
    def get_x(self):
        return self.__x
    
    def get_y(self):
        return self.__y
    
    def set_x(self, x):
        self.__x = x
        
    def set_y(self, y):
        self.__y = y
    
    @classmethod
    def contar(cls):
        cls.__cont = cls.__cont + 1
    
    @staticmethod
    def get_contador():
        return Punto.__cont

    def distancia(self, punto):
        return math.hypot(self.__x - punto.get_x(), self.__y - punto.get_y())
    
    def getCuadrante(self):
        if self.__x > 0 and self.__y > 0:
            return 1
        if self.__x < 0 and self.__y > 0:
            return 2
        if self.__x < 0 and self.__y < 0:
            return 3
        if self.__x > 0 and self.__y < 0:
            return 4
        return 0
