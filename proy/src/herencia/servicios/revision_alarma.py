from servicio import Servicio


class RevisionAlarma(Servicio):
    
    def __init__(self, fh_inicio, cliente, nro_alarmas_a_revisar):
        super().__init__('Revisor Especialista Contraincendios', fh_inicio, cliente)
        self.nro_alarmas_a_revisar = nro_alarmas_a_revisar
    
    def get_nro_alarmas_a_revisar(self):
        return self.nro_alarmas_a_revisar
    
    def coste_material(self):
        return 0
    
    def coste_mano_obra(self):
        return (self.nro_alarmas_a_revisar/3) * 40
    
    def coste_total(self):
        return self.coste_mano_obra()
    
    def detalle_servicio(self):
        return f'''
        REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS
        Cliente: {self.cliente}
        Fecha revisión: {self.fh_inicio}
        ------------------------------------------
        TOTAL: ...............{self.coste_total()}
        ------------------------------------------
        '''