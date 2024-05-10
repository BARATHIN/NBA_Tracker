package Metier;

import java.util.Date;

public class Match {
	private static int Next_idMatch = 10001;
	private int idMatch;
	private Date date;
	private String equipeDomicile;
	private String equipeVisiteur;
	private int scoreDomicile;
	private int scoreVisiteur;
	private Statistiques statistiques ;
	
	public Match(Date date, String equipeDomicile, String equipeVisiteur, int scoreDomicile, int scoreVisiteur)
	{
		this.idMatch = Next_idMatch++;
		this.date = date;
		this.equipeDomicile = equipeDomicile;
		this.equipeVisiteur = equipeVisiteur;
		this.scoreDomicile = scoreDomicile;
		this.scoreVisiteur = scoreVisiteur;
	}

	public int getIdMatch() {
		return idMatch;
	}

	public void setIdMatch(int idMatch) {
		this.idMatch = idMatch;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEquipeDomicile() {
		return equipeDomicile;
	}

	public void setEquipeDomicile(String equipeDomicile) {
		this.equipeDomicile = equipeDomicile;
	}

	public String getEquipeVisiteur() {
		return equipeVisiteur;
	}

	public void setEquipeVisiteur(String equipeVisiteur) {
		this.equipeVisiteur = equipeVisiteur;
	}

	public int getScoreDomicile() {
		return scoreDomicile;
	}

	public void setScoreDomicile(int scoreDomicile) {
		this.scoreDomicile = scoreDomicile;
	}

	public int getScoreVisiteur() {
		return scoreVisiteur;
	}

	public void setScoreVisiteur(int scoreVisiteur) {
		this.scoreVisiteur = scoreVisiteur;
	}

	public Statistiques getStatistiques() {
		return statistiques;
	}

	public void setStatistiques(Statistiques statistiques) {
		this.statistiques = statistiques;
	}
}
