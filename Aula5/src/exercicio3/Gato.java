package exercicio3;

public class Gato extends Animal {

    public Gato(String som) {
        super(som);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato: " + som);
    }
}
