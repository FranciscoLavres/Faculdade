'''
Peça ao usuário para digitar 10 números e armazene-os em uma lista. 
Depois, peça um número extra e diga quantas vezes ele aparece na lista
'''

num = input("Digite 10 número inteiros: ")
lista = num.replace(',', "").split()
lista = [int(i) for i in lista]

while len(lista) > 10 or len(lista) < 10:
    print("Você digitou uma quantia errada de nímeros.")
    num = input("Digite 10 número inteiros: ")
    lista = num.replace(',', "").split()
    lista = [int(i) for i in lista]

novo = input("Agora digite mais um número, para ver quantas vezes ele aparece: ")
print(f"Seu número apareceu {lista.count(int(novo))} vezes na lista.")