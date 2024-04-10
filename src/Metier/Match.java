package Metier;

import java.util.Date;

public class Match {
	private int idMatch;
	private Date date;
	private String equipeDomicile;
	private String equipeVisiteur;
	private int scoreDomicile;
	private int scoreVisiteur;
	private Statistiques statistiques ;
	
	public Match(int idMatch, Date date, String equipeDomicile, String equipeVisiteur, int scoreDomicile, int scoreVisiteur)
	{
		this.idMatch = idMatch;
		this.date = date;
		this.equipeDomicile = equipeDomicile;
		this.equipeVisiteur = equipeVisiteur;
		this.scoreDomicile = scoreDomicile;
		this.scoreVisiteur = scoreVisiteur;
	}

}
