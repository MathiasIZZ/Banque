public class CompteRemunere extends Compte {

    private double taux;

    public CompteRemunere(double solde, int numero, double taux) {
        super(solde, numero);
        this.taux = taux;
    }

    public double calculerInterets() {

        return this.getSolde() * this.taux;
    }







    @Override
    public String toString() {
        return "CompteRemunere = {" +
                " solde = " + this.getSolde() +
                " numero = " + this.getNumero() +
                " taux = " + taux +
                '}';
    }
}

