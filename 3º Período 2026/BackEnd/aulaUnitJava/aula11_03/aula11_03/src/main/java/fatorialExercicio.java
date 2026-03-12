import java.util.Scanner;

public class fatorialExercicio {

    public static long fatorial (int num){
        if( num == 0 || num == 1){
            return 1;
        } else{
            return num * fatorial(num-1);
        }
    }

    public static void main(String[] arg){

        System.out.println(fatorial(9));
    }
}

