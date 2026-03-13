'''
Escreva uma função calcular_imc que receba peso e altura e retorne o IMC calculado. Crie uma segunda função classificar_imc que receba o valor do IMC e retorne a classificação ("Abaixo do peso", "Normal", "Sobrepeso" ou "Obesidade").
Use a main para orquestrar as chamadas.
'''

def calcular_imc(peso, altura):
    imc = peso/(altura*altura)

    return imc

def classificar_imc(valor):
    if valor <= 18:
        print("Está abaixo do peso.")
    elif valor >= 25:
        print("Está com sobrepeso.")
    else:
        print("Seu peso está normal.")

valor = calcular_imc(float(input("Digite seu peso: ")), float(input("Digite a sua altura: ")))
classificar_imc(valor)

if __name__ == "__calcular_imc__":
    calcular_imc()
