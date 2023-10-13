package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class AmandeGrillee extends IngredientDecorator {
    public AmandeGrillee(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+ Ingredient.AMANDE_GRILLEE.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() + Ingredient.AMANDE_GRILLEE.getCout();
    }
}
