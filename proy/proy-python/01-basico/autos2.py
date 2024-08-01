"""

Ejercicio:

Dado el problema anterior del concesionario de autos, debemos modificarlo teniendo en cuenta:
1. Ya no sabemos cuantos clientes tenemos.
2. Si el pedido no es uno de los autos en venta, entonces debe volver a preguntar hasta que si lo sea
3. Lo mismo con la cantidad de puertas y los colores
4. Al final se pregunta si hay otro cliente o no. Si hay otro cliente entonces vuelve a preguntar todo.
5. Si la cantidad de clientes fue:
    5.1 0 a 5 personas no hay descuento
    5.2 6 a 10 personas hay un descuento del 10%
    5.3 11 a 50 personas, el descuento es del 15%
    5.4 Mas de 50 personas, el descuento es del 18%
6. Solo se va a mostrar que se vendio al final programa.

"""

precio_marca = {'ford': 100000, 'chevrolet': 120000, 'fiat': 180000}
precio_puertas = {'2': 50000, '4': 65000, '5': 78000}
precio_color = {'blanco': 10000, 'azul': 20000, 'negro': 30000}
ventas = list()

def pedidos():
    hay_otro_cliente = 'S'
    while hay_otro_cliente == 'S':
        venta = dict()
        venta['nom'] = input("Nombre: ")
        venta['ape'] = input("Apellido: ")
        venta['marca'] = validar('marca', precio_marca)
        venta['puertas'] = validar('puertas', precio_puertas)
        venta['color'] = validar('color', precio_color)
        venta['precio'] = precio_marca[venta['marca']]
        venta['precio'] += precio_puertas[venta['puertas']]
        venta['precio'] += precio_color[venta['color']]
        ventas.append(venta)
        hay_otro_cliente = input('Hay otro cliente (S/N): ')

def validar(clave, diccionario):
    valor = input(clave.capitalize() + ": ").lower()
    while valor not in diccionario.keys():
        valor = input(clave.capitalize() + ": ").lower()
    return valor

def aplicar_descuento():
    cant = len(ventas)
    if cant in range(0, 2):
        desc = 0
    elif cant in range(2, 11):
        desc = 10
    elif cant in range(11, 51):
        desc = 15
    else:
        desc = 18
    for venta in ventas:
        venta['precio'] -= venta['precio'] * desc / 100

def calcular_total():
    total = 0
    for venta in ventas:
        total += venta['precio']
    return total

pedidos()
print(ventas)
aplicar_descuento()
print(ventas)
print("PRECIO TOTAL: $" + str(calcular_total()))
