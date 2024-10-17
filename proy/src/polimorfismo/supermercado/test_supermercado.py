import unittest

from cereal import Cereal
from vino import Vino
from datetime import datetime


class TestSupermercado(unittest.TestCase):
    
    def test_calorias(self):
        lista = []
        lista.append(Cereal('Kellogs', 5500, 'espelta', datetime.now()))
        lista.append(Vino('Toro', 3000, 'malbec', 40))
        lista.append(Vino('Toro', 3000, 'sirah', 10))
        lista.append(Vino('Toro', 3000, 'cavernet', 50))
        calorias = 0
        for alimento in lista:
            calorias += alimento.get_calorias()
        self.assertEqual(calorias, 1005)

if __name__ == '__main__':
    unittest.main()
