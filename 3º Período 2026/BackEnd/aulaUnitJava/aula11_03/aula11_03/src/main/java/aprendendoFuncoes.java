public class aprendendoFuncoes {
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int soma(int num3, int num4, int num5){
        return num3 + num4 + num5;
    }

    public static double soma(int num6, double num7){
        return num6 + num7;
    }

    public static void main(String[] arg){
        System.out.println(soma(5,9));
        System.out.println(soma(3,8,5));
        System.out.println(soma(1,9.6));
    }
}
