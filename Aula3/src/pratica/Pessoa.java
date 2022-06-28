package pratica;

public class Pessoa {
    // exercicio 1
    String nome;
    int idade;
    String id;
    double peso;
    double altura;
    double resultadoImc;
    String msgImc;

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

    public void showFullPerson() {
        System.out.printf("Nome: %s, idade: %d, id: %s, peso: %.2f , altura: %.2f ", nome, idade, id, peso, altura);
    }

    public void calculaImc() {
        resultadoImc = peso / Math.pow(altura, (double) 2);
        System.out.printf("O resultado do IMC é %.2f\n", resultadoImc);
    }

    public void fullDataPersonMessages() {
        String mensagemIdade = (idade < 18) ? "menor de idade" : "maior de idade";
        if(resultadoImc < 20) {
            msgImc = "está abaixo do peso";
        } else if (resultadoImc > 21 && resultadoImc < 25 ) {
            msgImc = "está com peso ideal";
        } else {
            msgImc = "está com sobrepeso";
        }
        System.out.printf("%s, tem %d anos e é %s. Seu peso é de %.2f kgs e tem %.2f cm de altura.\n" +
                "O resultado do seu IMC é %.2f, o que indica que %s. Seu id é %s.\n"
                , nome, idade, mensagemIdade, peso, altura, resultadoImc, msgImc, id);
    }


}
