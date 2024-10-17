
import unittest

from lavadora import Lavadora


class TestElectrodomestico(unittest.TestCase):
    
    def test_electrodomesticos(self):
        lavadora = Lavadora('Frontal', 'Samsung', 2500, 255000, True)
        self.assertEqual(lavadora.__str__(), 'Frontal, Samsung, 2500, 255000, True')

if __name__ == '__main__':
    unittest.main()