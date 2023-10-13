package designPattern.boulangerie;

import designPattern.decorators.Chantilly;
import designPattern.decorators.Chocolat;
import designPattern.decorators.Noisette;
import designPattern.gateaux.Choux;
import designPattern.gateaux.Gateaux;

public class Boulangerie {
    public static void main(String[] args) {
        Gateaux choux =  new Chocolat(new Noisette(new Chantilly(new Choux())));

        System.out.println("Commande : " + choux.getDescription());
        System.out.println("Coût total : " + choux.cout());
    }
}
