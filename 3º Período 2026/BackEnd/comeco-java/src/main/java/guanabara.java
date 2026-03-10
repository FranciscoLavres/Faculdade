import java.util.Scanner;

public class guanabara {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("numero: ");
        int num1 = input.nextInt();

       // System.out.println("numero 2: ");
       // int num2 = input.nextInt();

        System.out.println("Antecessor: "+ (num1-1) +". sucessor: "+ (num1+1));
    }
}
