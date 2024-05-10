package Controleur;

import Metier.Utilisateur;

import View.Login;
import View.Matchs;

import java.util.ArrayList;

public class ControleurUser {
	private ArrayList<Utilisateur> utilisateurs;
	private Login login;
	private Matchs matchsView;
	
	public ControleurUser(Login login, Matchs matchsView)
	{
		this.login = login;
		this.matchsView = matchsView;
		this.utilisateurs = new ArrayList<>();
		initializeUtilisateur();
	}
	
	
	public void Connection()
	{
	    String inputUsername = login.getUsername();
	    String inputPassword = login.getPassword();
	    
	    for (Utilisateur utilisateur : utilisateurs) {
	        System.out.println("Vérification de l'utilisateur : " + utilisateur.getUsername());
	        if (utilisateur.getUsername().equals(inputUsername) && utilisateur.getPassword().equals(inputPassword)) {
	            System.out.println("Connexion réussie pour l'utilisateur : " + utilisateur.getUsername());
	            login.setVisible(false); 
	            matchsView.setVisible(true);
	            return;
	        }
	    }
	    System.out.println("Échec de la connexion : nom d'utilisateur ou mot de passe incorrect");
	}
	
	public void initializeUtilisateur()
	{
		utilisateurs.add(new Utilisateur("COLIN", 21, 178, "matt", "coco", 0));
        utilisateurs.add(new Utilisateur("GENOVESIO", 21, 181, "tony", "geno", 0));
        utilisateurs.add(new Utilisateur("ADMIN", 50, 200, "admin", "admin", 1));
	}
}
