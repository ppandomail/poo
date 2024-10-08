import unittest

from superheroe import Superheroe
from dimension import Dimension
from figura import Figura

class TestFiguras(unittest.TestCase):

    def test_superheroe(self):
        superheroe = Superheroe('batman')
        self.assertEqual(superheroe.get_capa(), False)
    
    def test_dimension(self):
        dimension = Dimension(5, 10, 3)
        self.assertEqual(dimension.get_alto(), 5)
        self.assertEqual(dimension.get_ancho(), 10)
        self.assertEqual(dimension.get_profundidad(), 3)
        self.assertEqual(dimension.get_volumen(), 150)
    
    def test_figura(self):
        figura = Figura('f111', 10000, Dimension(7, 15, 6), Superheroe('superman'))
        figura.subir_precio(5000)
        self.assertEqual(figura.get_precio(), 15000)

if __name__ == '__main__':
    unittest.main()
