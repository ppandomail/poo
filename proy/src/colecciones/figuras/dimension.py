class Dimension:

    def __init__(self, alto=0, ancho=0, profundidad=0):
        self.__alto = alto
        self.__ancho = ancho
        self.__profundidad = profundidad

    def get_alto(self):
        return self.__alto

    def get_ancho(self):
        return self.__ancho

    def get_profundidad(self):
        return self.__profundidad

    def set_alto(self, alto):
        self.__alto = alto

    def set_ancho(self, ancho):
        self.__ancho = ancho

    def set_profundidad(self, profundidad):
        self.__profundidad = profundidad
    
    def get_volumen(self):
        return self.__alto * self.__ancho * self.__profundidad
    
    def __str__(self):
        #return str(self.__alto) + ', ' + str(self.__ancho) + ', ' + str(self.__profundidad) + ', ' + str(self.get_volumen())
        return f'{self.__alto}, {self.__ancho}, {self.__profundidad}, {self.get_volumen()}'
    