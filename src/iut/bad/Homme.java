package iut.bad;
public class Homme {
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut
    public Homme() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec tous les champs
    public Homme(String nom, String prenom, int age) {
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

    
}
