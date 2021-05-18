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

        Compte cr1 = new CompteRemunere(7000, 2222, 0.13);

        client1.ajouterUnCompte(cr1);

        Compte cas1 = new CompteASeuil(10000, 3333, 1000);

        Compte casr1 = new CompteASeuilRemunere(5000, 4444, 0.17, 1500);

        casr1.retirer(1000);
        casr1.ajouter(15000);
        System.out.println(casr1.getSolde());
        casr1.retirer(8000);











    }
}

