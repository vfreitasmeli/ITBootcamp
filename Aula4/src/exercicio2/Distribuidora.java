package exercicio2;

import java.util.ArrayList;
import java.util.List;
import exercicio2.Pereciveis;
import exercicio2.NaoPereciveis;

public class Distribuidora {
    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();

        produtos.add(new Pereciveis("Batata", 2.00));
        produtos.add(new NaoPereciveis("Notebook", 2500.25));


        for (Produtos produto: produtos) {
            System.out.println(produto.calcular(2));
        }


    }
}
