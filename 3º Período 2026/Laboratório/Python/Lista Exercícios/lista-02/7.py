'''
Peça ao usuário duas listas com 5 números cada. Crie uma terceira lista intercalando os elementos das duas.
Exemplo:
 Lista A: [1, 3, 5]
 Lista B: [2, 4, 6]
 Resultado: [1, 2, 3, 4, 5, 6]
'''

primeiraLista = input("Digite uma lista de elementos separados por vírgula: ").replace(",", " ").strip().split()

segundaLista = input("Digite uma segunda lista de elementos separados por vírgula: ").replace(",", " ").strip().split()

listaIntercalada = []

i = 0

while i < len(primeiraLista) and i < len(segundaLista):
    listaIntercalada.append(primeiraLista[i])
    listaIntercalada.append(segundaLista[i])
    i += 1

while i < len(primeiraLista):
    listaIntercalada.append(primeiraLista[i])
    i += 1

while i < len(segundaLista):
    listaIntercalada.append(segundaLista[i])
    i += 1

print(listaIntercalada)