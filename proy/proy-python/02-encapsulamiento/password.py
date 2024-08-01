class Password:
  
  def __init__(self, valor="xxxxxxxx"):
    self.__longitud = len(valor)
    self.__valor = valor
  
  def isFuerte(self):
    d = 0
    m = 0
    M = 0
    for caracter in self.__valor:
      if caracter.isdigit():
        d = d+1
      elif caracter.islower():
        m = m+1
      elif caracter.isupper():
        M = M+1
    return d >= 2 and m >= 2 and M >= 2

print(Password("HolaMundo123!!!").isFuerte())
print(Password("Gr1ll0").isFuerte())
print(Password("1234").isFuerte())
print(Password("asdf").isFuerte())
