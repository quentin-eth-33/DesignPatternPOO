package designPattern.composite;
public class AbricotComposite implements ComposantBoulangerie {
    @Override
    public String getDescription() {
        return "Abricot";
    }

    @Override
    public double cout() {
        return 1.5;
    }
}
