package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class AmandesGrillees extends IngredientsDecorator {
    public AmandesGrillees(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| Amandes Grillees";
    }

    @Override
    public double cout() {
        return gateaux.cout() + 4.0;
    }
}
