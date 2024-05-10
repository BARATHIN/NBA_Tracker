package Metier;

public class Joueur extends Personne{

    private String idJoueur;
    private String position;
    private Statistiques statistiques;

    // Constructeur
    public Joueur(String nom, int age, int taille,String idJoueur, String position, Statistiques statistiques)
    {
    	super(nom, age, taille);
        this.idJoueur = idJoueur;
        this.position = position;
        this.statistiques = statistiques;
    }

	public String getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(String idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Statistiques getStatistiques() {
		return statistiques;
	}

	public void setStatistiques(Statistiques statistiques) {
		this.statistiques = statistiques;
	}
    
}


