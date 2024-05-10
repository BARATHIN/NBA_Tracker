package View;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

import Controleur.ControleurMatchs;



public class MatchStats extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    
    private ControleurMatchs controleur;

    public MatchStats() {
    	// Configuration initiale du JFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\\\Users\\\\matth\\\\Desktop\\\\A4\\\\UML\\\\Workspace\\\\NBA_Tracker\\\\src\\\\View\\\\logo-NBA.jpg"));
        setTitle("NBA Tracker : Statistiques Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 550);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Panel InfoMatch avec Absolute Layout
        JPanel InfoMatch = new JPanel(null); // set layout to null for absolute positioning
        InfoMatch.setBackground(new Color(192, 192, 192));
        InfoMatch.setBounds(10, 10, 400, 180); // adjust dimensions as needed
        contentPane.add(InfoMatch);

        // Configure and add components to InfoMatch
        // ID Match label and text field
        JLabel lblIDMatch = new JLabel("ID match :");
        lblIDMatch.setBounds(10, 10, 60, 20);
        InfoMatch.add(lblIDMatch);

        JTextField txtIDMatch = new JTextField();
        txtIDMatch.setEditable(false);
        txtIDMatch.setBounds(65, 10, 100, 20);
        InfoMatch.add(txtIDMatch);

        // Date label and text field
        JLabel lblDate = new JLabel("Date :");
        lblDate.setBounds(200, 10, 40, 20);
        InfoMatch.add(lblDate);

        JTextField txtDate = new JTextField();
        txtDate.setEditable(false);
        txtDate.setBounds(240, 10, 100, 20);
        InfoMatch.add(txtDate);
        
        JLabel lblEquipeDomicile = new JLabel("Equipe à domicile :");
        lblEquipeDomicile.setBounds(10, 45, 150, 20);
        InfoMatch.add(lblEquipeDomicile);

        JTextField txtEquipeDomicile = new JTextField();
        txtEquipeDomicile.setEditable(false);
        txtEquipeDomicile.setBounds(160, 45, 200, 20);
        InfoMatch.add(txtEquipeDomicile);

        JLabel lblEquipeVisiteur = new JLabel("Equipe visiteur :");
        lblEquipeVisiteur.setBounds(10, 80, 150, 20);
        InfoMatch.add(lblEquipeVisiteur);

        JTextField txtEquipeVisiteur = new JTextField();
        txtEquipeVisiteur.setEditable(false);
        txtEquipeVisiteur.setBounds(160, 80, 200, 20);
        InfoMatch.add(txtEquipeVisiteur);

        JLabel lblScoreDomicile = new JLabel("Score equipe à domicile :");
        lblScoreDomicile.setBounds(10, 115, 150, 20);
        InfoMatch.add(lblScoreDomicile);

        JTextField txtScoreDomicile = new JTextField();
        txtScoreDomicile.setEditable(false);
        txtScoreDomicile.setBounds(160, 115, 200, 20);
        InfoMatch.add(txtScoreDomicile);

        JLabel lblScoreVisiteur = new JLabel("Score equipe visiteur :");
        lblScoreVisiteur.setBounds(10, 150, 150, 20);
        InfoMatch.add(lblScoreVisiteur);

        JTextField txtScoreVisiteur = new JTextField();
        txtScoreVisiteur.setEditable(false);
        txtScoreVisiteur.setBounds(160, 150, 200, 20);
        InfoMatch.add(txtScoreVisiteur);
        
        
        // Panel MVP
        JPanel MVP = new JPanel(null);
        MVP.setBackground(new Color(192, 192, 192));
        MVP.setBounds(425, 10, 400, 180);
        getContentPane().add(MVP);

        JLabel lblMVP = new JLabel("MVP");
        lblMVP.setBackground(new Color(255, 255, 255));
        lblMVP.setHorizontalAlignment(JLabel.CENTER);
        lblMVP.setBounds(10, 5, 380, 20);
        MVP.add(lblMVP);

        JLabel lblMVPNom = new JLabel("Nom :");
        lblMVPNom.setBounds(10, 35, 50, 20);
        MVP.add(lblMVPNom);

        JTextField txtMVPNom = new JTextField();
        txtMVPNom.setEditable(false);
        txtMVPNom.setBounds(70, 35, 100, 20);
        MVP.add(txtMVPNom);

        JLabel lblMVPPrenom = new JLabel("Prénom :");
        lblMVPPrenom.setBounds(205, 35, 60, 20);
        MVP.add(lblMVPPrenom);

        JTextField txtMVPPrenom = new JTextField();
        txtMVPPrenom.setEditable(false);
        txtMVPPrenom.setBounds(275, 35, 115, 20);
        MVP.add(txtMVPPrenom);    
        
        JLabel lblMVPPoints = new JLabel("Points :");
        lblMVPPoints.setBounds(10, 65, 50, 20);
        MVP.add(lblMVPPoints);

        JTextField txtMVPPoints = new JTextField();
        txtMVPPoints.setEditable(false);
        txtMVPPoints.setBounds(70, 65, 100, 20);
        MVP.add(txtMVPPoints);

        JLabel lblMVPRebonds = new JLabel("Rebonds :");
        lblMVPRebonds.setBounds(205, 65, 60, 20);
        MVP.add(lblMVPRebonds);

        JTextField txtMVPRebonds = new JTextField();
        txtMVPRebonds.setEditable(false);
        txtMVPRebonds.setBounds(275, 65, 115, 20);
        MVP.add(txtMVPRebonds);
        
        JLabel lblMVPPasses = new JLabel("Passes Décisives :");
        lblMVPPasses.setBounds(10, 100, 90, 20);
        MVP.add(lblMVPPasses);

        JTextField txtMVPPasses = new JTextField();
        txtMVPPasses.setEditable(false);
        txtMVPPasses.setBounds(110, 100, 60, 20);
        MVP.add(txtMVPPasses);

        JLabel lblMVPInter = new JLabel("Interceptions :");
        lblMVPInter.setBounds(205, 100, 77, 20);
        MVP.add(lblMVPInter);

        JTextField txtMVPinter = new JTextField();
        txtMVPinter.setEditable(false);
        txtMVPinter.setBounds(300, 100, 90, 20);
        MVP.add(txtMVPinter);
        
        JLabel lblMVPContres = new JLabel("Contres :");
        lblMVPContres.setBounds(10, 135, 50, 20);
        MVP.add(lblMVPContres);

        JTextField txtMVPContres = new JTextField();
        txtMVPContres.setEditable(false);
        txtMVPContres.setBounds(70, 135, 100, 20);
        MVP.add(txtMVPContres);

        JLabel lblMVPMinutes = new JLabel("Minutes :");
        lblMVPMinutes.setBounds(205, 135, 60, 20);
        MVP.add(lblMVPMinutes);

        JTextField txtMVPMinutes = new JTextField();
        txtMVPMinutes.setEditable(false);
        txtMVPMinutes.setBounds(275, 135, 115, 20);
        MVP.add(txtMVPMinutes);
        
        
        // Equipe à Domicile
        JPanel EquipeDomicile = new JPanel();
        EquipeDomicile.setBackground(new Color(192, 192, 192));
        EquipeDomicile.setBounds(10, 200, 400, 300);
        getContentPane().add(EquipeDomicile);
        EquipeDomicile.setLayout(null);


        JLabel lblEquipeaDomicile = new JLabel("Equipe à domicile :");
        lblEquipeaDomicile.setBounds(10, 5, 100, 20);
        EquipeDomicile.add(lblEquipeaDomicile);
        
        JTextField txtEquipeaDomicile = new JTextField();
        txtEquipeaDomicile.setEditable(false);
        txtEquipeaDomicile.setBounds(125, 5, 100, 20);
        EquipeDomicile.add(txtEquipeaDomicile);

        String[] columnNamesDomiciles = {"Nom", "Prénom", "Temps", "Points", "Rebonds", "Passes"};
        DefaultTableModel modelDomicile = new DefaultTableModel(columnNamesDomiciles, 0);
        JTable tableDomicile = new JTable(modelDomicile);
     
        modelDomicile.addRow(new Object[]{"Nom1", "Prénom1", "30", "20", "10", "5"});

        JScrollPane scrollPaneDomicile = new JScrollPane(tableDomicile);
        scrollPaneDomicile.setBounds(10, 30, 380, 260);
        EquipeDomicile.add(scrollPaneDomicile);


        // Equipe Visiteur
        JPanel EquipeVisiteur = new JPanel();
        EquipeVisiteur.setBackground(new Color(192, 192, 192));
        EquipeVisiteur.setBounds(425, 200, 400, 300);
        getContentPane().add(EquipeVisiteur);
        EquipeVisiteur.setLayout(null);

        JLabel lblEquipeaVisiteur = new JLabel("Equipe Visiteur :");
        lblEquipeaVisiteur.setBounds(10, 5, 100, 20);
        EquipeVisiteur.add(lblEquipeaVisiteur);
        
        JTextField txtEquipeaVisiteur = new JTextField();
        txtEquipeaVisiteur.setEditable(false);
        txtEquipeaVisiteur.setBounds(125, 5, 100, 20);
        EquipeVisiteur.add(txtEquipeaVisiteur);

        String[] columnNamesVisiteur = {"Nom", "Prénom", "Temps", "Points", "Rebonds", "Passes"};
        DefaultTableModel modelVisiteur = new DefaultTableModel(columnNamesVisiteur, 0);
        JTable tableVisiteur = new JTable(modelDomicile);


        modelDomicile.addRow(new Object[]{"Nom1", "Prénom1", "30", "20", "10", "5"});

        JScrollPane scrollPaneVisiteur = new JScrollPane(tableVisiteur);
        scrollPaneVisiteur.setBounds(10, 30, 380, 260);
        EquipeVisiteur.add(scrollPaneVisiteur);   
    }
    public void setControleur(ControleurMatchs controleur) {
        this.controleur = controleur;
    }
}

