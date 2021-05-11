import exceptions.BanqueException;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Compte c1 = new Compte(2500, 1234);
        Compte c2 = new Compte(1500, 1123);
        Compte c3 = new Compte(3000, 1114);
        Compte c4 = new Compte(5000, 1111);


        Client client1 = new Client("Mathias", "Guiguen", 25, 561651651);



        client1.ajouterUnCompte(c1);
        client1.ajouterUnCompte(c2);
        client1.ajouterUnCompte(c3);
        client1.ajouterUnCompte(c4);

        CompteRemunere c5 = new CompteRemunere(7500, 5555, 0.13);




    }
}

