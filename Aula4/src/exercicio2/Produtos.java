package exercicio2;
// Parte A
public class Produtos {
    String nome;
    double preco;
    double resultado;

    //constructor
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    // method
    public double calcular(int quantidadeDeProdutos) {
        resultado = preco * quantidadeDeProdutos;
        return resultado;
    }
}
