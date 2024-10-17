import unittest

from parking import Parking

class TestParking(unittest.TestCase):

    def test_nombre_parking(self):
        parking = Parking('Parking Centro', 10)
        self.assertEqual(parking.get_nombre(), 'Parking Centro')

    def test_parking_sin_patentes(self):
        parking = Parking('Parking Centro', 10)
        self.assertEqual(parking.get_plazas_ocupadas(), 0)

    def test_parking_con_una_patente(self):
        parking = Parking('Parking Centro', 10)
        parking.entrada('AB123CD', 2)
        self.assertEqual(parking.get_plazas_ocupadas(), 1)

    def test_parking_entrada_salida(self):
        parking = Parking('Parking Centro', 10)
        parking.entrada('AB123CD', 2)
        self.assertEqual(parking.salida('AB123CD'), 2)
        self.assertEqual(parking.get_plazas_ocupadas(), 0)

    def test_parking_entrada_con_patente_incorrecta(self):
        parking = Parking('Parking Centro', 10)
        with self.assertRaises(Exception) as context:
            parking.entrada('AB', 2)
        self.assertEqual(str(context.exception), 'Patente incorrecta')

    def test_parking_entrada_con_plaza_ocupada(self):
        parking = Parking('Parking Centro', 10)
        parking.entrada('AB123CD', 2)
        with self.assertRaises(Exception) as context:
            parking.entrada('AB456CD', 2)
        self.assertEqual(str(context.exception), 'Plaza ocupada')

    def test_parking_entrada_con_patente_repetida(self):
        parking = Parking('Parking Centro', 10)
        parking.entrada('AB123CD', 2)
        with self.assertRaises(Exception) as context:
            parking.entrada('AB123CD', 5)
        self.assertEqual(str(context.exception), 'Patente repetida')

    def test_parking_salida_con_patente_inexistente(self):
        parking = Parking('Parking Centro', 10)
        with self.assertRaises(Exception) as context:
            parking.salida('AB123CD')
        self.assertEqual(str(context.exception), 'Patente no existente')

    def test_parking_str(self):
        parking = Parking('Parking Centro', 10)
        parking.entrada('AB123CD', 8)
        print(parking)

if __name__ == '__main__':
    unittest.main()
