package Metier;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomEquipe;
    private List<Joueur> joueurs = new ArrayList<>();
    private Statistiques statistiques;

    // Constructeur
    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    // Méthodes pour ajouter et retirer des joueurs
    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public void retirerJoueur(Joueur joueur) {
        joueurs.remove(joueur);
    }

    public void setNomEquipe(String nomEquipe)
    {
    	this.nomEquipe = nomEquipe;
    }
    public String getNomEquipe()
    {
    	return nomEquipe;
    }
    public void setStatistiques(Statistiques statistiques)
    {
    	this.statistiques = statistiques;
    }
    public Statistiques getStatistiques()
    {
    	return statistiques;
    }
}
