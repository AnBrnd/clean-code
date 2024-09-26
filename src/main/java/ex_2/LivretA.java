package ex_2;

/**
 * Représente un compte bancaire de type Livret A qui ne peut pas avoir de découvert
 */

public class LivretA extends CompteBancaire {

    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override

    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        } else {
            System.out.println("Débit refusé : le livret A ne peut pas être à découvert.");
        }
    }

    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

}
