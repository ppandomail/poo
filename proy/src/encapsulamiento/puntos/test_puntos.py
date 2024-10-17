import unittest
from punto import Punto

class PuntoTest(unittest.TestCase):

    def test_getters(self):
        p = Punto(3, 4)
        self.assertEqual(p.get_x(), 3)
        self.assertEqual(p.get_y(), 4)

    def test_contador(self):
        Punto()
        Punto(1, 2)
        self.assertEqual(Punto.get_contador(), 2)

    def test_distancia(self):
        p = Punto(3, 4)
        self.assertEqual(p.distancia(Punto(0, 0)), 5.0)

    def test_cuadrante(self):
        self.assertEqual(Punto(3, 4).getCuadrante(), 1)

if __name__ == '__main__':
    unittest.main()
