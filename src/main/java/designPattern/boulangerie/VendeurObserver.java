package designPattern.boulangerie;

public interface VendeurObserver {
    void updateTarte(StockGateaux stock);
    void updateChoux(StockGateaux stock);
}
