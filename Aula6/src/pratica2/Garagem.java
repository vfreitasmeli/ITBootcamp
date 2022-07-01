package pratica2;

import java.util.Comparator;
import java.util.List;

public class Garagem {
    public List<Veiculo> listaVeiculos;

    public Garagem(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void showVehicles() {
        listaVeiculos.forEach(System.out::println);
    }

    //ordernado pelo preco ver Classe Veiculo CompareTo
    public void orderByPriceAsc() {
        listaVeiculos.stream().sorted().forEach(System.out::println);
    }

    // ordenado por marca
    public void orderByLabel() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getMarca)).forEach(System.out::println);
    }

    // preco ate 1000
    public void priceUntilOneThousand() {
        listaVeiculos.stream()
                .filter((v -> v.getPreco() < 1000))
                .sorted().forEach(System.out::println);
    }

    //preco maior ou igual a 1000
    public void priceOverOneThousand() {
        listaVeiculos.stream()
                .filter((v -> v.getPreco() >= 1000))
                .sorted().forEach(System.out::println);
    }

    //preco medio total
    public void averagePrice() {
        double media = listaVeiculos.stream().mapToDouble(Veiculo::getPreco).average().getAsDouble();

        System.out.printf("A média de preço dos veículos é R$ %.2f \n", media);
    }

}
