num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
operador = input("Digite a operação: ")

while operador != "+" or operador != "-" or operador!= "*" or operador!="/":
    print("Você digitou um operador inválido.")
    operador = input("Digite a operação: ")

def calculadora (num1, num2, operador):
    if operador == "+":
        return num1 + num2
    elif operador == "-":
        return num1 - num2
    elif operador == "*":
        return num1*num2
    elif operador == "/":
        return num1 / num2
    else:
        return "Operador não é válido."

print(f"Sua operação resultou em {calculadora(num1, num2, operador)}.")