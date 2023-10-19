package designPattern.composite;

public class VanilleComposite implements ComposantBoulangerie{
    @Override
    public String getDescription() {
        return "Vanille";
    }

    @Override
    public double cout() {
        return 3.5;
    }
}
