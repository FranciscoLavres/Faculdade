'''
Crie uma função calcular_desconto que receba o preço de um
produto e o percentual de desconto, e retorne o preço final.
Na main, simule um carrinho com 3 produtos diferentes, aplique
descontos distintos em cada um e exiba o total a pagar.
'''

def calcular_desconto(preco, desconto):
    valor = (desconto/100)*preco
    valorFinal = preco - valor
    print(f"Você deverá pagar R${valorFinal}")

calcular_desconto(int(input("Digite o valor do produto: ")), int(input("Digite o valor do desconto: ")))
