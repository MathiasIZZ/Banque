public class CompteRemunere extends Compte implements ICompteRemunere{

    private double taux;

    public CompteRemunere(){}

    public CompteRemunere(double solde, int numero, double taux){
        super(solde, numero);
        this.taux = taux;
    }


    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double calculerInterets() {
        return this.taux * this.getSolde();
    }

    public void verserInterets(){
        this.setSolde(this.getSolde() + (this.taux * this.getSolde()));
    }


}
