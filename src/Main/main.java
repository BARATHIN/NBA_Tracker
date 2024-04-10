package Main;

import java.awt.EventQueue;

import Controleur.ControleurMatchs;

import View.Matchs;
import View.New_Match;
import View.MatchStats;

public class main {

    public static void main(String[] args) {
    	Matchs matchsView = new Matchs();
        New_Match newMatchView = new New_Match();
        MatchStats matchStatsView = new MatchStats();
    	
        ControleurMatchs controleur = new ControleurMatchs(matchsView, newMatchView);
        
     // Configurez les vues pour qu'elles utilisent ce contrôleur
        matchsView.setControleur(controleur);
        newMatchView.setControleur(controleur);
        matchStatsView.setControleur(controleur);

        // Affichez la vue principale (la liste des matchs par exemple)
        matchsView.setVisible(true);
    }
}