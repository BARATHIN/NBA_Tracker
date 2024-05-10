package Main;

import Controleur.ControleurMatchs;
import Controleur.ControleurUser;
import Controleur.ControleurEquipe;

import View.Matchs;
import View.New_Match;
import View.MatchStats;
import View.Login;
import View.New_Equipe;

public class main {

    public static void main(String[] args) {
    	Matchs matchsView = new Matchs();
        New_Match newMatchView = new New_Match();
        MatchStats matchStatsView = new MatchStats();
        Login loginView = new Login();
        New_Equipe new_Equipe = new New_Equipe();
    	
        ControleurUser controleurUser = new ControleurUser(loginView, matchsView);
        ControleurMatchs controleurMatchs = new ControleurMatchs(matchsView, newMatchView,new_Equipe);
        ControleurEquipe controleurEquipe = new ControleurEquipe();
        
     // Configurez les vues pour qu'elles utilisent ce contrôleur
        matchsView.setControleur(controleurMatchs);
        newMatchView.setControleur(controleurMatchs);
        matchStatsView.setControleur(controleurMatchs);
        loginView.setControleur(controleurUser);
        new_Equipe.setControleur(controleurEquipe);
        
        // Affichez la vue principale (la liste des matchs par exemple)
        loginView.setVisible(true);
    }
}