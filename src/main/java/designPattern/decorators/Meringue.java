package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Meringue extends IngredientsDecorator {
    public Meringue(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Meringue";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 2.0;
    }
}
