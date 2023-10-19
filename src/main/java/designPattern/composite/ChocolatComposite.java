package designPattern.composite;

public class ChocolatComposite implements ComposantBoulangerie{
    @Override
    public String getDescription() {
        return "Chocolat";
    }

    @Override
    public double cout() {
        return 1.5;
    }
}
