package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Vanille extends IngredientsDecorator {

    public Vanille(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Vanille";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 3.0;
    }
}
