public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void engordar (double qtd){
        peso+=qtd;
    }

    public void emagrecer (double qtd){
        peso -= qtd;
    }

    public void crescer (double qtd){
        this.altura += qtd;
    }

    public void envelhecer(){
        if(idade > 21){
            idade++;
        } else{
            idade++;
            crescer(0.05);
        }
    }
}
