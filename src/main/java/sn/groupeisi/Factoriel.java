package sn.groupeisi;

// Function to calcul factoriel
public class Factoriel {
    public static int factoriel(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factoriel(x - 1);
    }
}
