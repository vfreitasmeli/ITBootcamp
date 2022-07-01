package pratica2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        listaVeiculos.add(new Veiculo("Focus", "Ford", 1200));
        listaVeiculos.add(new Veiculo("Explorer", "Ford", 2500));
        listaVeiculos.add(new Veiculo("Uno", "Fiat", 500));
        listaVeiculos.add(new Veiculo("Chronos", "Fiat", 1000));
        listaVeiculos.add(new Veiculo("Torino", "Fiat", 1250));
        listaVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));

        Garagem garage = new Garagem(listaVeiculos);

        garage.showVehicles();
        garage.orderByPriceAsc();
        garage.orderByLabel();
        garage.priceUntilOneThousand();
        garage.priceOverOneThousand();
        garage.averagePrice();

        // listaVeiculos.forEach(System.out::println);


    }




}
