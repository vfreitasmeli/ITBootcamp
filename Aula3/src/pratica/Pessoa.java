package pratica;

public class Pessoa {
    // exercicio 1
    String nome;
    int idade;
    String id;
    double peso;
    double altura;

    // exercicio 2 - constructors
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    // methods
    public void showPersonEmpty() {
        System.out.println();
    }

    public void showPersonPartial() {
        System.out.printf("Nome: %s, idade: %d, id: %s\n", nome, idade, id);
    }

    public void showFullPeroson() {
        System.out.printf("Nome: %s, idade: %d, id: %s, peso: %.2f , altura: %.2f ", nome, idade, id, peso, altura);
    }

    public void calculaImc() {
        double resultado = peso / Math.pow(altura, (double) 2);
        System.out.printf("O resultado do IMC é %.2f", resultado);
    }


}
