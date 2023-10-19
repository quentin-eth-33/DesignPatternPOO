package designPattern.fabricationGateaux;

import designPattern.decorators.*;
import designPattern.gateaux.Gateaux;
import designPattern.gateaux.Choux;
import designPattern.gateaux.Tarte;

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


    public static Gateaux creerTarteAvecIngredients(boolean avecPomme, boolean avecAbricot, boolean avecMeringue, boolean avecNoisettes, boolean avecAmandesGrillees) {
        Gateaux tarte = new Tarte();

        if (avecPomme) {
            tarte = new Pomme(tarte);
        }

        if (avecAbricot) {
            tarte = new Abricot(tarte);
        }

        if (avecMeringue) {
            tarte = new Meringue(tarte);
        }

        if (avecNoisettes) {
            tarte = new Noisette(tarte);
        }

        if (avecAmandesGrillees) {
            tarte = new AmandeGrillee(tarte);
        }

        return tarte;
    }
}
