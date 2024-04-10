package Metier;

public class Joueur {

    private String idJoueur;
    private String nom;
    private String position;
    private Statistiques statistiques;

    // Constructeur
    public Joueur(String idJoueur, String nom, String position, Statistiques statistiques) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.position = position;
        this.statistiques = statistiques;
    }
    
}


