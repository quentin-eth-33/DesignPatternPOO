package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Pomme extends IngredientDecorator {
    public Pomme(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.POMME.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.POMME.getCout();
    }
}
