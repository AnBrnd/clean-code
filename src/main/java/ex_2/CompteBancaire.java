package ex_2;

/**
 * Représente un compte bancaire davec un solde et un découvert autorisé
 */
public abstract class CompteBancaire {

    protected double solde;
    protected double decouvert;

    /** Constructeur pour le compte bancaire
     * @param solde - solde initial
     * @prama decouvert - découvert autorisé
     */

    protected CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /** Méthode pour ajouter un montant au solde
     * @param montant - montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /** Méthode pour retirer un montant du solde
     * @param montant - montant à retirer
     */

    public void debiterMontant(double montant){
        /**
         * Getter pour le solde
         * @return le solde
         */
    }

    /**
     * Getter pour le découvert
     * @return le découvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter pour le solde
     * @param solde - le solde
     */

    public void setSolde(double solde) {
        this.solde = solde;
    }
}