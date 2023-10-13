package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class IngredientDecorator implements Gateaux {
    protected Gateaux gateaux;

    public IngredientDecorator(Gateaux gateaux) {
        this.gateaux = gateaux;
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription();
    }

    @Override
    public double cout() {
        return gateaux.cout();
    }
}
