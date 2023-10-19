package designPattern.composite;

public class MeringueComposite implements ComposantBoulangerie{
    @Override
    public String getDescription() {
        return "Meringue";
    }

    @Override
    public double cout() {
        return 3.5;
    }
}
