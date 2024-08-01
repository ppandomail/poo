import math
import unittest

class Punto:
    
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    
    def get_x(self):
        return self.x

    def distancia(self, punto):
        return math.hypot(self.x - punto.x, self.y - punto.y)

class PuntoTest(unittest.TestCase):

    def test_distancia(self):
        p = Punto(3, 4)
        self.assertEqual(p.distancia(Punto(0, 0)), 5.0)

    def test_getx(self):
        p = Punto(3, 4)
        self.assertEqual(p.get_x(), 3)




