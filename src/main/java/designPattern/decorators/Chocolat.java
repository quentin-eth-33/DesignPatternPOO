package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Chocolat extends IngredientsDecorator {
    public Chocolat(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Chocolat";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 3.0;
    }
}
