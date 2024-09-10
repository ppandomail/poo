def encriptar(mensaje, desplazamiento):
    abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    encriptado = ""
    for letra in mensaje:
        index = abcedario.index(letra) + desplazamiento
        if index >= len(abcedario):
            index = index - len(abcedario)
        encriptado += abcedario[index]
    return encriptado


print(encriptar("HOLAWXY", 4))  # JQNCYZA
