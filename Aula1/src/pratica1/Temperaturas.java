package pratica1;

public class Temperaturas {
    public static void main(String[] args) {

        String cidades[] = {"Londres", "Madrid", "Nueva York",
                "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Tokio"  };

        int temperaturas[][] = {
                {-2, 33}, { -3, 32},
                {-8, 27}, {4, 37}, {6, 42},
                {5, 43}, {-20, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int menorTemperatura = temperaturas[0][0];
        int maiorTemperatura = 0;
        int cidadeMenorTemp = 0;
        int cidadeMaiorTemp = 0;

        for(int index = 0; index < cidades.length; index++) {
            if(temperaturas[index][1] > maiorTemperatura) {
                maiorTemperatura = temperaturas[index][1];
                cidadeMaiorTemp = index;
            }
            if(temperaturas[index][0] < menorTemperatura) {
                menorTemperatura = temperaturas[index][0];
                cidadeMenorTemp = index;
            }
        }

        System.out.printf("%s possui a maior temperatura %d graus\n", cidades[cidadeMaiorTemp], maiorTemperatura);
        System.out.printf("%s possui a menor temperatura %d graus\n", cidades[cidadeMenorTemp], menorTemperatura);
        //template literals funciona aqui - pesquisar printf

    }
}
