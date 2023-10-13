package designPattern.gateaux;

public class Choux implements Gateaux{

    public String getDescription() {
        return "Choux ";
    }

    @Override
    public double cout() {
        return 10.0;
    }
}
