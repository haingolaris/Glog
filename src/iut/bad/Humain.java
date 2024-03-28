package iut.bad;
public class Humain {
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut
    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec tous les champs
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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
}
