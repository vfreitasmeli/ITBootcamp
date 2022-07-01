package pratica2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

}
