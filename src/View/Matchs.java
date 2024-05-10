package View;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import Controleur.ControleurMatchs;
import Metier.Match;

public class Matchs extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tableMatches;
    private DefaultTableModel model;
    private JButton btnNewMatch;
    private ControleurMatchs controleur;
    private JSplitPane splitPane;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JButton btnCreateTeam;
    private JList<String> listRanking;

    public Matchs() {
        initializeFrame();
        initializeTables();
        initializeRightPanel();
    }

    private void initializeFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/View/logo-NBA.jpg"));
        setTitle("NBA Tracker : Matchs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 950, 550);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

    private void initializeTables() {
        String[] columnNames = {"Équipe à domicile", "Score Domicile", "Score Visiteur", "Équipe visiteur"};
        this.model = new DefaultTableModel(columnNames, 0);
        tableMatches = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tableMatches);

        leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(scrollPane, BorderLayout.CENTER);

        btnNewMatch = new JButton("Nouveau Match");
        btnNewMatch.addActionListener(e -> controleur.ouvrirNouveauMatch());
        leftPanel.add(btnNewMatch, BorderLayout.SOUTH);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, null);
        splitPane.setDividerSize(0);  // Le séparateur ne sera pas visible
        splitPane.setEnabled(false);  // Empêche le déplacement du séparateur
        contentPane.add(splitPane, BorderLayout.CENTER);
    }

    private void initializeRightPanel() {
        rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        listRanking = new JList<>();
        listRanking.setBorder(BorderFactory.createTitledBorder("Classement"));
        rightPanel.add(new JScrollPane(listRanking), BorderLayout.CENTER);

        btnCreateTeam = new JButton("Créer une Équipe");
        btnCreateTeam.addActionListener(e -> controleur.NewEquipe());
        rightPanel.add(btnCreateTeam, BorderLayout.SOUTH);

        splitPane.setRightComponent(rightPanel);
    }

    public void Ajouter_Match(String EquipeDomicile, String EquipeVisiteur, int scoreDomicile, int scoreVisiteur) {
        model.addRow(new Object[]{EquipeDomicile, scoreDomicile, scoreVisiteur, EquipeVisiteur});
    }
    
	public void Ajouter_Match_str(Match match)
    {
		try {
			model.addRow(new Object[]{match.getEquipeDomicile(), match.getScoreDomicile(), match.getScoreVisiteur(), match.getEquipeVisiteur()});
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setControleur(ControleurMatchs controleur) {
        this.controleur = controleur;
    }
}
