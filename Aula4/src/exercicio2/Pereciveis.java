package exercicio2;

public class Pereciveis extends Produtos {
    int diasParaVencer;

    public Pereciveis(String nome, double preco) {
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
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", resultado=" + resultado +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {

        switch (diasParaVencer) {
            case 1:
                resultado = super.calcular( quantidadeDeProdutos )/ 4;
                break;
            case 2:
                resultado = super.calcular(quantidadeDeProdutos) / 3;
                break;
            case 3:
                resultado = super.calcular(quantidadeDeProdutos) / 2;
                break;
            default:
                resultado = super.calcular(quantidadeDeProdutos);
                break;
        }
        return resultado;
    }
}
