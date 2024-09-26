package ex_3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("La Flèche");

        zoo.ajouterAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Requin blanc", "POISSON", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));

        zoo.afficherListeAnimaux();
        System.out.println("Nombre d'animaux dans le zoo : " + zoo.taille());
        System.out.println("Nombre de mammifères dans le zoo : " + zoo.nombreMammiferes());
        System.out.println("Nombre de carnivores dans le zoo : " + zoo.nombreCarnivores());
    }
}
