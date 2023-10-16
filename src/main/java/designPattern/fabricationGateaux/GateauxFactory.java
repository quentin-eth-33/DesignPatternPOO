package designPattern.fabricationGateaux;

import designPattern.decorators.*;
import designPattern.gateaux.Gateaux;
import designPattern.gateaux.Choux;

public class GateauxFactory {
    public static Gateaux creerChouxAvecIngredients(boolean avecVanille, boolean avecChocolat, boolean avecChantilly, boolean avecNoisettes, boolean avecAmandesGrillees) {
        Gateaux choux = new Choux();

        if (avecVanille) {
            choux = new Vanille(choux);
        }

        if (avecChocolat) {
            choux = new Chocolat(choux);
        }

        if (avecChantilly) {
            choux = new Chantilly(choux);
        }

        if (avecNoisettes) {
            choux = new Noisette(choux);
        }

        if (avecAmandesGrillees) {
            choux = new AmandeGrillee(choux);
        }

        return choux;
    }
}
