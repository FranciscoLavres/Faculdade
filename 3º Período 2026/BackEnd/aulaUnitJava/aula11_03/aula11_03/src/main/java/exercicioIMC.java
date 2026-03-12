import java.util.Scanner;

public class exercicioIMC {

    public static double imc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.println("IMC: "+(peso/(altura*altura)));
        return (peso/(altura*altura));
    }

    public static void main(String[] arg){
        imc();
    }
}

