class Superheroe:
  
  def __init__(self, nombre):
    self.__nombre = nombre
    self.__descripcion = ''
    self.__capa = False
  
  def get_nombre(self):
    return self.__nombre
  
  def get_descripcion(self):
    return self.__descripcion
  
  def get_capa(self):
    return self.__capa
  
  def set_nombre(self, nombre):
    self.__nombre = nombre
  
  def set_descripcion(self, descripcion):
    self.__descripcion = descripcion
  
  def set_capa(self, capa):
    self.__capa = capa
  
  def __str__(self):
    return self.__nombre + ', ' + self.__descripcion + ', ' + str(self.__capa)