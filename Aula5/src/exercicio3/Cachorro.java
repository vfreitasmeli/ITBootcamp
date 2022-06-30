package exercicio3;

public class Cachorro extends Animal {

    public Cachorro(String som) {
        super(som);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: " + getSom());
    }
}
