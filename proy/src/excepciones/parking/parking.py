class Parking:

    def __init__(self, nombre, cant_plazas):
        self.___nombre = nombre
        self.__patentes = []
        for i in range(0, cant_plazas):
            self.__patentes.insert(i, None)

    def get_nombre(self):
        return self.___nombre

    def entrada(self, patente, plaza):
        if patente == None or len(patente) < 4:
            raise Exception('Patente incorrecta')
        if self.__patentes[plaza] != None:
            raise Exception('Plaza ocupada')
        if self.__patentes.count(patente) > 0:
            raise Exception('Patente repetida')
        self.__patentes.insert(plaza, patente)

    def salida(self, patente):
        index = -1
        try:
            index = self.__patentes.index(patente)
        except:
            raise Exception('Patente no existente')
        self.__patentes[index] = None
        return index

    def get_plazas_totales(self):
        return len(self.__patentes)

    def get_plazas_ocupadas(self):
        return self.get_plazas_totales() - self.get_plazas_libres()

    def get_plazas_libres(self):
        return self.__patentes.count(None)

    def __str__(self):
        representacion = f'\n{self.___nombre} \n'
        representacion += '------------------------'
        for indice, patente in enumerate(self.__patentes):
            representacion += f'\nPlaza {indice}:\t' + ('(vacio)' if patente == None else patente)
        return representacion
