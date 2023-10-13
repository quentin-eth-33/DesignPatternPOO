package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Chantilly extends IngredientsDecorator {
    public Chantilly(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Chantilly";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 2.0;
    }
}