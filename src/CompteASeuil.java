public class CompteASeuil extends Compte implements ICompteASeuil{

    private double seuil = 10.0;

    public CompteASeuil() {}

    public CompteASeuil(double solde, int numero, double seuil) {
        super(solde, numero);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    @Override
    public double setSeuil(double unSeuil) {
        return 0;
    }


    @Override
    public void retirer(double unMontant) {
        if (this.getSolde() < unMontant) {
            System.out.println("Retrait non autorisé, le seuil est depassé");
        } else {
            System.out.println("Retrait autorisé");
            this.setSolde(this.getSolde() - unMontant);
            System.out.println("Retrait: " + this.getSolde());
        }
    }


}
