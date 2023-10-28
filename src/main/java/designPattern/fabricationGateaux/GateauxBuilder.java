package designPattern.fabricationGateaux;
import designPattern.gateaux.Gateaux;

public abstract class GateauxBuilder {
    protected Gateaux gateaux;

    public GateauxBuilder(Gateaux gateaux){
        this.gateaux =  gateaux;
    }

    public Gateaux getGateaux() {
        return gateaux;
    }

    public abstract Gateaux creerNouveauGateaux();
}