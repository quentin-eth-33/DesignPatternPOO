package designPattern.composite;

public class PommeComposite implements ComposantBoulangerie{
    @Override
    public String getDescription() {
        return "Pomme";
    }

    @Override
    public double cout() {
        return 5.5;
    }
}
