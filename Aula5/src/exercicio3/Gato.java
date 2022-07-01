package exercicio3;

import exercicio3.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {
    public Gato(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz %s\n", nome, som);
    }

    @Override
    public void comerCarne() {
        System.out.printf("%s gosta de comer carne\n", nome);
    }
}
