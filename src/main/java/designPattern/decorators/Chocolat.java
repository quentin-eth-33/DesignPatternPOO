package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Chocolat extends IngredientDecorator {
    public Chocolat(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.CHOCOLAT.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.CHOCOLAT.getCout();
    }
}
