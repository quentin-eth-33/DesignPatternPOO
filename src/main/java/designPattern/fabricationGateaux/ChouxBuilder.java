
package designPattern.fabricationGateaux;
import designPattern.gateaux.Gateaux;
import designPattern.gateaux.Choux;
import designPattern.decorators.Vanille;
import designPattern.decorators.Chocolat;
import designPattern.decorators.Chantilly;
import designPattern.decorators.Noisette;
import designPattern.decorators.AmandeGrillee;
import designPattern.decorators.Ingredient;

public class ChouxBuilder extends GateauxBuilder {

    private boolean avecVanille;
    private boolean avecChocolat;
    private boolean avecChantilly;
    private boolean avecNoisettes;
    private boolean avecAmandesGrillees;

    public ChouxBuilder() {
        super(new Choux());
        avecVanille = false;
        avecChocolat = false;
        avecChantilly = false;
        avecNoisettes = false;
        avecAmandesGrillees = false;
    }

    public void resetBuilder(){
        avecVanille = false;
        avecChocolat = false;
        avecChantilly = false;
        avecNoisettes = false;
        avecAmandesGrillees = false;
        gateaux = new Choux();
    }

    public ChouxBuilder avecVanille() {
        avecVanille = true;
        return this;
    }

    public ChouxBuilder avecChocolat() {
        avecChocolat = true;
        return this;
    }

    public ChouxBuilder avecChantilly() {
        avecChantilly = true;
        return this;
    }

    public ChouxBuilder avecNoisette() {
        avecNoisettes = true;
        return this;
    }

    public ChouxBuilder avecAmandeGrillee() {
        avecAmandesGrillees = true;
        return this;
    }

    @Override
    public Gateaux creerNouveauGateaux(){

        if (avecVanille) {
            gateaux = new Vanille(gateaux);
        }

        if (avecChocolat) {
            gateaux = new Chocolat(gateaux);
        }

        if (avecChantilly) {
            gateaux = new Chantilly(gateaux);
        }

        if (avecNoisettes) {
            gateaux = new Noisette(gateaux);
        }

        if (avecAmandesGrillees) {
            gateaux = new AmandeGrillee(gateaux);
        }
        return gateaux;
    }
}
