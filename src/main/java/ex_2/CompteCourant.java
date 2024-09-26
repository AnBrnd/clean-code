package ex_2;

/**
 * Représente un compte courant qui peut avoir un découvert
 */

public class CompteCourant extends CompteBancaire{

    private double decouvertAutorise;

    public CompteCourant(double solde, double decouvertAutorise) {
        super(solde, decouvertAutorise);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvertAutorise) {
            this.solde -= montant;
        }
        else {
            System.out.println("Autorisation de découverte atteinte, débit refusé");
        }
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }
}
