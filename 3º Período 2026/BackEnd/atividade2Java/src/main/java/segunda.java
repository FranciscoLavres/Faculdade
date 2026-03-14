//Crie um algoritmo que mostre o resultado exato de uma divisão
// entre números inteiros, a parte inteira da divisão e o resto da
// divisão.(Dica: casting).

import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        do {
            System.out.println("Digite o segundo número: ");
            num2 = input.nextDouble();
            if (num2 == 0){
                System.out.println("O segundo valor deve ser diferente de zero.");
            }
        } while (num2 == 0);

        double divisao = (num1/num2);
        int d = (int) divisao;

        System.out.println("Divisão: "+ (num1/num2));
        System.out.println("Parte inteira da divisão: "+ d);
        System.out.println("Resto da divisão: "+ (num1%num2));
    }
}
