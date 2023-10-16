package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public abstract class IngredientDecorator implements Gateaux {
    protected Gateaux gateaux;

    public IngredientDecorator(Gateaux gateaux) {
        this.gateaux = gateaux;
    }
}
