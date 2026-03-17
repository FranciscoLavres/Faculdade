import java.util.Scanner;

public class MenorNumero {

    public static int menorValor(){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Descubra o MENOR valor entre 3!! ===");
        System.out.println("Digite o primeiro valor: "); int num1 = input.nextInt();
        System.out.println("Digite o segundo valor: "); int num2 = input.nextInt();
        System.out.println("Digite o terceiro valor: "); int num3 = input.nextInt();

        int menor = num1;

        if (menor > num2) {
            menor = num2;
        }
        if (menor > num3) {
            menor = num3;
        }
        return menor;
    }

    public static void main(String[] arg) {
        System.out.println("O menor valor é: "+menorValor());
    }


}
