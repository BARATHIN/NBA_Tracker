package Controleur;

import View.Matchs;
import View.New_Match;
import View.New_Equipe;

import Metier.Match;
import Metier.Equipe;

public class ControleurMatchs {
	private Matchs matchsView;
	private New_Match newMatchView;
	private New_Equipe newEquipeView;
	
	public ControleurMatchs(Matchs matchsView, New_Match newMatchView, New_Equipe newEquipeView) {
        this.matchsView = matchsView;
        this.newMatchView = newMatchView;
        this.newEquipeView = newEquipeView;
    }
    
	public void ouvrirNouveauMatch() {
        // Configure New_Match if needed
        newMatchView.setVisible(true);
        matchsView.setVisible(false);
    }
    
	public void ouvrirMatchs() {
        // Configure Matchs if needed
        matchsView.setVisible(true);
        newMatchView.setVisible(false);
        //matchsView.Ajouter_Match(newMatchView.get_txtEquipeDomicile() , newMatchView.get_txtEquipeVisiteur(), newMatchView.get_txtEquipeDomicileScore(), newMatchView.get_txtEquipeVisiteurScore());
        Match match = new Match(newMatchView.get_txtDate(), newMatchView.get_txtEquipeDomicile() , newMatchView.get_txtEquipeVisiteur(), newMatchView.get_txtEquipeDomicileScore(), newMatchView.get_txtEquipeVisiteurScore());
        matchsView.Ajouter_Match_str(match);
    }
	public void EnregistrerInfoMatch()
	{
		newMatchView.vd_MajEquipe();
	}
	public void NewEquipe()
	{
		matchsView.setVisible(false);
		newEquipeView.setVisible(true);
	}
	public void OuvrirNouvelleEquipe()
	{
		
	}
	
	
}
