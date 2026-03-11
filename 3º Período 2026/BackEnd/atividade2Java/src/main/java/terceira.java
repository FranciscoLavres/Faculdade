//Uma revendedora de carros paga a seus vendedores um salário fixo por mês, mais  uma  comissão  também  fixa  para
// cada  carro  vendido  e  mais  5% do  valor  das  vendas  por  ele efetuadas.
//Escrever um algoritmo que leia o número de  carros por  ele vendidos, o valor total de suas vendas,
// o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class terceira {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcule o seu salário total.");
        System.out.println("Salário fixo: R$1.800,00");
        System.out.println("Comissão por carro: R$200,00 + 5% do  valor  das  vendas.");

        System.out.println("Digite quantos carros você vendeu: ");
        int carros = input.nextInt();

        System.out.println("Digite o valor total, em reais, de suas vendas: ");
        double vendas = input.nextDouble();

        double media = (vendas/carros);

        double total = 1800 + (carros * 200) + (vendas * 0.05);

        System.out.println("No total, você receberá: R$"+ total +
                "\nSua média de vendas por carros é de: "+media);
    }
}
