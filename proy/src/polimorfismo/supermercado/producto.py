class Producto:
    
    def __init__(self, marca, precio):
        self.marca = marca
        self.precio = precio
    
    def get_marca(self):
        return self.marca
    
    def set_marca(self, marca):
        self.marca = marca
    
    def get_precio(self):
        return self.precio
    
    def set_precio(self, precio):
        self.precio = precio
    
    def __str__(self):
        return f'Marca: {self.marca}, Precio: $ {self.precio}'