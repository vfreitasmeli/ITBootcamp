package exercicio1;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        int resultado;


        // exercicio 1 - parte A
        try{
            resultado = b/a;
            System.out.println(resultado);
        } catch(Exception e){
            System.out.println("Ocorreu um erro");
        } finally{
            System.out.println("Programa finalizado");
        }

        // exercicio 1 - parte B
        try{
            if ( a == 0 ) throw new IllegalArgumentException("Nao pode ser dividido por zero");
            resultado = b/a;
            System.out.println(resultado);
        } catch(IllegalArgumentException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Programa finalizado");
        }
    }

}
