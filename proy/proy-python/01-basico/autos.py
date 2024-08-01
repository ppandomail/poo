"""

Ejercicio:

Dada una concesionaria de autos, 5 clientes van a pedir un auto, debe preguntarle
Nombre y apellido del comprador, marca, puertas y color.
Marcas posibles y sus precios: Ford 100M, Chevrolet 120M y Fiat 180M
Por la cantidad de puertas se agrega un precio: 2 50M, 4 65M y 5 78M
Dependiendo del color se deben sumar: blanco 10M, azul 20M y negro 30M
Deben imprimirse los datos de cada compra y el precio total

"""

def precio_marca(marca):
    if marca == 'Ford':
        return 100000
    if marca == 'Chevrolet':
        return 120000
    if marca == 'Fiat':
        return 180000
    return 0

def precio_puertas(cant_puertas):
    if cant_puertas == 2:
        return 50000
    if cant_puertas == 4:
        return 65000
    if cant_puertas == 5:
        return 78000
    return 0

def precio_color(color):
    if color == 'blanco':
        return 10000
    if color == 'azul':
        return 20000
    if color == 'negro':
        return 30000
    return 0

def pedido(cantidad):
    total = 0
    for i in range(1, cantidad + 1):
        nom = input("Nombre: ")
        ape = input("Apellido: ")
        marca = input("Marca: ")
        puertas = int(input("Puertas: "))
        color = input("Color: ")
        precio = precio_marca(marca) + precio_puertas(puertas) + precio_color(color)
        print(nom, ape, marca, puertas, color, precio)
        total += precio
    print("TOTAL: " + str(total))

pedido(2)
