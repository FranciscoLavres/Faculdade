import java.util.Scanner;

public class SomaVetores {

    public static int somaVetor(int[] vetor){

        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos valores vc vai colocar no vetor?: ");
        int n = input.nextInt();

        int[] v = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o "+ (i+1) +"º número: ");
            v[i] = input.nextInt();
        }
        int resultado = somaVetor(v);
        System.out.println("Valor da soma: " + resultado);
    }
}
