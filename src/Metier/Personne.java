package Metier;

public class Personne {
    private String nom;
    private int age;
    private int taille;

    public Personne(String nom, int age, int taille) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }
}