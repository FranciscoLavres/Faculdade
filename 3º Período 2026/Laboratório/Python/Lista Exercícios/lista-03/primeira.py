'''
Crie uma função chamada contar_vogais que receba uma string e retorne a
quantidade de vogais encontradas. Na main, peça uma frase ao usuário e exiba o resultado.

'''

def contarVogais(frase):

    vogais = "aeiouAEIOU"
    contador = 0

    for letra in frase:
        if letra in vogais:
            contador += 1

    print(f"Quantidade de vogais: {contador}")


def main():
    contarVogais(input("Digite uma frase: "))

main()