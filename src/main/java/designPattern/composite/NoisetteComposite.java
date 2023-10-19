package designPattern.composite;

public class NoisetteComposite implements ComposantBoulangerie{
    @Override
    public String getDescription() {
        return "Noisettes";
    }

    @Override
    public double cout() {
        return 1.5;
    }
}
