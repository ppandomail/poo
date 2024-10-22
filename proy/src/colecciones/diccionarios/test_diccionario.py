import unittest

from diccionario import Diccionario

class TestDiccionario(unittest.TestCase):

  def test_palabra_en_diccionario(self):
    diccionario = Diccionario()
    diccionario.nuevo_par('casa', 'house')
    self.assertEqual(diccionario.traduce('casa'), 'house')

  def test_palabra_inexistente_en_diccionario(self):
    diccionario = Diccionario()
    self.assertEqual(diccionario.traduce('casa'), None)

  def test_primera_letra_traduccion(self):
    diccionario = Diccionario()
    diccionario.nuevo_par('auto', 'car')
    diccionario.nuevo_par('libro', 'book')
    self.assertEqual(diccionario.primera_letra_traduccion('libro'), 'b')

if __name__ == '__main__':
  unittest.main()
