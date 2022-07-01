package exercicio3;

public class SonsApp {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Doguinho", "au au");
        Gato gato = new Gato("Gatíneo", "miau");
        Vaca vaca = new Vaca("Mimosa", "muuuu");

        cachorro.emitirSom();
        cachorro.comerCarne();

        gato.emitirSom();
        gato.comerCarne();

        vaca.emitirSom();
        vaca.comerPasto();
    }


    /*
    anotacao pessoal: o som e nome sao comuns a todos os animais,
    logo fica declarado na classe abstrata junto com a funcao emitirSom, tambem comum a todos

    com a interface implementada eu nao consigo instanciar diretamente pela classe abstrata, preciso chamar diretamente
    pela classe filha onde a interface está.
     */
}
