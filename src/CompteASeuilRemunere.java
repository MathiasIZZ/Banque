public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil{

    private double seuil;

    @Override
    public double getSeuil() {
        return 0;
    }

    @Override
    public double setSeuil(double unSeuil) {
        return 0;
    }

    public CompteASeuilRemunere() {};

    public CompteASeuilRemunere(double solde, int numero, double taux, double seuil) {
        super(solde, numero, taux);
        this.seuil = seuil;

    }

    public void retirer(double unMontant) {
        double soldeTheorique = this.getSolde() - unMontant;

        if (soldeTheorique < seuil) {
            System.out.println("Retrait impossible. ");
        }
        else {
            this.setSolde(this.getSolde() - unMontant );
            System.out.println(this.getSolde());
        }
    }





}
