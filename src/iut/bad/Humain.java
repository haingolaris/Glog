package iut.bad;
import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    private String nom;
    private String prenom;
    private int age;
    protected List<Humain> amis; // Liste des amis de cet humain

    // Constructeur par défaut
    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.amis = new ArrayList<>(); // Initialisation de la liste amis
    }

    // Constructeur avec tous les champs
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>(); // Initialisation de la liste amis
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode pour afficher les détails de l'humain en utilisant un seul System.out.println()
    public void details() {
        System.out.println(toString());
    }

    // Méthode toString pour obtenir une représentation sous forme de chaîne de caractères de l'objet Humain
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    // Méthode pour manger
    @Override
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    // Méthode pour boire
    @Override
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

    public void ami(Humain ami, int duree) {
        amis.add(ami);
        System.out.println(nom + " est maintenant ami avec " + ami.getNom() + " pour une durée de " + duree + " jours.");
    }
    public void ami(Humain ami) {
        ami(ami, 100); // Appel avec une durée par défaut de 100 jours
    }

}
