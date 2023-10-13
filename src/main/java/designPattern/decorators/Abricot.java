package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Abricot extends IngredientDecorator {
    public Abricot(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.ABRICOT.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.ABRICOT.getCout();
    }
}
