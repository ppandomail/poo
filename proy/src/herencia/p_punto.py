import math

class Punto:

  def __init__(self, x=0, y=0):
    self.x = x
    self.y = y

  def distancia(self, punto):
    return math.hypot(self.x - punto.x, self.y - punto.y)

  # Aplana el objeto a un string
  def __str___(self):
    return '(' + str(self.x) + ',' + str(self.y) + ')'


class Punto3D (Punto):

  def __init__(self, x=0, y=0, z=0):
    super().__init__(x, y)
    self.z = z

  # override: anula/sobreescribe total o parcialmente el método heredado.
  def distancia(self, punto):
    return math.hypot(super().distancia(punto), self.z - punto.z)

  def __str__(self):
    return '(' + str(self.x) + ',' + str(self.y) + ',' + str(self.z) + ')'

p = Punto(3, 4)
print(p)
print(dir(p))                   # devuelve una lista con los atributos y métodos del objeto.
print(hasattr(p, 'x'))          # True si 'x' es atributo de p
print(hasattr(p, 'distancia'))  # True si 'distancia' es método de p
print(isinstance(p, Punto))     # True si es instancia
print(p.distancia(Punto()))     # 5.0 

p3d = Punto3D(3, 4, 5)
print(p3d)
print(dir(p3d))
print(issubclass(Punto3D, Punto)) 
print(p3d.distancia(Punto3D()))   