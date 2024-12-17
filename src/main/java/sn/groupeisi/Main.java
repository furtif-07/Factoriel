package sn.groupeisi;

import static sn.groupeisi.Factoriel.factoriel;

public class Main {
    public static void main(String[] args) {
        int nombre = 7;
        int calculateFactoriel = factoriel(nombre);
        System.out.println(calculateFactoriel);
    }
}