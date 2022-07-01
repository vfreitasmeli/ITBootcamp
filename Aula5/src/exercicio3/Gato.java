package exercicio3;

public class Gato extends Animal {
    public Gato(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz %s\n", nome, som);
    }
}
