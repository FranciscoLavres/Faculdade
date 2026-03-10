'''
Peça uma lista de nomes ao usuário. Em seguida, pergunte qual nome ele deseja
substituir e pelo quê. Faça a substituição e mostre a nova lista.
'''

nomes = input("Digite uma lista de nomes: ").replace(",", "").lower()

subs = input("Digite um nome que você quer adicionar: ").lower().strip()

rem = input("E quer adicionar no lugar de qual nome?: ").lower().strip()

while rem not in nomes:
    print("Escolha um nome presente na lista para remover.")
    rem = input("E quer adicionar no lugar de qual nome?: ").lower().strip()

nomesL = nomes.replace(rem, subs).split()
print(f"Sua nova lista de nomes é esta: {nomes.replace(rem, subs).split()}")