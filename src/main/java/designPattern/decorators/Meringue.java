package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Meringue extends IngredientDecorator {
    public Meringue(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.MERINGUE.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.MERINGUE.getCout();
    }
}
