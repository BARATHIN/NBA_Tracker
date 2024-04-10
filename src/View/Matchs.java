package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Controleur.ControleurMatchs;

public class Matchs extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tableMatches;
	private DefaultTableModel model; // Ajouté comme attribut pour y accéder dans Ajouter_Match
    
    private JButton btnNewMatch;
	private ControleurMatchs controleur;

    public Matchs() {
    	
    	
        // Configuration initiale du JFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matth\\Desktop\\A4\\UML\\Workspace\\NBA_Tracker\\src\\View\\logo-NBA.jpg"));
        setTitle("NBA Tracker : Matchs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 550);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0)); // Utilisez BorderLayout pour gérer les composants
        setContentPane(contentPane);

        // Créez le modèle pour la JTable avec les noms de colonnes
        String[] columnNames = {"Équipe à domicile", "Score Domicile", "Score Visiteur", "Équipe visiteur"};
        this.model = new DefaultTableModel(columnNames, 0);
        
        // Créez la JTable avec le modèle
        tableMatches = new JTable(model);
        
        // Remplissez le modèle avec des données de test
        // Note: Vous remplirez ce modèle avec des données réelles de vos matchs
        //Ajouter_Match("Denver", "Miami", 131, 125);
        
        // Ajustez les largeurs de colonnes
        tableMatches.getColumnModel().getColumn(0).setPreferredWidth(175); // Équipe à domicile
        tableMatches.getColumnModel().getColumn(1).setPreferredWidth(25); // Score
        tableMatches.getColumnModel().getColumn(2).setPreferredWidth(25); // Score
        tableMatches.getColumnModel().getColumn(3).setPreferredWidth(175); // Équipe visiteur
        
        // Ajoutez la JTable dans un JScrollPane (pour les en-têtes de colonnes et la capacité de défilement)
        JScrollPane scrollPane = new JScrollPane(tableMatches);
        contentPane.add(scrollPane, BorderLayout.CENTER); // Ajoutez le JScrollPane au centre du contentPane
        
        // Bouton pour créer un nouveau match
        btnNewMatch = new JButton("Nouveau Match");
        btnNewMatch.addActionListener(e -> controleur.ouvrirNouveauMatch());
        contentPane.add(btnNewMatch, BorderLayout.SOUTH);
        
    }
    public void Ajouter_Match(String EquipeDomicile, String EquipeVisiteur, int scoreDomicile, int scoreVisiteur)
    {
    	try {
			model.addRow(new Object[]{EquipeDomicile, scoreDomicile, scoreVisiteur, EquipeVisiteur});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void setControleur(ControleurMatchs controleur) {
        this.controleur = controleur;
    }
}