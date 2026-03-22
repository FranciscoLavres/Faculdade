public class Conta {

    private String nome;
    private double saldo;

    public Conta (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta (String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta (){}

    public void sacar(double qtd){
        if (qtd <= saldo) {
            saldo -= qtd;
        } else{
            System.out.println("Não pode sacar.");
        }
    }

    public void depositar(double qtd){
        saldo += qtd;
    }
}
