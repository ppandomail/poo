from servicio import Servicio


class TrabajoPintura(Servicio):
    
    def __init__(self, trabajador, fh_inicio, cliente, superficie, precio_pintura):
        super().__init__(trabajador, fh_inicio, cliente)
        self.superficie = superficie
        self.precio_pintura = precio_pintura
    
    def get_superficie(self):
        return self.superficie
    
    def get_precio_pintura(self):
        return self.precio_pintura
    
    def coste_material(self):
        return (self.superficie / 7.8) * self.precio_pintura
    
    def coste_mano_obra(self):
        return (self.superficie / 10) * 9.5
    
    def coste_total(self):
        return self.coste_material() + self.coste_mano_obra() + self.coste_adicional()
     
    def coste_adicional(self):
        if self.superficie < 50:
            return (self.coste_material() + self.coste_mano_obra()) * 15 / 100
        return 0
        
    def detalle_servicio(self):
        return f'''
        TRABAJO DE PINTURA
        Cliente: {self.cliente}
        Fecha de inicio: {self.fh_inicio}
        --------------------------------------------
        Pintor: {self.trabajador}
        Coste Material .......{self.coste_material()}
        Coste Mano de Obra ...{self.coste_mano_obra()}
        Coste Adicional .......{self.coste_adicional()}
        Coste Total ..........{self.coste_total()}
        --------------------------------------------
        '''
