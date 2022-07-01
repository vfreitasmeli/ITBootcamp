package exercicio3;

public class SonsApp {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Doguinho", "au au");
        Animal a2 = new Gato("Gatíneo", "miau");
        Vaca v3 = new Vaca("Mimosa", "muuuu"); // forma diferente de instanciar chamando a filha func igual

        a1.emitirSom();
        a2.emitirSom();
        v3.emitirSom();
    }


    /*
    anotacao pessoal: o som e nome sao comuns a todos os animais,
    logo fica declarado na classe abstrata junto com a funcao emitirSom, tambem comum a todos
     */
}
