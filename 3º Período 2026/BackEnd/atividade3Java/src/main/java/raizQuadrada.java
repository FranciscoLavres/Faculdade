import java.lang.Math;
import java.util.Random;


public class raizQuadrada {
    public static void main(String[] arg) {

        Random num1 = new Random();
        int num = num1.nextInt();
        System.out.println("Raíz de "+num+" é "+Math.sqrt(num));
    }

}
