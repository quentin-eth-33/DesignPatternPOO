package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Pommes extends IngredientsDecorator {
    public Pommes(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Pommes";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 2.0;
    }
}
