import unittest

from superheroe import Superheroe
from dimension import Dimension
from figura import Figura
from coleccion import Coleccion

class TestColeccion(unittest.TestCase):

    def setUp(self):
        self.coleccion = Coleccion('marvel')
        self.f1 = Figura('f1', 100, Dimension(10, 5, 6), Superheroe('batman'))
        self.f1.get_superheroe().set_capa(True)
        self.coleccion.agregar_figura(self.f1)
        superman = Superheroe('superman')
        superman.set_capa(True)
        self.f2 = Figura('f2', 500, Dimension(5, 5, 6), superman)
        self.coleccion.agregar_figura(self.f2)
        self.coleccion.agregar_figura(
            Figura('f3', 400, Dimension(2, 5, 6), Superheroe('flash')))
        self.coleccion.agregar_figura(
            Figura('f5', 100, Dimension(100, 5, 6), Superheroe('aquaman')))
        self.coleccion.agregar_figura(
            Figura('f4', 100, Dimension(20, 5, 6), Superheroe('antman')))

    def test_valor_coleccion(self):
        self.assertEqual(self.coleccion.get_valor_coleccion(), 1200)

    def test_volumen_coleccion(self):
        self.assertEqual(self.coleccion.get_volumen_coleccion(), 4310)

    def test_mas_valioso(self):
        self.assertEqual(self.coleccion.mas_valioso().get_precio(), 500)

    def test_con_capa(self):
        self.assertListEqual(self.coleccion.con_capa(), [self.f1, self.f2])

if __name__ == '__main__':
    unittest.main()
