import java.util.Scanner;

public class MatrizVezesCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int [3][3];

        //RECEBENDO VALORES PARA A MATRIZ
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.println("Escreva valores inteiros para cada posição da matriz ["+x+"] ["+y+"]: ");
                matriz[x][y] = input.nextInt() * 5;
            }
        }

        //IMPRIMINDO A MATRIZ AO FINAL:
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.print("|"+ matriz[x][y] + "|\t");
            }
            System.out.println();
        }

    }

}
