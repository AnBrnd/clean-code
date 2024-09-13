package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un zoo.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param animal - animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux présents dans le zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne la taille du zoo (le nombre d'animaux).
     *
     * @return - nombre d'animaux
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Retourne le nombre de mammifères présents dans le zoo.
     *
     * @return - nombre de mammifères
     */
    public int nombreMammiferes() {
        int count = 0;
        for (Animal animal : animaux) {
            if ("MAMMIFERE".equals(animal.getType())) {
                count++;
            }
        }
        return count;
    }

    /**
     * Retourne le nombre de carnivores présents dans le zoo.
     * @return - nombre de carnivores
     */
    public int nombreCarnivores() {
        int count = 0;
        for (Animal animal : animaux) {
            if ("CARNIVORE".equals(animal.getComportement())) {
                count++;
            }
        }
        return count;
    }

        // Getters et setters pour le nom

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

