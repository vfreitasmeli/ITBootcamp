package exercicio3;

public class Cachorro extends Animal {

    public Cachorro(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz %s\n", nome, som);
    }
}
