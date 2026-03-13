def calcular_frete(peso, km):
    taxa = 0
    if peso < 1:
        taxa = 10
    elif 1 <= peso <= 5:
        taxa = 18
    else:
        taxa = 30

    if km > 100:
        taxa += (km - 100) * 0.05
    print(f"Você deverá pagar R${taxa}")
    return taxa

calcular_frete(float(input("Digite o peso: ")), int(input("Digite a distância em Km: ")))