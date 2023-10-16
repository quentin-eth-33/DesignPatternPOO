package designPattern.boulangerie;

public class Vendeur implements VendeurObserver {
    private String nom;

    public Vendeur(String nom) {
        this.nom = nom;
    }

    @Override
    public void update() {
        System.out.println("Vendeur " + nom + " déclenche la fabrication de gâteaux !");
        // Logique pour déclencher la fabrication de gâteaux
    }
}
