package designPattern.composite;

public class ChouxComposite implements ComposantBoulangerie {
    @Override
    public String getDescription() {
        return "Choux ";
    }

    @Override
    public double cout() {
        return 10.0;
    }
}
