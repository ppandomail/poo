import unittest
from datetime import datetime

from revision_alarma import RevisionAlarma
from trabajo_pintura import TrabajoPintura

class TestServicio(unittest.TestCase):

    def test_trabajo_pintura_sin_adicional(self):
        tp = TrabajoPintura('Da Vinci', datetime.now(), 'Pepe', 100, 50)
        print(tp.detalle_servicio())
        self.assertEqual(tp.coste_total(), 736.0256410256411)

    def test_trabajo_pintura_con_adicional(self):
        tp = TrabajoPintura('Da Vinci', datetime.now(), 'Pepe', 10, 5)
        print(tp.detalle_servicio())
        self.assertEqual(tp.coste_total(), 18.296794871794873)

    def test_revision_alarma(self):
        ra = RevisionAlarma(datetime.now(), 'Pepe', 30)
        print(ra.detalle_servicio())
        self.assertEqual(ra.coste_total(), 400.0)

if __name__ == '__main__':
    unittest.main()
