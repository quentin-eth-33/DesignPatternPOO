package designPattern.boulangerie;

import designPattern.composite.*;

public class Boulangerie {
    public static void main(String[] args) {
        /*
        ChouxBuilder chouxBuilder = new ChouxBuilder();
        Gateaux choux = chouxBuilder.avecChantilly().avecChocolat().avecAmandeGrillee().creerNouveauGateaux();
        System.out.println("Commande : " + choux.getDescription());
        System.out.println("Cout : " + choux.cout());
        chouxBuilder.resetBuilder();

        choux = chouxBuilder.avecNoisette().avecVanille().creerNouveauGateaux();
        System.out.println("Commande : " + choux.getDescription());
        System.out.println("Cout : " + choux.cout());

        Gateaux c = GateauxFactory.creerChouxAvecIngredients(true, true, true, true, false);
        System.out.println("Commande : " + c.getDescription());


        StockGateaux stock = new StockGateaux(10);

        Vendeur vendeur1 = new Vendeur("Vendeur 1");
        Vendeur vendeur2 = new Vendeur("Vendeur 2");

        stock.addObserver(vendeur1);
        stock.addObserver(vendeur2);

        // Simulation de la diminution du stock
        stock.setStockActuel(5);
        */

        GateauxComposite gateau = new GateauxComposite();
        gateau.ajouterComposant(new ChouxComposite());
        gateau.ajouterComposant(new AbricotComposite());
        gateau.ajouterComposant(new MeringueComposite());

        double coutTotal = gateau.cout();
        String descriptionTotale = gateau.getDescription();

        System.out.println("Description totale : " + descriptionTotale);
        System.out.println("Coût total : " + coutTotal);

    }

}
