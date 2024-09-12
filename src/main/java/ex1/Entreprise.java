package ex1;

import java.util.Date;

/**
 * La classe Entreprise représente une entreprise avec ses informations de base
 * comme le Siret, le nom, l'adresse et la date de création.
 */

public class Entreprise {

    // Le capital maximal autorisé
    public static final int CAPITAL_MAX = 3000000;

    // Numéro SIRET
    private int siret;

    // Nom de l'entreprise
    private String nom;

    // Adresse de l'entreprise
    private String adresse;

    // Date de création de l'entreprise
    private Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */

    public void afficherStatut() {
    }
}