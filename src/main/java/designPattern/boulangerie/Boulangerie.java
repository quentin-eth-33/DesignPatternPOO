package designPattern.boulangerie;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import designPattern.composite.*;
import designPattern.decorators.Abricot;
import designPattern.decorators.Meringue;
import designPattern.decorators.Noisette;
import designPattern.fabricationGateaux.ChouxBuilder;
import designPattern.fabricationGateaux.GateauxFactory;
import designPattern.gateaux.Choux;
import designPattern.gateaux.Gateaux;

public class Boulangerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockGateaux stock = new StockGateaux(10, 5);

        Vendeur vendeur1 = new Vendeur("Vendeur 1");

        stock.addObserver(vendeur1);

        // Simulation de la diminution du stock
        stock.setStockActuelChoux(5);
        stock.setStockActuelTarte(4);

        boolean avecVanille = false;
        boolean avecChocolat = false;
        boolean avecChantilly = false;
        boolean avecNoisettes = false;
        boolean avecAmandesGrillees = false;
        boolean avecMeringue = false;
        boolean avecAbricot = false;
        boolean avecPomme = false;

        while (true) {
            System.out.println("\nBonjour voici nos pattiseries:");
            System.out.println("1. Choux");
            System.out.println("2. Tarte");
            System.out.println("3. Quitter");

            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\n1. Avec Vanille | 2. Avec Chocolat");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecVanille = true;
                    } else if (choix == 2) {
                        avecChocolat = true;
                    }

                    System.out.println("\nAvec Chantilly, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecChantilly = true;
                    }

                    System.out.println("\nAvec Noisettes, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecNoisettes = true;
                    }

                    System.out.println("\nAvec Amandes Grillees, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecAmandesGrillees = true;
                    }

                    Gateaux choux = GateauxFactory.creerChouxAvecIngredients(avecVanille, avecChocolat, avecChantilly, avecNoisettes, avecAmandesGrillees);
                    System.out.println("Description Gateau Acheté: "+choux.getDescription()+ " | Prix: "+choux.cout());
                    stock.setStockActuelChoux(stock.getStockActuelChoux()-1);
                    break;
                case 2:
                    System.out.println("\n1. Avec Pomme | 2. Avec Abricot");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecPomme = true;
                    } else if (choix == 2) {
                        avecAbricot = true;
                    }

                    System.out.println("\nAvec Meringue, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecMeringue = true;
                    }

                    System.out.println("\nAvec Noisettes, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecNoisettes = true;
                    }

                    System.out.println("\nAvec Amandes Grillees, 1. Oui | 2. Non");
                    choix = scanner.nextInt();
                    if (choix == 1) {
                        avecAmandesGrillees = true;
                    }

                    Gateaux tarte = GateauxFactory.creerTarteAvecIngredients(avecPomme, avecAbricot, avecMeringue, avecNoisettes, avecAmandesGrillees);
                    System.out.println("Description Gateau Acheté: "+tarte.getDescription()+ " | Prix: "+tarte.cout());
                    stock.setStockActuelTarte(stock.getStockActuelTarte()-1);
                    break;
                case 3:
                    System.out.println("Quitte la boutique.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Option non valide. Veuillez choisir une option valide.");
                    break;
            }
        }
    }
}
