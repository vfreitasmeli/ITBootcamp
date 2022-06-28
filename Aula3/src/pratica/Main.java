package pratica;

public class Main {
    public static void main(String[] args) {
        //exercicio 3 - criar a classe
        // exercicio 4

        Pessoa pessoaEmptyConstructor = new Pessoa();
        Pessoa pessoaPartialConstructor = new Pessoa("Maria", 23, "xablau123");
        Pessoa pessoaFullConstructor = new Pessoa("John", 12, "noId", 108.5, 1.82);

        pessoaEmptyConstructor.showPersonEmpty();
        pessoaPartialConstructor.showPersonPartial();
        pessoaFullConstructor.showFullPerson();
        pessoaFullConstructor.calculaImc();
        pessoaFullConstructor.fullDataPersonMessages();

    }
}
