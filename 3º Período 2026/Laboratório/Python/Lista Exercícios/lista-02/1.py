'''
Peça ao usuário para digitar uma lista de 10 nomes.
Em seguida, pergunte qual nome ele deseja procurar e diga se o nome está ou não na lista.

'''

nomes = input("Digite uma lista de 10 nomes, todos seguidos e com vírgula: ")
nomes = nomes.lower().replace(",", " ")
lista_nomes = (nomes.split())

while len(lista_nomes) > 10 or len(lista_nomes) < 10: 
    print("Você digitou uma quantia errada de nomes.")
    nomes = input("Digite uma lista de 10 nomes, todos seguidos e com vírgula: ")
    nomes = nomes.lower().replace(",", " ")
    lista_nomes = (nomes.split())

procura = input("Agora diga o nome que você procura: ")

if lista_nomes.count(procura.lower().strip()) == 0:
    print("O nome não está na lista.")
else:
    print("O nome aparece na lista")
