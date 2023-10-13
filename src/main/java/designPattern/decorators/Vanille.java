package designPattern.decorators;

import designPattern.gateaux.Gateaux;

public class Vanille extends IngredientDecorator {

    public Vanille(Gateaux gateaux) {
        super(gateaux);
    }

    @Override
    public String getDescription() {
        return gateaux.getDescription() + "| "+Ingredient.VANILLE.getNom();
    }

    @Override
    public double cout() {
        return gateaux.cout() +  Ingredient.VANILLE.getCout();
    }
}
