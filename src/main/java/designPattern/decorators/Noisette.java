package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Noisette extends IngredientsDecorator {
    public Noisette(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Noisette";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 1.0;
    }
}
