package designPattern.boulangerie;

import java.util.ArrayList;
import java.util.List;

public class StockGateaux {
    private List<VendeurObserver> observers = new ArrayList<>();


    private int stockActuelChoux;
    private int stockActuelTarte;
    private int seuilAlerteTarte;
    private int seuilAlerteChoux;

    public StockGateaux(int seuilAlerteChoux, int seuilAlertTarte) {
        this.seuilAlerteChoux = seuilAlerteChoux;
        this.seuilAlerteTarte = seuilAlertTarte;
    }

    public void addObserver(VendeurObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(VendeurObserver observer) {
        observers.remove(observer);
    }

    public void setStockActuelChoux(int stockActuelChoux) {
        this.stockActuelChoux = stockActuelChoux;
        if (stockActuelChoux < seuilAlerteChoux) {
            notifyObserversChoux(this);
        }
    }

    public void setStockActuelTarte(int stockActuelTarte) {
        this.stockActuelTarte = stockActuelTarte;
        if (stockActuelTarte < this.seuilAlerteTarte) {
            notifyObserversTarte(this);
        }
    }

    public int getStockActuelChoux(){
        return stockActuelChoux;
    }

    public int getStockActuelTarte(){
        return stockActuelTarte;
    }

    public void notifyObserversTarte(StockGateaux stock) {
        for (VendeurObserver observer : observers) {
            observer.updateTarte(stock);
        }
    }

    public void notifyObserversChoux(StockGateaux stock) {
        for (VendeurObserver observer : observers) {
            observer.updateChoux(stock);
        }
    }
}

