package Controleur;

import View.Matchs;
import View.New_Match;

import java.util.Date;

import Metier.Match;

public class ControleurMatchs {
	private Matchs matchsView;
	private New_Match newMatchView;
	
	public ControleurMatchs(Matchs matchsView, New_Match newMatchView) {
        this.matchsView = matchsView;
        this.newMatchView = newMatchView;
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
        Match match1 = new Match(newMatchView.get_txtIDMatch() , newMatchView.get_txtDate(), newMatchView.get_txtEquipeDomicile() , newMatchView.get_txtEquipeVisiteur(), newMatchView.get_txtEquipeDomicileScore(), newMatchView.get_txtEquipeVisiteurScore());
    }
}
