//Crie um algoritmo que verifique se um número é positivo,
//negativo ou igual a zero.

import java.util.Scanner;

public class quarta {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número e diremos se é positivo, negativo" +
                " ou igual a zero: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("Seu número é positivo.");
        } else if (num < 0) {
            System.out.println("Seu número é negativo.");
        } else {
            System.out.println("Seu número é igual a zero.");
        }
    }
}
