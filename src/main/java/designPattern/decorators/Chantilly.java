package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Chantilly extends IngredientDecorator {
    public Chantilly(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.CHANTILLY.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.CHANTILLY.getCout();
    }
}