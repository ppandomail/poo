class Coleccion:

    def __init__(self, nombre_coleccion):
        self.__nombre_coleccion = nombre_coleccion
        self.__lista_figura = []

    def get_nombre_coleccion(self):
        return self.__nombre_coleccion

    def set_nombre_coleccion(self, nombre_coleccion):
        self.__nombre_coleccion = nombre_coleccion

    def agregar_figura(self, figura):
        self.__lista_figura.append(figura)

    def subir_precio(self, cantidad, identificador):
        for fig in self.__lista_figura:
            if fig.get_codigo() == identificador:
                fig.subir_precio(cantidad)

    def con_capa(self):
        lista = []
        for fig in self.__lista_figura:
            if fig.get_superheroe().get_capa():
                lista.append(fig)
        return lista

    def mas_valioso(self):
        mas_valioso = 0
        figura_valiosa = None
        for fig in self.__lista_figura:
            if fig.get_precio() > mas_valioso:
                mas_valioso = fig.get_precio()
                figura_valiosa = fig
        return figura_valiosa

    def get_valor_coleccion(self):
        valor_coleccion = 0
        for fig in self.__lista_figura:
            valor_coleccion += fig.get_precio()
        return valor_coleccion
    
    def get_volumen_coleccion(self):
        volumen_coleccion = 200
        for fig in self.__lista_figura:
            volumen_coleccion += fig.get_dimension().get_volumen()
        return volumen_coleccion

    def __str__(self):
        representacion = ''
        for fig in self.__lista_figura:
            representacion += fig.__str__() + '\n'
        return representacion
