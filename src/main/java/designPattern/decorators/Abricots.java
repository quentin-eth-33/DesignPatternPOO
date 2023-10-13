package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Abricots extends IngredientsDecorator {
    public Abricots(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Abricots";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 2.0;
    }
}
