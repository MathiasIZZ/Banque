import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numeroClient;
    private Compte[] comptes = new Compte[5];
    private List<Integer> portefuilles = new ArrayList<>();



    public Client(String nom, String prenom, int age, int numeroClient) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numeroClient = numeroClient;

    }

    public Client() {}

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
    public int getNumeroClient() {
        return numeroClient;
    }

    public Compte[] getComptes() {
        return comptes;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }


    public void ajouterUnCompte(Compte compte) {
        // regarder dans le tableau de compte = siginifie une boucle
        // dans la boucle, le premier element a null -> valeur passée en parametre
        boolean find = false;
        for (int i = 0; i < this.getComptes().length; i++) {
            if (this.getComptes()[i] == null) {
                this.getComptes()[i] = compte;
                find = true;
                break;

            }
        }
        if (!find) {
            System.out.println("Vous avez atteint le maximum de comptes..");
        } else {
            System.out.println("Le compte " + compte.getNumero() + " a bien été ajouté");
        }

    }

    public Compte getCompte(int numeroDeCompte) {
        Compte compte = new Compte();
        boolean find = false;
        for (int i = 0; i < this.getComptes().length; i++) {
            if (numeroDeCompte == this.getComptes()[i].getNumero()) {
                compte = this.getComptes()[i];
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Le compte: " + numeroDeCompte + " n existe pas");
        }

        return compte;
    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numeroClient=" + numeroClient +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }


}
