package ex_5;

public class InventaireApplication {

    public static void main(String[] args) {
        // Création de l'inventaire
        Inventaire inventaire = new Inventaire();

        // Création d'items
        Item item1 = new Item();
        item1.setNom("Livre");
        item1.setPoids(2); // Petit objet

        Item item2 = new Item();
        item2.setNom("Table");
        item2.setPoids(15); // Moyen objet

        Item item3 = new Item();
        item3.setNom("Réfrigérateur");
        item3.setPoids(50); // Grand objet

        // Ajout des items à l'inventaire
        inventaire.ajouterItem(item1);
        inventaire.ajouterItem(item2);
        inventaire.ajouterItem(item3);

        // Affichage des résultats
        System.out.println("Nombre total d'items dans l'inventaire : " + inventaire.taille());
        System.out.println("Items dans la caisse 'Petits objets' : " + inventaire.caisses.get(0).getItems().size());
        System.out.println("Items dans la caisse 'Moyens objets' : " + inventaire.caisses.get(1).getItems().size());
        System.out.println("Items dans la caisse 'Grands objets' : " + inventaire.caisses.get(2).getItems().size());
    }
}
