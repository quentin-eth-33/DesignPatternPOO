package designPattern.composite;

public class TarteComposite implements ComposantBoulangerie {
    @Override
    public String getDescription() {
        return "Tarte";
    }

    @Override
    public double cout() {
        return 20.0;
    }
}
