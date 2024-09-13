package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMin;
    private int poidsMax;

    /**
     * Constructeur
     *
     * @param nom
     * @param poidsMin
     * @param poidsMax
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMin = poidsMin;
        this.poidsMax = poidsMax;
    }

    /**
     * Vérifier si un objet peut être ajouté à la caisse avec son poids
     * @param item
     * @return true ou false si refusé
     */

    public boolean accepterItem(Item item) {
        return item.getPoids() >= poidsMin && item.getPoids() <= poidsMax;
    }

    /**
     * Ajouter un objet à la caisse
     * @param item
     */

    public void ajouterItem(Item item) {
        items.add(item);
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Retourne le nombre d'items dans la caisse.
     */
    public int taille() {
        return items.size();
    }
}