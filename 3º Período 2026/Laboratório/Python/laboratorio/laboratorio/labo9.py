numeros = [10, 20, 30, 40, 50]

print(numeros[1:4]) # [20, 30 , 40]

print(numeros[:3]) # [10, 20, 30]

print(numeros[2:]) # [30, 40, 50]

print(numeros[::2]) # [10, 30, 50]


# COPIANDO LISTAS

lista1 = [1, 2, 3]
lista2 = lista1.copy()
lista3 = lista1[:]
print(lista2, lista3)
'''
copy( ) e [:] são inguais, é uma atribuição direta
(lista2 = lista1)
'''