"""Pruebas unitarias del juego de estrategia"""

import unittest

from soldado import Soldado


class Pruebas(unittest.TestCase):

    # Soldado
    def test_puede_atacar(self):
        """Los soldados estan en la misma posicion (cuerpo a cuerpo)
        y por lo tanto se pueden atacar"""
        s1 = Soldado(1)
        s2 = Soldado(1)
        self.assertTrue(s1.puede_atacar(s2))
        self.assertTrue(s2.puede_atacar(s1))

    def test_no_puede_atacar(self):
        """Los soldados estan fuera de alcance"""
        s1 = Soldado(1)
        s2 = Soldado(3)
        self.assertFalse(s1.puede_atacar(s2))
        self.assertFalse(s2.puede_atacar(s1))

    def test_no_se_puede_atacar_a_si_mismo(self):
        s1 = Soldado(1)
        s2 = Soldado(3)
        self.assertFalse(s1.puede_atacar(s1))
        self.assertFalse(s2.puede_atacar(s2))

    def test_no_puede_atacar_sin_energia(self):
        """Uno de los soldados ataca hasta quedarse sin energia"""
        s1 = Soldado(1)
        s2 = Soldado(1)
        for _ in range(10):
            s1.atacar(s2)
        self.assertFalse(s1.puede_atacar(s2))
        self.assertEqual(100, s2.get_salud())

    def test_soldados_iguales(self):
        s1 = Soldado(1)
        s2 = Soldado(1)
        self.assertTrue(s1 == s2)

    def test_soldados_no_iguales(self):
        s1 = Soldado(1)
        s2 = Soldado(1)
        s1.atacar(s2)
        self.assertFalse(s1 == s2)

    def test_soldado_str(self):
        s1 = Soldado(1)
        s2 = Soldado(10)
        print(s1)
        print(s2)


unittest.main()
