import exceptions.BanqueException;

public class Compte {

    private double solde;
    private int numero;

    public Compte(){}

    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }
    public int getNumero() {
        return numero;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    private void setNumero(int numero) {
        this.numero = numero;
    }



    public void ajouter(double unMontant) {
        this.setSolde(this.getSolde() + unMontant);
    }


    public void retirer(double unMontant) {
        boolean ok = true;

        if (!ok) {
            this.setSolde(this.getSolde() - unMontant);
        } else {
            System.out.println("Le seuil est trop bas");
        }




    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }
}
