package designPattern.fabricationGateaux;

import designPattern.gateaux.Gateaux;

public abstract class Patissier {
    protected Gateaux gateaux;

    public Gateaux getGateaux() {
        return gateaux;
    }

    //public abstract void  creerNouveauGateaux();

    public abstract void buildDescription();
    public abstract void buildCout();
    public abstract void buildIngredients();

}
