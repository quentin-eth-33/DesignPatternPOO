package designPattern.boulangerie;

public class Vendeur implements VendeurObserver {
    private String nom;

    public Vendeur(String nom) {
        this.nom = nom;
    }

    @Override
    public void updateTarte(StockGateaux stock) {
        System.out.println("Vendeur " + nom + " déclenche la fabrication de tarte !");
        stock.setStockActuelTarte(stock.getStockActuelTarte()+10);
    }

    @Override
    public void updateChoux(StockGateaux stock) {
        System.out.println("Vendeur " + nom + " déclenche la fabrication de choux !");
        stock.setStockActuelChoux(stock.getStockActuelChoux()+10);
    }
}
