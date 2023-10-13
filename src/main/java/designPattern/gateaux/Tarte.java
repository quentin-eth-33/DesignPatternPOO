package designPattern.gateaux;

public class Tarte implements Gateaux{
    public String getDescription() {
        return "Tarte ";
    }

    @Override
    public double cout() {
        return 20.0;
    }
}
