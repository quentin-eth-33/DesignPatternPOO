package designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class GateauxComposite implements ComposantBoulangerie {
    private List<ComposantBoulangerie> composantsGateaux = new ArrayList<>();


    public void ajouterComposant(ComposantBoulangerie composant) {
        composantsGateaux.add(composant);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        for (ComposantBoulangerie composant : composantsGateaux) {
            description.append(composant.getDescription());
            description.append(", ");
        }
        return description.toString();
    }

    @Override
    public double cout() {
        double coutTotal = 0;
        for (ComposantBoulangerie composant : composantsGateaux) {
            coutTotal += composant.cout();
        }
        return coutTotal;
    }
}
