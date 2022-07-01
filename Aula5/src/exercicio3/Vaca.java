package exercicio3;

public class Vaca extends Animal{

    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz %s\n", nome, som);
    }
}
