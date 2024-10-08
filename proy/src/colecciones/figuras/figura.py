class Figura:

    def __init__(self, codigo, precio, dimension, superheroe):
        self.__codigo = codigo
        self.__precio = precio
        self.__dimension = dimension
        self.__superheroe = superheroe

    def get_codigo(self):
        return self.__codigo

    def get_precio(self):
        return self.__precio

    def get_dimension(self):
        return self.__dimension

    def get_superheroe(self):
        return self.__superheroe

    def set_codigo(self, codigo):
        self.__codigo = codigo

    def set_precio(self, precio):
        self.__precio = precio

    def set_dimension(self, dimension):
        self.__dimension = dimension

    def set_superheroe(self, superheroe):
        self.__superheroe = superheroe
    
    def subir_precio(self, cantidad):
        self.__precio += cantidad
    
    def __str__(self):
        return f'{self.__codigo}, {self.__precio}, {self.__dimension}, {self.__superheroe}'
