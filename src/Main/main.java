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
        New_Equipe newEquipeView = new New_Equipe();

        // Création des contrôleurs et liaison avec les vues appropriées
        ControleurUser controleurUser = new ControleurUser(loginView, matchsView);
        ControleurMatchs controleurMatchs = new ControleurMatchs(matchsView, newMatchView, newEquipeView);
        ControleurEquipe controleurEquipe = new ControleurEquipe(matchsView, newEquipeView);

        // Configuration des vues pour utiliser leurs contrôleurs respectifs
        matchsView.setControleur(controleurMatchs);
        newMatchView.setControleur(controleurMatchs);
        matchStatsView.setControleur(controleurMatchs);
        loginView.setControleur(controleurUser);
        newEquipeView.setControleur(controleurEquipe);

        // Affichage de la vue de connexion en premier
        loginView.setVisible(true);
    }
}
