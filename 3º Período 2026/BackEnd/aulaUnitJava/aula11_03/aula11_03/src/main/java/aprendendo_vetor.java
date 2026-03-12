import java.util.Scanner;

public class aprendendo_vetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for ( int x = 0; x < numeros.length; x++){
            System.out.println("Digite o "+(x+1)+"º número: ");
            numeros[x] = input.nextInt();
        }

        System.out.println("---------Ordem Inversa----------");

        for (int x = numeros.length-1; x >= 0; x--){
            System.out.println(numeros[x]);
        }
    }
}
