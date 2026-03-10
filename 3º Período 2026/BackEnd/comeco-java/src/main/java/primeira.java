//Escreva um algoritmo que atribua valores a variáveis num1, num2 e num3,
// calcule sua média na variável media e exiba para o usuário o
// resultado.

import java.util.Scanner;

public class primeira {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        float num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Calcule a sua média!!");
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextFloat();

        System.out.println("Digite o terceiro e ultimo número: ");
        num3 = input.nextFloat();

        System.out.println("Ótimo, a média dos valores resultou em: "+(num1+num2+num3)/3);

    }
}
