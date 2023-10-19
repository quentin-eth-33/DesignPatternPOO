package designPattern.composite;

public class ChantillyComposite implements ComposantBoulangerie {
    @Override
    public String getDescription() {
        return "Chantilly";
    }

    @Override
    public double cout() {
        return 4.5;
    }
}
