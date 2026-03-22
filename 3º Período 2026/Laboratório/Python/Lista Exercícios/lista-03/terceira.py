'''
Crie uma função eh_primo que receba um número inteiro e retorne True se ele for primo ou False caso contrário. Na main,
exiba todos os números primos entre 1 e 50 usando a função.
'''

def eh_primo(numero):

    if numero <= 1:
        print("Não é primo")
    elif numero % i == 0 and i != numero:
        print("Não é primo")
    else:
        print("É primo")

def main():
    valor = int(input("Digite um número de 1 a 50 e direi se é primo: "))
    eh_primo(valor)

if __name__ == "__main__":
    main()