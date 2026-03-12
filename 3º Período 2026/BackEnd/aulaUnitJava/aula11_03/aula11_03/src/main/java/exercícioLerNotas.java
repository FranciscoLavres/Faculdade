import java.util.Scanner;

public class exercícioLerNotas {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[10];
        double soma = 0;
        for ( int x = 0; x < vetor.length; x++){
            System.out.println("Digite a "+(x+1)+"º nota: ");
            vetor[x] = input.nextDouble();
            soma += vetor[x];
        }

        double media = soma / vetor.length;
        int contador = 0;
        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x]>media){
                contador++;
            }
        }

        System.out.println("A média da turma foi: "+media);

        System.out.println("A contagem foi de: "+ contador);

    }
}
