package Controleur;

import View.Matchs;
import View.New_Equipe;

public class ControleurEquipe {

	private Matchs matchsView;
	private New_Equipe newEquipeView;

	public ControleurEquipe(Matchs matchsView, New_Equipe newEquipeView) {
		this.matchsView = matchsView;
		this.newEquipeView = newEquipeView;
	}

	public void retournerAuxMatchs() {
		newEquipeView.setVisible(false);
		matchsView.setVisible(true);
	}
}
