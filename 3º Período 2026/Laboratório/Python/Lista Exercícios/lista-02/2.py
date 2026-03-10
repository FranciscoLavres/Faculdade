#Crie um programa que receba 5 números e exiba a lista na ordem inversa

num = input("Digite 5 números, que eles aparecerão na ordem inversa digitada: ")
lista_num = num.replace(",", "").split()

while len(lista_num) > 5 or len(lista_num) < 5:
    print("Você digitou uma quantidade errada de números.")
    num = input("Digite 5 números, que eles aparecerão na ordem inversa digitada: ")
    lista_num = num.replace(",", "").split()

lista_int = [int(i) for i in lista_num] #faz a lista virar inteiro
print(lista_int[::-1])


