package designPattern.boulangerie;

public class Vendeur implements VendeurObserver {
    private String nom;

    public Vendeur(String nom) {
        this.nom = nom;
    }

    @Override
    public void updateTarte() {
        System.out.println("Vendeur " + nom + " déclenche la fabrication de tarte !");
    }

    @Override
    public void updateChoux() {
        System.out.println("Vendeur " + nom + " déclenche la fabrication de choux !");
    }
}
