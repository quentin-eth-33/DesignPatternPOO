package designPattern.decorators;

public enum Ingredient {
    VANILLE("VANILLE", 5.0),
    CHOCOLAT("CHOCOLAT", 5.0),
    CHANTILLY("CHANTILLY", 1.0),
    NOISETTE("NOISETTE", 1.5),
    AMANDE_GRILLEE("Amande grillée", 1.5),
    POMME("POMME", 3.0),
    ABRICOT("ABRICOT", 3.0),

    MERINGUE("MERINGUE", 2.0);

    private String nom;
    private double cout;

    Ingredient(String nom, double cout) {
        this.nom = nom;
        this.cout = cout;
    }

    public String getNom() {
        return nom;
    }

    public double getCout() {
        return cout;
    }
}