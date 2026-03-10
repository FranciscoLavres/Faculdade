'''
Implemente um programa com o seguinte menu:
1 - Adicionar item
2 - Remover item
3 - Mostrar lista
4 - Sair
Use uma lista para armazenar os itens. O programa deve continuar até que o usuário escolha a opção 4.
'''

lista = []

while True:
    valor = input("1 - Adicionar\n"
                  "2 - Remover\n"
                  "3 - Mostrar lista\n"
                  "4 - Sair\n"
                  "Valor: ")

    if valor == "1":
        ad = input("Diga o que quer adicionar: ")
        lista.append(ad)

    elif valor == "2":
        remo = input("Diga o que quer remover: ")
        lista.remove(remo)

    elif valor == "3":
        print(lista)

    elif valor == "4":
        print("Saindo do sistema...")
        break

    else:
        print("Digite um valor válido.")