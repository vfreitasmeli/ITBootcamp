package exercicio2;

public class NaoPereciveis extends Produtos {
    int diasParaVencer;

    public NaoPereciveis(String nome, double preco) {
        super(nome, preco);
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        return super.calcular(quantidadeDeProdutos);
    }
}
