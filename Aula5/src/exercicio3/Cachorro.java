package exercicio3;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: " + getSom());
    }
}
