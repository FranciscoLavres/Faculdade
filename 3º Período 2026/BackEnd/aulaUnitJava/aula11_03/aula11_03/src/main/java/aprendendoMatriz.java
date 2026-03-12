import java.util.Scanner;

public class aprendendoMatriz {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int contador = 0;

        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.print("Digite o valor para posição ["+x+"]["+y+"]: ");
                matriz[x][y] = input.nextInt();
                if (matriz[x][y] > 10){
                    contador++;
                }
            }
        }
        System.out.print(contador+" valores maiores que 10.");
        for (int x = 0; x  < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.print(matriz[x][y]);
            }
        }
    }
}
