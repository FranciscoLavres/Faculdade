public class Exemplo2 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Francisco", 20, 80, 1.65);

        System.out.println(p1.getNome()+" "+p1.getIdade()+" "+p1.getAltura());
        p1.envelhecer();
        System.out.println(p1.getNome()+" "+p1.getIdade()+" "+p1.getAltura());
    }
}
