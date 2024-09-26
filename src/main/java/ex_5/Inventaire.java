package ex_5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    protected List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 4));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 21, Integer.MAX_VALUE));
    }

    /**
     * Ajoute un item dans la caisse appropriée.
     *
     * @param item l'item à ajouter
     */
    public void ajouterItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepterItem(item)) {
                caisse.ajouterItem(item);
                return; // Une fois ajouté, on quitte la boucle
            }
        }
        System.out.println("Aucune caisse n'accepte cet item.");
    }

    /**
     * Retourne le nombre total d'items dans toutes les caisses.
     *
     * @return le nombre d'items total
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.taille();
        }
        return total;
    }
}