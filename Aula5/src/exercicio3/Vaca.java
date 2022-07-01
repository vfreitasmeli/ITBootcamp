package exercicio3;

import exercicio3.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {

    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s faz %s\n", nome, som);
    }

    @Override
    public void comerPasto() {
        System.out.printf("%s gosta de ficar no pasto e comer capim\n", nome);
    }
}
