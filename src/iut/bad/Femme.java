package iut.bad;

public class Femme extends Humain {
    // Constructeur par défaut
    public Femme() {
        super();
    }

    // Constructeur avec tous les champs
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
    	Humain femme = new Humain("Marie", "Jeanne", 30); // Exemple de création d'un objet femme
    	Humain homme = new Humain("Robert", "Pilier", 35); // Exemple de création d'un objet homme

    	femme.ami(homme); // Appel de la méthode ami pour ajouter homme comme ami de femme
    }
}