'''
Receba uma lista de 6 números (positivos e negativos) do usuário. 
Crie uma nova lista contendo apenas os números positivos.
'''

num = input("Digite até 6 números tanto positivos quanto negativos: ")
lista = num.replace(",", "").split()

listaPos = [int(i) for i in lista]

for i in listaPos:
    if i < 0:
        listaPos.remove(i)

print(listaPos)