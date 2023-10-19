package designPattern.composite;

public class AmandeGrilleeComposite implements ComposantBoulangerie {
    @Override
    public String getDescription() {
        return "Amande Grillee";
    }

    @Override
    public double cout() {
        return 2.5;
    }
}
