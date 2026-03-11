//Escreva um programa para ler 3 valores inteiros (considere que não serão
// lidos valores iguais)
//e escrevê-los em ordem crescente.

import java.util.Scanner;

public class sexta {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();

        while (num2 == num1) {
            System.out.println("Os valores não podem ser iguais.");
            System.out.println("Digite o segundo número: ");
            num2 = input.nextInt();
        }

        System.out.println("Digite o terceiro número: ");
        num3 = input.nextInt();

        while (num3 == num1 || num3 == num2) {
            System.out.println("Os valores não podem ser iguais.");
            System.out.println("Digite o terceiro número: ");
            num3 = input.nextInt();
        }

        int maior, meio, menor;

        if(num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num1 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        meio = num1 + num2 + num3 - maior - menor;

        System.out.println("Ordem crescente: "+menor+", "+meio+", "+maior+".");
    }
}
