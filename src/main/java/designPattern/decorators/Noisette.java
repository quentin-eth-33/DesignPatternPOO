package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Noisette extends IngredientDecorator {
    public Noisette(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.NOISETTE.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.NOISETTE.getCout();
    }
}
