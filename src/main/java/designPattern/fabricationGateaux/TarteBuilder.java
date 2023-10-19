package designPattern.fabricationGateaux;


import designPattern.decorators.*;
import designPattern.gateaux.Gateaux;
import designPattern.gateaux.Choux;
import designPattern.gateaux.Tarte;

public class TarteBuilder extends GateauxBuilder {

    private boolean avecPomme;
    private boolean avecAbricot;
    private boolean avecMeringue;
    private boolean avecNoisettes;
    private boolean avecAmandesGrillees;

    public TarteBuilder() {
        super(new Choux());
        avecPomme = false;
        avecAbricot = false;
        avecMeringue = false;
        avecNoisettes = false;
        avecAmandesGrillees = false;
    }

    public void resetBuilder(){
        avecPomme = false;
        avecAbricot = false;
        avecMeringue = false;
        avecNoisettes = false;
        avecAmandesGrillees = false;
        gateaux = new Tarte();
    }

    public TarteBuilder avecPomme() {
        avecPomme = true;
        return this;
    }

    public TarteBuilder avecAbricot() {
        avecAbricot = true;
        return this;
    }

    public TarteBuilder avecMeringue() {
        avecMeringue = true;
        return this;
    }

    public TarteBuilder avecNoisette() {
        avecNoisettes = true;
        return this;
    }

    public TarteBuilder avecAmandeGrillee() {
        avecAmandesGrillees = true;
        return this;
    }

    @Override
    public Gateaux creerNouveauGateaux(){

        if (avecPomme) {
            gateaux = new Pomme(gateaux);
        }

        if (avecAbricot) {
            gateaux = new Abricot(gateaux);
        }

        if (avecMeringue) {
            gateaux = new Meringue(gateaux);
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
