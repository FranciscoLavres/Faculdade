import java.util.ArrayList;
import java.util.Scanner;

public class aprendendoListas {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();

        for (int x = 0; x < 5; x++) {
            System.out.println("Digite valor: ");
            lista.add(input.nextInt());
        }

        System.out.println("_-------Ordem Inversa---------");

        for (int x = lista.size()-1; x >= 0; x--){
            System.out.println(lista.get(x));
        }
    }
}
