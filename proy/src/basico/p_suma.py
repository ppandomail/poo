def add(a, b):
    print(a + b)


def add2(a, b):
    return a + b


def add3(n):
    acum = 0
    for x in range(n+1):
        acum += x
    return acum


add(2, 3)
print(add2(2, 3))
print(add3(10))
