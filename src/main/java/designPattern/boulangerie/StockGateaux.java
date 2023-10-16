package designPattern.boulangerie;

import java.util.ArrayList;
import java.util.List;

public class StockGateaux {
    private List<VendeurObserver> observers = new ArrayList<>();
    private int stockActuel;
    private int seuilAlerte;

    public StockGateaux(int seuilAlerte) {
        this.seuilAlerte = seuilAlerte;
    }

    public void addObserver(VendeurObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(VendeurObserver observer) {
        observers.remove(observer);
    }

    public void setStockActuel(int stockActuel) {
        this.stockActuel = stockActuel;
        if (stockActuel < seuilAlerte) {
            notifyObservers();
        }
    }

    public void notifyObservers() {
        for (VendeurObserver observer : observers) {
            observer.update();
        }
    }
}

