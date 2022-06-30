package exercicio2;

import java.util.ArrayList;
import java.util.List;
import exercicio2.Pereciveis;
import exercicio2.NaoPereciveis;

public class Distribuidora {
    public static void main(String[] args) {

        List<Produtos> produtos = new ArrayList<>();





//        Pereciveis p2 = new Pereciveis("Batata", 10.00);
//
//        p2.setDiasParaVencer(3);
//
//        p2.calcular(1);
//
//        System.out.println(p2);
       produtos.add(new Pereciveis("Batata", 2.00));
       produtos.add(new NaoPereciveis("Notebook", 2500.25));




//
//
//        for (Produtos produto: produtos) {
//            System.out.println(produto.calcular(2));
//        }
//
//        produtos.stream()
//                .map(p -> p.calcular(2))
//                .forEach(System.out::println);
//
//        produtos.stream().forEach(System.out::println);

    }
}
